package com.example.dell.android_assignment5session5_imagetext;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by dell on 4/6/2017.
 */
public class CustomGrid extends BaseAdapter {
    Context context;
    private String[] android_names;
    private Integer[] android_img;

    public CustomGrid(Context context, String[] android_names, Integer[] android_img){

        this.context = context;
        this.android_names = android_names;
        this.android_img = android_img;
    }


    @Override
    public int getCount() {
        return android_names.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {

        View view1;
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null){
            view1 = new View(context);
            view1 = inflater.inflate(R.layout.grid_single , null);
            TextView textView = (TextView) view1.findViewById(R.id.editText);
            ImageView imageView = (ImageView) view1.findViewById(R.id.imageView);
            textView.setText(android_names[i]);
            imageView.setImageResource(android_img[i]);
        }
        else {
            view1 = convertView;
        }
        return view1;
    }
}
