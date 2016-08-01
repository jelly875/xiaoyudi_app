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
import com.xyd.base.ui.fragment.BuyPasswordFragment;
import com.xyd.base.ui.fragment.LoginPasswordFragment;


public class SecureInfoActivity extends BaseActivity implements View.OnClickListener{


    private ImageView returnButton;

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;
    private RadioButton loginPasswordRadio,buyPasswordRadio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secure_info_activity);
        fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.secure_tab);
        loginPasswordRadio =  (RadioButton) findViewById(R.id.login_password_radio);
        buyPasswordRadio =  (RadioButton) findViewById(R.id.buy_password_radio);
        loginPasswordRadio.setTextColor(getResources().getColor(R.color.green));
        buyPasswordRadio.setTextColor(getResources().getColor(R.color.black));

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = new LoginPasswordFragment();
        transaction.replace(R.id.secure_content, fragment);
        transaction.commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                if(checkedId ==loginPasswordRadio.getId()){
                    loginPasswordRadio.setTextColor(getResources().getColor(R.color.green));
                    buyPasswordRadio.setTextColor(getResources().getColor(R.color.black));
                    Fragment fragment = new LoginPasswordFragment();
                    transaction.replace(R.id.secure_content, fragment);
                }else if(checkedId ==buyPasswordRadio.getId()){
                    loginPasswordRadio.setTextColor(getResources().getColor(R.color.black));
                    buyPasswordRadio.setTextColor(getResources().getColor(R.color.green));
                    Fragment fragment = new BuyPasswordFragment();
                    transaction.replace(R.id.secure_content, fragment);
                }
                transaction.commit();
            }
        });
        TextView textView = (TextView) findViewById(R.id.txt_content);
        textView.setText(initContent());
        returnButton = (ImageView)findViewById(R.id.secure_info_return);
        returnButton.setOnClickListener(this);


    }
    @Override
    public String initContent() {
        return "修改安全密码";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent intent_login = new Intent();
                intent_login.setClass(SecureInfoActivity.this,HomeActivity.class);
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
            case R.id.secure_info_return:
                Intent intent_home = new Intent();
                intent_home.setClass(SecureInfoActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);

        }
    }
}
