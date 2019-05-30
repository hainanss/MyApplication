package com.example.administrator.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

/**
 * Created by Administrator on 2019/5/25.
 */

public abstract class BaseActivity extends AppCompatActivity {

    Toolbar mToolbar;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        initdata();
        initView();
    }



    abstract  public  void initView();

    abstract  public int getLayout();

    abstract public  void initdata();


    protected  <T extends View> T BindView(int resid){

        return (T)findViewById(resid);
    }

    protected void setSupportActionBar(){
        mToolbar=BindView(R.id.toolbar);
        if(mToolbar!=null){
            setSupportActionBar(mToolbar);
        }
    }


    protected  void setSupportArrowActionBar(boolean isSupport){
        getSupportActionBar().setDisplayHomeAsUpEnabled(isSupport);
    }


    protected void setActionBarIcon(int resId){

        if(mToolbar!=null){
            mToolbar.setNavigationIcon(resId);
        }

    }


}
