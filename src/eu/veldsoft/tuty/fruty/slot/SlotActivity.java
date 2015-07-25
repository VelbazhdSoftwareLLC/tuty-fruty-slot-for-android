package eu.veldsoft.tuty.fruty.slot;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

public class SlotActivity extends Activity {

	/**
	 * Internal game model instance.
	 */
	private SlotGame game = new SlotGame();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slot);
		
		game.initialize();

		Typeface typeface = Typeface.createFromAsset(getAssets(),
				getResources().getString(R.string.digits_font_path));
		((TextView) findViewById(R.id.single_bet_value)).setTypeface(typeface);
		((TextView) findViewById(R.id.active_lines_value))
				.setTypeface(typeface);
		((TextView) findViewById(R.id.total_bet_value)).setTypeface(typeface);
		((TextView) findViewById(R.id.winner_paied_value))
				.setTypeface(typeface);
		((TextView) findViewById(R.id.credit_value)).setTypeface(typeface);
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
		
		game.finalize();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_slot, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.credit1000:
			break;
		case R.id.help:
			startActivity(new Intent(this, HelpActivity.class));
			break;
		case R.id.about:
			startActivity(new Intent(this, AboutActivity.class));
			break;
		}
		return true;
	}
}
