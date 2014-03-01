package pl.jerzy.dietmaster2;

import android.R.integer;
import android.content.Context;
import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListAdapter;

public class ImageAdapterPortionsAvailable extends BaseAdapter {
	private Context mContext;
	private FoodTypeQuantity foodQuantity = new FoodTypeQuantity();
	// references to our images
	private Integer[] foodIcons;
		
/*		{ R.drawable.dairy, R.drawable.fruit,
			R.drawable.grain, R.drawable.meat, R.drawable.oil,
			R.drawable.sweet, R.drawable.vegetable, R.drawable.water };*/

	public ImageAdapterPortionsAvailable(Context c) {
		mContext = c;
		// creating array with appropriate quantity of specific food type
		// portions
		foodIcons=new Integer[Math.round(foodQuantity.getAllTypesQuantity())];
		int iterator=0;
		for (int i = 0; i < foodQuantity.getDairyQuantity(); i++) {
			foodIcons[iterator]=R.drawable.dairy;
			iterator++;
		}
		for (int i = 0; i < foodQuantity.getFruitQuantity(); i++) {
			foodIcons[iterator]=R.drawable.fruit;
			iterator++;
		}
		for (int i = 0; i < foodQuantity.getGrainQuantity(); i++) {
			foodIcons[iterator]=R.drawable.grain;
			iterator++;
		}
		for (int i = 0; i < foodQuantity.getMeatQuantity(); i++) {
			foodIcons[iterator]=R.drawable.meat;
			iterator++;
		}
		for (int i = 0; i < foodQuantity.getOilQuantity(); i++) {
			foodIcons[iterator]=R.drawable.oil;
			iterator++;
		}
		for (int i = 0; i < foodQuantity.getSweetQuantity(); i++) {
			foodIcons[iterator]=R.drawable.sweet;
			iterator++;
		}
		for (int i = 0; i < foodQuantity.getVegetableQuantity(); i++) {
			foodIcons[iterator]=R.drawable.vegetable;
			iterator++;
		}
		for (int i = 0; i < foodQuantity.getWaterQuantity(); i++) {
			foodIcons[iterator]=R.drawable.water;
			iterator++;
		}
		
		

	}

	public int getCount() {
		return foodIcons.length;
	}

	public Object getItem(int position) {
		return null;
	}

	public long getItemId(int position) {
		return 0;
	}

	// create a new ImageView for each item referenced by the Adapter
	public View getView(int position, View convertView, ViewGroup parent) {
		ImageView imageView;
		if (convertView == null) { // if it's not recycled, initialize some
									// attributes
			imageView = new ImageView(mContext);
			imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
			imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
			imageView.setPadding(8, 8, 8, 8);
		} else {
			imageView = (ImageView) convertView;
		}

		imageView.setImageResource(foodIcons[position]);
		return imageView;
	}

}