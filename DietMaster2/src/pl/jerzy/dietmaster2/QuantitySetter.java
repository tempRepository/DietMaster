package pl.jerzy.dietmaster2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridView;
import android.widget.Toast;

public class QuantitySetter extends Activity {

	Button plus;
	Button minus;
	EditText quantity;
	FoodTypeQuantity foodQuantity = new FoodTypeQuantity();
	GridView foodTypeGrid;
	int selectedItemPosition = 0;

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle presses on the action bar items
		switch (item.getItemId()) {
		case R.id.next:
			Intent intent = new Intent(this, MainActivity.class);
			// intent.putExtra(EXTRA_MESSAGE, message);
			startActivity(intent);
			this.finish();
			return true;
		default:
			return super.onOptionsItemSelected(item);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu items for use in the action bar
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.to_main, menu);
		return super.onCreateOptionsMenu(menu);
	}

	private void setFoodQuantity(float quantityTemp) {
		switch (selectedItemPosition) {
		case 0:
			foodQuantity.setDairyQuantity(quantityTemp);

			break;
		case 1:
			foodQuantity.setFruitQuantity(quantityTemp);
			break;
		case 2:
			foodQuantity.setGrainQuantity(quantityTemp);
			break;
		case 3:
			foodQuantity.setMeatQuantity(quantityTemp);
			break;
		case 4:
			foodQuantity.setOilQuantity(quantityTemp);
			break;
		case 5:
			foodQuantity.setSweetQuantity(quantityTemp);
			break;
		case 6:
			foodQuantity.setVegetableQuantity(quantityTemp);
			break;
		case 7:
			foodQuantity.setWaterQuantity(quantityTemp);

		}
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quantity_setter);
		plus = (Button) findViewById(R.id.plus);
		minus = (Button) findViewById(R.id.minus);
		foodTypeGrid = (GridView) findViewById(R.id.gridview);
		quantity = (EditText) findViewById(R.id.quantity);
		plus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				float quantityTemp = Float.parseFloat(quantity.getText()
						.toString());
				quantityTemp += 0.5f;
				quantity.setText(String.valueOf(quantityTemp));
				setFoodQuantity(quantityTemp);
			}
		});

		minus.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				float quantityTemp = Float.parseFloat(quantity.getText()
						.toString());
				quantityTemp -= 0.5f;
				quantity.setText(String.valueOf(quantityTemp));
				setFoodQuantity(quantityTemp);
			}
		});
		GridView gridview = (GridView) findViewById(R.id.gridview);
		gridview.setAdapter(new ImageAdapter(this));

		gridview.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				((Button) findViewById(R.id.plus)).setEnabled(true);
				((Button) findViewById(R.id.minus)).setEnabled(true);

				selectedItemPosition = position;
				switch (position) {
				case 0:
					Log.d("myDebug", String.valueOf(foodQuantity
							.getDairyQuantity()));
					quantity.setText(String.valueOf(foodQuantity
							.getDairyQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources().getText(R.string.dairy)
											.toString(), Toast.LENGTH_SHORT)
							.show();
					break;
				case 1:
					quantity.setText(String.valueOf(foodQuantity
							.getFruitQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources().getText(R.string.fruit)
											.toString(), Toast.LENGTH_SHORT)
							.show();
					break;
				case 2:
					quantity.setText(String.valueOf(foodQuantity
							.getGrainQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources().getText(R.string.grain)
											.toString(), Toast.LENGTH_SHORT)
							.show();
					break;
				case 3:
					quantity.setText(String.valueOf(foodQuantity
							.getMeatQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources().getText(R.string.meat)
											.toString(), Toast.LENGTH_SHORT)
							.show();
					break;
				case 4:
					quantity.setText(String.valueOf(foodQuantity
							.getOilQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources().getText(R.string.oil)
											.toString(), Toast.LENGTH_SHORT)
							.show();
					break;
				case 5:
					quantity.setText(String.valueOf(foodQuantity
							.getSweetQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources().getText(R.string.sweet)
											.toString(), Toast.LENGTH_SHORT)
							.show();
					break;
				case 6:
					quantity.setText(String.valueOf(foodQuantity
							.getVegetableQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources()
											.getText(R.string.vegetable)
											.toString(), Toast.LENGTH_SHORT)
							.show();
					break;
				case 7:
					quantity.setText(String.valueOf(foodQuantity
							.getWaterQuantity()));
					Toast.makeText(
							QuantitySetter.this,
							getResources().getText(R.string.youSelected)
									.toString()
									+ " "
									+ getResources().getText(R.string.water)
											.toString(), Toast.LENGTH_SHORT)
							.show();
				default:
					break;
				}

			}
		});

	}
}
