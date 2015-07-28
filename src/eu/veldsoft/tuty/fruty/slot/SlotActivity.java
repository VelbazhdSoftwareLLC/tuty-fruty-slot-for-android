package eu.veldsoft.tuty.fruty.slot;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class SlotActivity extends Activity {

	/**
	 * Internal game model instance.
	 */
	private GameScreen gameScreen = new GameScreen();

	private void update() {
		((TextView) findViewById(R.id.single_bet_value)).setText(""
				+ gameScreen.getBet().getValue());
		((TextView) findViewById(R.id.active_lines_value)).setText(""
				+ gameScreen.getSelector().numberOfSelectedLines());
		((TextView) findViewById(R.id.total_bet_value)).setText(""
				+ (gameScreen.getBet().getValue() * gameScreen.getSelector()
						.numberOfSelectedLines()));
		((TextView) findViewById(R.id.winner_paied_value)).setText(""
				+ gameScreen.getPaid().getValue());
		((TextView) findViewById(R.id.credit_value)).setText(""
				+ gameScreen.getCredit().getValue());

		// TODO Update symbols.
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_slot);

		Typeface typeface = Typeface.createFromAsset(getAssets(),
				getResources().getString(R.string.digits_font_path));
		((TextView) findViewById(R.id.single_bet_value)).setTypeface(typeface);
		((TextView) findViewById(R.id.active_lines_value))
				.setTypeface(typeface);
		((TextView) findViewById(R.id.total_bet_value)).setTypeface(typeface);
		((TextView) findViewById(R.id.winner_paied_value))
				.setTypeface(typeface);
		((TextView) findViewById(R.id.credit_value)).setTypeface(typeface);

		((Button) findViewById(R.id.spin_button))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						gameScreen.spinReels();
						update();
					}
				});

		((Button) findViewById(R.id.lines_button))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						gameScreen.numberOfLinesChange();
						update();
					}
				});

		((Button) findViewById(R.id.bet_button))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						gameScreen.betChange();
						update();
					}
				});

		((Button) findViewById(R.id.max_bet_button))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						gameScreen.maxBetChange();
						update();
					}
				});

		((Button) findViewById(R.id.autoplay_button))
				.setOnClickListener(new View.OnClickListener() {
					@Override
					public void onClick(View v) {
						// TODO gameScreen.autoplayChange();
						update();
					}
				});
		
		update();
	}

	@Override
	protected void onDestroy() {
		super.onDestroy();
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
			gameScreen.addCredit(1000);
			// TODO Show inner banner activity.
			update();
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
