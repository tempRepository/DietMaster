package pl.jerzy.dietmaster2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class QuantitySetter extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quantity_setter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quantity_setter, menu);
		return true;
	}

}
