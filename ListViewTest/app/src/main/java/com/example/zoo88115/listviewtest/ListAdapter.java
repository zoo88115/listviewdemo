package com.example.zoo88115.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by zoo88115 on 2015/4/15 0015.
 */
public class ListAdapter extends BaseAdapter{
    private Context mContext;
    private static LayoutInflater inflater = null;
    Integer []fruitPictures;
    String []fruit;

    public ListAdapter(Integer []fp,String[]f){
        fruitPictures=fp;
        fruit=f;
    }

    public ListAdapter(Context c) {
        mContext = c;
        inflater = (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount() {
        return fruit.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        view = inflater.inflate(R.layout.list_item_layout, null);
        TextView text = (TextView) view.findViewById(R.id.textView);
        ImageView image = (ImageView) view.findViewById(R.id.imageView);

        image.setImageResource(fruitPictures[position]);
        text.setText(fruit[position]);

        return view;

    }
}
