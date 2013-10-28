package com.gdgincheon.Hangshow.demos;

import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.widget.TextView;

import com.actionbarsherlock.app.ActionBar;
import com.actionbarsherlock.app.ActionBar.Tab;
import com.actionbarsherlock.app.SherlockActivity;

public class TabNavigation extends SherlockActivity implements ActionBar.TabListener {
    private TextView mSelected;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.Theme_Sherlock_Light_DarkActionBar); //Used for theme switching in samples
        super.onCreate(savedInstanceState);

        setContentView(R.layout.tab_navigation);
        mSelected = (TextView)findViewById(R.id.text);

        getSupportActionBar().setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

            ActionBar.Tab tech = getSupportActionBar().newTab();
            tech.setText("Technology");
            tech.setTabListener(this);
            getSupportActionBar().addTab(tech);
            
            ActionBar.Tab art = getSupportActionBar().newTab();
            art.setText("Art");
            art.setTabListener(this);
            getSupportActionBar().addTab(art);
            
            ActionBar.Tab edu = getSupportActionBar().newTab();
            edu.setText("Education");
            edu.setTabListener(this);
            getSupportActionBar().addTab(edu);

    }

    @Override
    public void onTabReselected(Tab tab, FragmentTransaction transaction) {
    }

    @Override
    public void onTabSelected(Tab tab, FragmentTransaction transaction) {
        mSelected.setText("Selected: " + tab.getText());
    }

    @Override
    public void onTabUnselected(Tab tab, FragmentTransaction transaction) {
    }
}
