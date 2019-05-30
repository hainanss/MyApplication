package com.example.administrator.myapplication;

import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends BaseActivity {



    DrawerLayout mDrawerLayout;
    NavigationView mNavigationView;
    ActionBarDrawerToggle mActionBarDrawerToggle;


    @Override
    public void initView() {

        setSupportActionBar();
        setActionBarIcon(R.drawable.iom);
        setTitle("首页");

        mDrawerLayout=BindView(R.id.drawerlayout);
        mNavigationView=BindView(R.id.navigationview);

        mActionBarDrawerToggle=new ActionBarDrawerToggle(this,mDrawerLayout,mToolbar,0,0);
        mActionBarDrawerToggle.syncState();
        mDrawerLayout.addDrawerListener(mActionBarDrawerToggle);

    }

    @Override
    public int getLayout() {
        return R.layout.main;
    }

    @Override
    public void initdata() {

    }
}
