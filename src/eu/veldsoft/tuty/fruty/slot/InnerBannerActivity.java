package eu.veldsoft.tuty.fruty.slot;

import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;

public class InnerBannerActivity extends Activity {
	private long timeout = 0L;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_inner_banner);

		/*
		 * Activate JavaScript.
		 */
		((WebView) findViewById(R.id.in_ads)).getSettings()
				.setJavaScriptEnabled(true);

		/*
		 * Load local web page as banner holder.
		 */
		((WebView) findViewById(R.id.in_ads))
				.loadUrl("file:///android_asset/banner.html");

		/*
		 * Get splash screen timeout.
		 */
		try {
			timeout = getPackageManager().getActivityInfo(
					this.getComponentName(),
					PackageManager.GET_ACTIVITIES
							| PackageManager.GET_META_DATA).metaData.getInt(
					"timeout", 0);
		} catch (Exception e) {
			timeout = 0;
		}
	}

	@Override
	protected void onResume() {
		super.onResume();

		new Timer().schedule(new TimerTask() {
			public void run() {
				try {
					InnerBannerActivity.this.finish();
				} catch (Exception e) {
				}
			}
		}, timeout);
	}
}
