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
public class PayActivity extends BaseActivity implements View.OnClickListener{

    private ImageView payReturnImage;
    private Button paySuccessButton;
    private String callIntent;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pay_activity);
        TextView textView = (TextView)findViewById(R.id.txt_content);
        textView.setText(initContent());
        callIntent = getIntent().getStringExtra("call");
        payReturnImage = (ImageView)findViewById(R.id.pay_return);
        payReturnImage.setOnClickListener(this);
        paySuccessButton = (Button) findViewById(R.id.pay_success);
        paySuccessButton.setOnClickListener(this);
    }
    @Override
    public String initContent() {
        return "账单支付";
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                if(callIntent.equals("notreture")){
                    Intent intent_return = new Intent();
                    intent_return.setClass(PayActivity.this,ReturnMoneyActivity.class);
                    startActivity(intent_return);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }else if(callIntent.equals("givemoney")){
                    Intent intent_return = new Intent();
                    intent_return.setClass(PayActivity.this,BorrowRecordActivity.class);
                    startActivity(intent_return);
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
            case R.id.pay_return:
                if(callIntent.equals("notreture")){
                    Intent intent_return = new Intent();
                    intent_return.setClass(PayActivity.this,ReturnMoneyActivity.class);
                    startActivity(intent_return);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }else if(callIntent.equals("givemoney")){
                    Intent intent_return = new Intent();
                    intent_return.setClass(PayActivity.this,BorrowRecordActivity.class);
                    startActivity(intent_return);
                    overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                }

                break;
            case R.id.pay_success:
                Intent intent_home = new Intent();
                intent_home.setClass(PayActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
    }
}
