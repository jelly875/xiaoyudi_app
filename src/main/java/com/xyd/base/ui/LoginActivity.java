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
public class LoginActivity extends BaseActivity implements View.OnClickListener{

    private ImageView loginImage;
    private TextView forgetPasswordImage;
    private Button loginButton;
    private TextView toRegisterText;
    private String callIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        callIntent = getIntent().getStringExtra("call");
        TextView textView = (TextView) findViewById(R.id.txt_content);
        textView.setText(initContent());
        loginImage = (ImageView)findViewById(R.id.login_return);
        loginImage.setOnClickListener(this);
        forgetPasswordImage = (TextView)findViewById(R.id.forget_password);
        forgetPasswordImage.setOnClickListener(this);
        loginButton = (Button) findViewById(R.id.login_button1);
        loginButton.setOnClickListener(this);
        toRegisterText = (TextView) findViewById(R.id.to_register);
        toRegisterText.setOnClickListener(this);
    }
    @Override
    public String initContent() {
        return "登录";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                if(callIntent.equals("home")){
                    Intent intent_login = new Intent();
                    intent_login.setClass(LoginActivity.this,HomeActivity.class);
                    startActivity(intent_login);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.login_return:
                if(callIntent.equals("home")){
                    Intent intent_login = new Intent();
                    intent_login.setClass(LoginActivity.this,HomeActivity.class);
                    startActivity(intent_login);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }
                break;
            case R.id.forget_password:
                Intent intent_forget_password = new Intent();
                intent_forget_password.setClass(LoginActivity.this,FindPasswordActivity.class);
                startActivity(intent_forget_password);
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.login_button1:
                Intent intent_home = new Intent();
                intent_home.setClass(LoginActivity.this,HomeActivity.class);
                intent_home.putExtra("user","logined");
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
            case R.id.to_register:
                Intent intent_to_register = new Intent();
                intent_to_register.setClass(LoginActivity.this,RegisterActivity.class);
                intent_to_register.putExtra("call","login");
                startActivity(intent_to_register);
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
}
