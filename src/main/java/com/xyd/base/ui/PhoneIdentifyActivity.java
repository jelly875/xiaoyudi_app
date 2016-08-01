package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseActivity;

/**
 * Created by Administrator on 2016/7/21.
 */
public class PhoneIdentifyActivity extends BaseActivity implements View.OnClickListener{

    private Button submitButton;
    private ImageView returnButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.phone_identify_activity);
        TextView textView = (TextView) findViewById(R.id.txt_content);
        textView.setText(initContent());
        submitButton = (Button)findViewById(R.id.confirm_submit);
        submitButton.setOnClickListener(this);
        returnButton = (ImageView)findViewById(R.id.phone_identify_return);
        returnButton.setOnClickListener(this);
    }
    @Override
    public String initContent() {
        return "手机认证";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent intent_login = new Intent();
                intent_login.setClass(PhoneIdentifyActivity.this,HomeActivity.class);
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
            case R.id.phone_identify_return:
                Intent intent_home = new Intent();
                intent_home.setClass(PhoneIdentifyActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);

            case R.id.confirm_submit:
                submitButton.setBackgroundColor(getResources().getColor(R.color.red_press));
                submitButton.setTextColor(getResources().getColor(R.color.white));
                Intent intent_submit = new Intent();
                intent_submit.setClass(PhoneIdentifyActivity.this,HomeActivity.class);
                startActivity(intent_submit);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
    }
}
