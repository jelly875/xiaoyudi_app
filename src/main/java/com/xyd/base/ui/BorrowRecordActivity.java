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
import com.xyd.base.ui.fragment.GiveMoneyFragment;
import com.xyd.base.ui.fragment.ReviewFragment;

/**
 * Created by Administrator on 2016/7/21.
 */
public class BorrowRecordActivity extends BaseActivity implements View.OnClickListener{


    private ImageView returnButton;

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;
    private RadioButton reviewRadio,giveMoneyRadio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borrow_record_activity);
        fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.borrow_record_tab);
        reviewRadio =  (RadioButton) findViewById(R.id.review_radio);
        giveMoneyRadio =  (RadioButton) findViewById(R.id.give_money_radio);
        reviewRadio.setTextColor(getResources().getColor(R.color.green));
        giveMoneyRadio.setTextColor(getResources().getColor(R.color.black));

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = new ReviewFragment();
        transaction.replace(R.id.return_content, fragment);
        transaction.commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                if (checkedId == reviewRadio.getId()) {
                    reviewRadio.setTextColor(getResources().getColor(R.color.green));
                    giveMoneyRadio.setTextColor(getResources().getColor(R.color.black));
                    Fragment fragment = new ReviewFragment();
                    transaction.replace(R.id.return_content, fragment);
                } else if (checkedId == giveMoneyRadio.getId()) {
                    reviewRadio.setTextColor(getResources().getColor(R.color.black));
                    giveMoneyRadio.setTextColor(getResources().getColor(R.color.green));
                    Fragment fragment = new GiveMoneyFragment();
                    transaction.replace(R.id.return_content, fragment);
                }
                transaction.commit();
            }
        });
        TextView textView = (TextView) findViewById(R.id.txt_content);
        returnButton = (ImageView)findViewById(R.id.borrow_record_return);
        returnButton.setOnClickListener(this);


    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent intent_login = new Intent();
                intent_login.setClass(BorrowRecordActivity.this,BorrowActivity.class);
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
            case R.id.borrow_record_return:
                Intent intent_home = new Intent();
                intent_home.setClass(BorrowRecordActivity.this,BorrowActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
    }
}
