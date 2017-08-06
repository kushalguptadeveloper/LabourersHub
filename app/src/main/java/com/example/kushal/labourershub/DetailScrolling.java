package com.example.kushal.labourershub;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import models.SkilledModel;

public class DetailScrolling extends AppCompatActivity {
ImageView iv;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_scrolling);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

iv= (ImageView) findViewById(R.id.image);
        tv= (TextView) findViewById(R.id.text);
        String title=getIntent().getStringExtra("title");
        ((CollapsingToolbarLayout)findViewById(R.id.toolbar_layout)).setTitle(title);
        //toolbar.setTitle(title);

        int imageResourceID=getIntent().getIntExtra("imageResourceID",0);

        String description=getIntent().getStringExtra("imageDescription");

        SkilledModel obj=new SkilledModel();
        int[] images=SkilledModel.getImages();
     //   ArrayList<SkilledModel> obj=new ArrayList<>();
        iv.setImageResource(imageResourceID);
tv.setText(description);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }
}
