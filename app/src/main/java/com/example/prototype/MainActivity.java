package com.example.prototype;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.widget.GridView;


import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomappbar.BottomAppBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Toolbar toolbar;
    BottomAppBar bottomAppBar;
    CollapsingToolbarLayout collapsingToolbarLayoutAndroid;
    CoordinatorLayout rootLayoutAndroid;
    GridView gridView;
    Context context;
    ArrayList arrayList;

    public static String[] gridViewStrings = {
            "Todays Route",
            "Others Route",
            "New Retailer",
            "Verify Retailer",
            "Market Insight",
            "Reports",
            "Promotions",
            "Messages",
            "Update",
            "Logout",

    };
    public static int[] gridViewImages = {
            R.drawable.market_insight,
            R.drawable.merchandising,
            R.drawable.newcustomer,
            R.drawable.promotion,
            R.drawable.report,
            R.drawable.routes,
            R.drawable.uncover_outlet,
            R.drawable.use,
            R.drawable.verify,
            R.drawable.goods

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        gridView = (GridView) findViewById(R.id.grid);
        gridView.setAdapter(new CustomAndroidGridViewAdapter(this, gridViewStrings, gridViewImages));


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.bottom_navigation_menu,menu);
        return true;
    }
}