package com.xyd.base.ui;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xyd.R;
import com.xyd.base.BaseActivity;
import com.xyd.base.ui.fragment.AboutMeFragment;
import com.xyd.base.ui.fragment.HomeFragment;
import com.xyd.base.ui.fragment.IdentifyFragment;

public class HomeActivity extends BaseActivity implements RadioGroup.OnCheckedChangeListener{

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;
    private RadioButton homeRadio;
    private RadioButton identifyRadio;
    private RadioButton personRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        fragmentManager = getSupportFragmentManager();
        findViewById();
        initView();
    }


    public void findViewById() {
        radioGroup = (RadioGroup) findViewById(R.id.xiaoyudi_tab);
        homeRadio =  (RadioButton) findViewById(R.id.home_radio);
        identifyRadio =  (RadioButton) findViewById(R.id.identify_radio);
        personRadio =  (RadioButton) findViewById(R.id.aboutme_radio);

    }

    public void initView() {
        homeRadio.setChecked(true);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = new HomeFragment();
        transaction.replace(R.id.content, fragment);
        transaction.commit();
        radioGroup.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        if (checkedId == homeRadio.getId()) {
            Fragment fragment = new HomeFragment();
            transaction.replace(R.id.content, fragment);
        } else if (checkedId == identifyRadio.getId()) {
            transaction = fragmentManager.beginTransaction();
            Fragment fragment = new IdentifyFragment();
            transaction.replace(R.id.content, fragment);
        } else if (checkedId == personRadio.getId()) {
            transaction = fragmentManager.beginTransaction();
            Fragment fragment = new AboutMeFragment();
            transaction.replace(R.id.content, fragment);
        }
        transaction.commit();
    }
}
