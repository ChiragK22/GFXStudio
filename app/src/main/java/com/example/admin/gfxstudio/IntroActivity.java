package com.example.admin.gfxstudio;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class IntroActivity extends AppCompatActivity {

    IntroViewPagerAdapter introViewPagerAdapter;
    TabLayout tabIndicator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        setContentView(R.layout.activity_intro);


        tabIndicator = findViewById(R.id.tab_indicator);

        List<ScreenItem> list = new ArrayList<>();
        list.add(new ScreenItem("Best Design","Material is a design system – backed by open-source code – that helps teams build high-quality digital experiences",R.drawable.google_plus));
        list.add(new ScreenItem("Best Service","Material is a design system – backed by open-source code – that helps teams build high-quality digital experiences",R.drawable.facebook));
        list.add(new ScreenItem("Easy Payment","Material is a design system – backed by open-source code – that helps teams build high-quality digital experiences",R.drawable.instagram));

        ViewPager screenPager = findViewById(R.id.intro_viewPager);
        introViewPagerAdapter = new IntroViewPagerAdapter(this, list);
        screenPager.setAdapter(introViewPagerAdapter);

        tabIndicator.setupWithViewPager(screenPager);

    }
}
