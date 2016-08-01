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
import com.xyd.base.ui.fragment.NotretureFragment;
import com.xyd.base.ui.fragment.ReturnedFragment;

/**
 * Created by Administrator on 2016/7/21.
 */
public class ReturnMoneyActivity extends BaseActivity implements View.OnClickListener{


    private ImageView returnButton;

    private FragmentManager fragmentManager;
    private RadioGroup radioGroup;
    private RadioButton notReturnRadio,returnedRadio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.return_money_activity);
        fragmentManager = getSupportFragmentManager();
        radioGroup = (RadioGroup) findViewById(R.id.return_tab);
        notReturnRadio =  (RadioButton) findViewById(R.id.not_return_radio);
        returnedRadio =  (RadioButton) findViewById(R.id.returned_radio);
        notReturnRadio.setTextColor(getResources().getColor(R.color.green));
        returnedRadio.setTextColor(getResources().getColor(R.color.black));

        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment = new NotretureFragment();
        transaction.replace(R.id.return_content, fragment);
        transaction.commit();

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                if(checkedId ==notReturnRadio.getId()){
                    notReturnRadio.setTextColor(getResources().getColor(R.color.green));
                    returnedRadio.setTextColor(getResources().getColor(R.color.black));
                    Fragment fragment = new NotretureFragment();
                    transaction.replace(R.id.return_content, fragment);
                }else if(checkedId ==returnedRadio.getId()){
                    notReturnRadio.setTextColor(getResources().getColor(R.color.black));
                    returnedRadio.setTextColor(getResources().getColor(R.color.green));
                    Fragment fragment = new ReturnedFragment();
                    transaction.replace(R.id.return_content, fragment);
                }
                transaction.commit();
            }
        });
        TextView textView = (TextView) findViewById(R.id.txt_content);
        textView.setText(initContent());
        returnButton = (ImageView)findViewById(R.id.return_money_return);
        returnButton.setOnClickListener(this);


    }
    @Override
    public String initContent() {
        return "我要还款";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent intent_login = new Intent();
                intent_login.setClass(ReturnMoneyActivity.this,HomeActivity.class);
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
            case R.id.return_money_return:
                Intent intent_home = new Intent();
                intent_home.setClass(ReturnMoneyActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);

            case R.id.next:

                break;
        }
    }
}
