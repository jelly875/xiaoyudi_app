package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseActivity;
import com.xyd.base.ui.view.MyDialog;

/**
 * Created by Administrator on 2016/7/22.
 */
public class ApplyActivity extends BaseActivity implements View.OnClickListener{

    private ImageView applyReturnImage;
    private Button applyButton;
    private String[] applyStr = new String[] {
            "申请日期", "借款金额", "借款期限", "利息费用", "服务费用","到帐金额","取现卡号",
            "还款总额","截止还款日期"
    };
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.apply_activity);
        TextView textView = (TextView)findViewById(R.id.txt_content);
        applyReturnImage = (ImageView)findViewById(R.id.apply_return);
        applyReturnImage.setOnClickListener(this);
        applyButton = (Button) findViewById(R.id.apply_submit);
        applyButton.setOnClickListener(this);
        ListView infoList = (ListView)findViewById(R.id.listview);
        infoList.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, applyStr));
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent aboutme_login = new Intent();
                aboutme_login.setClass(ApplyActivity.this,BorrowActivity.class);
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
            case R.id.apply_return:
                Intent intent_home = new Intent();
                intent_home.setClass(ApplyActivity.this,BorrowActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
            case R.id.apply_submit:
                MyDialog dialog = new MyDialog(this);
                dialog.show();
                break;
        }
    }
}
