package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseActivity;
import com.xyd.base.ui.fragment.PersonFragment;
import com.xyd.base.ui.fragment.ProfessionFragment;
import com.xyd.base.ui.fragment.RelationShipFragment;

/**
 * Created by Administrator on 2016/7/21.
 */
public class IdcardIdentifyActivity extends BaseActivity implements View.OnClickListener{


    private ImageView returnButton;

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;
    private RadioButton personRadio,professionRadio,relationshipRadio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.idcard_identify_activity);
        fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.idcard_tab);
        personRadio =  (RadioButton) findViewById(R.id.person_radio);
        professionRadio =  (RadioButton) findViewById(R.id.profession_radio);
        relationshipRadio =  (RadioButton) findViewById(R.id.relationship_radio);
        personRadio.setTextColor(getResources().getColor(R.color.green));
        professionRadio.setTextColor(getResources().getColor(R.color.black));
        relationshipRadio.setTextColor(getResources().getColor(R.color.black));
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = new PersonFragment();
        transaction.replace(R.id.idcard_content, fragment);
        transaction.commit();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                if(checkedId ==personRadio.getId()){
                    personRadio.setTextColor(getResources().getColor(R.color.green));
                    professionRadio.setTextColor(getResources().getColor(R.color.black));
                    relationshipRadio.setTextColor(getResources().getColor(R.color.black));
                    Fragment fragment = new PersonFragment();
                    transaction.replace(R.id.idcard_content, fragment);
                }else if(checkedId ==professionRadio.getId()){
                    personRadio.setTextColor(getResources().getColor(R.color.black));
                    professionRadio.setTextColor(getResources().getColor(R.color.green));
                    relationshipRadio.setTextColor(getResources().getColor(R.color.black));
                    Fragment fragment = new ProfessionFragment();
                    transaction.replace(R.id.idcard_content, fragment);
                }else if(checkedId ==relationshipRadio.getId()){
                    personRadio.setTextColor(getResources().getColor(R.color.black));
                    professionRadio.setTextColor(getResources().getColor(R.color.black));
                    relationshipRadio.setTextColor(getResources().getColor(R.color.green));
                    Fragment fragment = new RelationShipFragment();
                    transaction.replace(R.id.idcard_content, fragment);
                }
                transaction.commit();
            }
        });
        TextView textView = (TextView) findViewById(R.id.txt_content);
        textView.setText(initContent());
        returnButton = (ImageView)findViewById(R.id.idcard_identify_return);
        returnButton.setOnClickListener(this);


    }
    @Override
    public String initContent() {
        return "身份认证";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent intent_login = new Intent();
                intent_login.setClass(IdcardIdentifyActivity.this,HomeActivity.class);
                startActivity(intent_login);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.idcard_identify_return:
                Intent intent_home = new Intent();
                intent_home.setClass(IdcardIdentifyActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);

            case R.id.next:

                break;
        }
    }
}
