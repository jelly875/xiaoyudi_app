package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseActivity;

/**
 * Created by Administrator on 2016/7/21.
 */
public class RegisterActivity extends BaseActivity implements View.OnClickListener{

    private ImageView registerImage;
    private LinearLayout inviteCodeItem;
    private TextView haveInviteCodeText;
    private Button nextButton;
    private String callIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);
        callIntent = getIntent().getStringExtra("call");
        TextView textView = (TextView) findViewById(R.id.txt_content);
        textView.setText(initContent());
        registerImage = (ImageView)findViewById(R.id.register_return);
        registerImage.setOnClickListener(this);
        inviteCodeItem = (LinearLayout)findViewById(R.id.invite_code);
        haveInviteCodeText = (TextView)findViewById(R.id.have_invite_code);
        haveInviteCodeText.setOnClickListener(this);
        nextButton = (Button) findViewById(R.id.next);
        nextButton.setOnClickListener(this);
    }
    @Override
    public String initContent() {
        return "注册";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                if(callIntent.equals("home")){
                    Intent intent_register = new Intent();
                    intent_register.setClass(RegisterActivity.this,HomeActivity.class);
                    startActivity(intent_register);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }else if(callIntent.equals("login")){
                    Intent intent_register = new Intent();
                    intent_register.setClass(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent_register);
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
            case R.id.register_return:
                if(callIntent.equals("home")){
                    Intent intent_register = new Intent();
                    intent_register.setClass(RegisterActivity.this,HomeActivity.class);
                    startActivity(intent_register);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }else if(callIntent.equals("login")){
                    Intent intent_register = new Intent();
                    intent_register.setClass(RegisterActivity.this,LoginActivity.class);
                    startActivity(intent_register);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }
                break;
            case R.id.have_invite_code:
                if(haveInviteCodeText.getText().equals("有邀请码")){
                    inviteCodeItem.setVisibility(View.VISIBLE);
                    haveInviteCodeText.setText("无邀请码");
                }else{
                    inviteCodeItem.setVisibility(View.INVISIBLE);
                    haveInviteCodeText.setText("有邀请码");
                }
                break;
            case R.id.next:
                Intent intent_next = new Intent();
                intent_next.setClass(RegisterActivity.this,SubmitActivity.class);
                startActivity(intent_next);
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
}
