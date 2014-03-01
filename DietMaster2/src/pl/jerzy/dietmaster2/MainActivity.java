package pl.jerzy.dietmaster2;

import java.security.PublicKey;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends Activity {
	GridView foodPortionsGrid;
	ImageAdapterPortionsAvailable adapter = new ImageAdapterPortionsAvailable(
			this);

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		foodPortionsGrid = (GridView) findViewById(R.id.foodPortions);
		foodPortionsGrid.setAdapter(adapter);
		foodPortionsGrid.setOnItemClickListener(new OnItemClickListener() {
			public void onItemClick(AdapterView<?> parent, View v,
					int position, long id) {
				// Toast.makeText(MainActivity.this, "" + position,
				// Toast.LENGTH_SHORT).show();
				adapter.noticeShortClickChange(position);

			}
		});

		foodPortionsGrid
				.setOnItemLongClickListener(new OnItemLongClickListener() {

					@Override
					public boolean onItemLongClick(AdapterView<?> arg0,
							View arg1, int position, long id) {
						adapter.noticeLongClickChange(position);
						return false;
					}
				});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
