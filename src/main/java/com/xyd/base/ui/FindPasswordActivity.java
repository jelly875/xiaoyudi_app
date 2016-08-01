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
public class FindPasswordActivity extends BaseActivity implements View.OnClickListener{

    private ImageView findPasswordImage;
    private Button loginButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.findpassword_activity);
        TextView textView = (TextView) findViewById(R.id.txt_content);
        textView.setText(initContent());
        findPasswordImage = (ImageView)findViewById(R.id.findpassword_return);
        findPasswordImage.setOnClickListener(this);
        loginButton = (Button) findViewById(R.id.login_button2);
        loginButton.setOnClickListener(this);
    }
    @Override
    public String initContent() {
        return "找回密码";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent intent_register = new Intent();
                intent_register.setClass(FindPasswordActivity.this,LoginActivity.class);
                startActivity(intent_register);
                finish();
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
        return super.onKeyDown(keyCode, event);
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.findpassword_return:
                Intent intent_register = new Intent();
                intent_register.setClass(FindPasswordActivity.this,LoginActivity.class);
                startActivity(intent_register);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
            case R.id.login_button2:
                Intent intent_home = new Intent();
                intent_home.setClass(FindPasswordActivity.this,HomeActivity.class);
                intent_home.putExtra("user","logined");
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
    }
}
