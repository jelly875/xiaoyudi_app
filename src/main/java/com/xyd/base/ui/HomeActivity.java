package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.xyd.R;
import com.xyd.base.ui.fragment.AboutMeFragment;
import com.xyd.base.ui.fragment.HomeFragment;
import com.xyd.base.ui.fragment.IdentifyFragment;

/**
 * Created by Administrator on 2016/7/21.
 */
public class HomeActivity extends AppCompatActivity {

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;
    private RadioButton homeRadio,identifyRadio,aboutmeRadio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);
        fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.xiaoyudi_tab);
        homeRadio =  (RadioButton) findViewById(R.id.home_radio);
        identifyRadio =  (RadioButton) findViewById(R.id.identify_radio);
        aboutmeRadio =  (RadioButton) findViewById(R.id.aboutme_radio);
        homeRadio.setChecked(true);

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = new HomeFragment();
        transaction.replace(R.id.content, fragment);
        transaction.commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                if(checkedId ==homeRadio.getId()){
                    Fragment fragment = new HomeFragment();
                    transaction.replace(R.id.content, fragment);
                }else if(checkedId ==identifyRadio.getId()){
                    transaction = fragmentManager.beginTransaction();
                    Fragment fragment = new IdentifyFragment();
                    transaction.replace(R.id.content, fragment);
                }else if(checkedId ==aboutmeRadio.getId()){
                    transaction = fragmentManager.beginTransaction();
                    Fragment fragment = new AboutMeFragment();
                    transaction.replace(R.id.content, fragment);
                }
                transaction.commit();
            }
        });

    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);// must store the new intent unless getIntent() will return the old one
    }
}
