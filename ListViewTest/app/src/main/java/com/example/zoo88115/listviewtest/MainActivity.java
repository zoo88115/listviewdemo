package com.example.zoo88115.listviewtest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;


public class MainActivity extends ActionBarActivity {
    ListView listView;
    ListAdapter listAdapter;

    private final Integer[] fruitPictures = {R.drawable.apple,   R.drawable.orange,R.drawable.tomato,  R.drawable.lemon,R.drawable.peach,R.drawable.watermelon,R.drawable.cheey,R.drawable.pineapple};
    private final String[] fruit = {"Apple", "Orange", "Tomato", "Lemon","Peach","Watermelon", "Cheey", "Pineapple" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById (R.id.listView);
        listAdapter = new ListAdapter(fruitPictures,fruit);
        listView.setAdapter(listAdapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
