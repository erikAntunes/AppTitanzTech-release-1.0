package com.titanz.titanztech;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.tabs.TabLayout;

import com.titanz.titanztech.adapters.ViewPagerAdapter;
import com.titanz.titanztech.view.FragmentFirst;
import com.titanz.titanztech.view.FragmentSecond;
import com.titanz.titanztech.view.FragmentThird;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private AppBarLayout appBarLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tablayout_main_id);
        appBarLayout = findViewById(R.id.appbar_main_id);
        viewPager = findViewById(R.id.viewpager_main_id);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#000000")));


        //Adicionando Fragments

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.AddFragment(new FragmentFirst(),"First" );
        adapter.AddFragment(new FragmentSecond(),"Second" );
        adapter.AddFragment(new FragmentThird(),"Third" );

        // Adapter Setup

        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);

        changeStatusBarColor("#000000");

    }
    private void changeStatusBarColor(String color) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(color));
        }
    }
}
