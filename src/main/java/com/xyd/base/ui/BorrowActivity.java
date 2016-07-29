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
 * Created by Administrator on 2016/7/22.
 */
public class BorrowActivity extends BaseActivity implements View.OnClickListener{

    private ImageView borrowReturnImage,borrowRecordImage;
    private Button applyButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borrow_activity);
        TextView textView = (TextView)findViewById(R.id.txt_content);
        borrowReturnImage = (ImageView)findViewById(R.id.borrow_return);
        borrowReturnImage.setOnClickListener(this);
        borrowRecordImage = (ImageView)findViewById(R.id.borrow_record);
        borrowRecordImage.setOnClickListener(this);
        applyButton = (Button)findViewById(R.id.apply);
        applyButton.setOnClickListener(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent aboutme_login = new Intent();
                aboutme_login.setClass(BorrowActivity.this,HomeActivity.class);
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
            case R.id.borrow_return:
                Intent intent_home = new Intent();
                intent_home.setClass(BorrowActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
            case R.id.apply:
                Intent intent_apply = new Intent();
                intent_apply.setClass(BorrowActivity.this,ApplyActivity.class);
                startActivity(intent_apply);
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.borrow_record:
                Intent intent_borrow = new Intent();
                intent_borrow.setClass(BorrowActivity.this,BorrowRecordActivity.class);
                startActivity(intent_borrow);
                overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;

        }
    }
}
