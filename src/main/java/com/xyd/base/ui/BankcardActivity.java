package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseActivity;

/**
 * Created by Administrator on 2016/7/22.
 */
public class BankcardActivity extends BaseActivity implements View.OnClickListener{

    private ImageView bankcardReturnImage,plusImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bankcard_activity);
        TextView textView = (TextView)findViewById(R.id.txt_content);
        bankcardReturnImage = (ImageView)findViewById(R.id.bankcard_return);
        bankcardReturnImage.setOnClickListener(this);
        plusImage = (ImageView)findViewById(R.id.plus);
        plusImage.setOnClickListener(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent aboutme_login = new Intent();
                aboutme_login.setClass(BankcardActivity.this,HomeActivity.class);
                startActivity(aboutme_login);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.bankcard_return:
                Intent intent_home = new Intent();
                intent_home.setClass(BankcardActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
            case R.id.plus:
                Intent intent_plus = new Intent();
                intent_plus.setClass(BankcardActivity.this,HomeActivity.class);
                startActivity(intent_plus);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
    }
}
