package com.example.dell.android_assignment5session5_imagetext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {

    GridView gridView;
    String[] android_names = {"Gingerbread" , "Honeycomb" , "Ice cream sandwich" ,
            "Jellybean" , "Kitkat" , "Lolipop"};
    Integer[] android_img= {R.drawable.gingerbread,R.drawable.honeycomb,R.drawable.ice_cream_sandwich,
            R.drawable.jellybean,R.drawable.kitkat,R.drawable.lolipop};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CustomGrid adapter = new CustomGrid(this, android_names, android_img);
        gridView = (GridView) findViewById(R.id.gridView);
        gridView.setAdapter(adapter);
    }
}
