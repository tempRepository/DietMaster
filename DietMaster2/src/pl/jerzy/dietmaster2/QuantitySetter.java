package pl.jerzy.dietmaster2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class QuantitySetter extends Activity implements OnClickListener {
	Button dairyPlus;
	Button dairyMinus;
	Button fruitPlus;
	Button fruitMinus;
	Button grainPlus;
	Button grainMinus;
	Button meatPlus;
	Button meatMinus;
	Button oilPlus;
	Button oilMinus;
	Button sweetPlus;
	Button sweetMinus;
	Button vegetablePlus;
	Button vegetableMinus;
	Button waterPlus;
	Button waterMinus;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quantity_setter);
		dairyPlus = (Button) findViewById(R.id.dairyPlus);
		dairyMinus = (Button) findViewById(R.id.dairyMinus);
		fruitPlus = (Button) findViewById(R.id.fruitPlus);
		fruitMinus = (Button) findViewById(R.id.fruitMinus);
		grainPlus = (Button) findViewById(R.id.grainPlus);
		grainMinus = (Button) findViewById(R.id.grainMinus);
		meatPlus = (Button) findViewById(R.id.meatPlus);
		meatMinus = (Button) findViewById(R.id.meatMinus);
		oilPlus = (Button) findViewById(R.id.oilPlus);
		oilMinus = (Button) findViewById(R.id.oilMinus);
		sweetPlus = (Button) findViewById(R.id.sweetPlus);
		sweetMinus = (Button) findViewById(R.id.sweetMinus);
		vegetablePlus = (Button) findViewById(R.id.vegetablePlus);
		vegetableMinus = (Button) findViewById(R.id.vegetableMinus);
		waterPlus = (Button) findViewById(R.id.waterPlus);
		waterMinus = (Button) findViewById(R.id.waterMinus);
		dairyPlus.setOnClickListener(this);
		dairyMinus.setOnClickListener(this);
		fruitPlus.setOnClickListener(this);
		fruitMinus.setOnClickListener(this);
		grainPlus.setOnClickListener(this);
		grainMinus.setOnClickListener(this);
		meatPlus.setOnClickListener(this);
		meatMinus.setOnClickListener(this);
		oilPlus.setOnClickListener(this);
		oilMinus.setOnClickListener(this);
		sweetPlus.setOnClickListener(this);
		sweetMinus.setOnClickListener(this);
		vegetablePlus.setOnClickListener(this);
		vegetableMinus.setOnClickListener(this);
		waterPlus.setOnClickListener(this);
		waterMinus.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quantity_setter, menu);
		return true;

	}

	@Override
	public void onClick(View arg0) {
if (arg0.equals(oilMinus)) {
	findViewById(R.id.etOilQuantity).
} else {

}
		
	}

}
