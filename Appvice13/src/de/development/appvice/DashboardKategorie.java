package de.development.appvice;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class DashboardKategorie extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard_kategorie);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.dashboard_kategorie, menu);
		return true;
	}

}
