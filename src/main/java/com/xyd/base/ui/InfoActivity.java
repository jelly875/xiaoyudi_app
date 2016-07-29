package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseActivity;

/**
 * Created by Administrator on 2016/7/22.
 */
public class InfoActivity extends BaseActivity implements View.OnClickListener{

    private String[] infoStr = new String[] {
            "姓名", "性别", "身份证号", "手机号码", "电子邮箱","单位地址","现家庭住址"
    };
    private ImageView infoReturnImage;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.info_activity);
        TextView textView = (TextView)findViewById(R.id.txt_content);
        ListView infoList = (ListView)findViewById(R.id.listview);
        infoList.setAdapter(new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1, infoStr));
        infoReturnImage = (ImageView)findViewById(R.id.info_return);
        infoReturnImage.setOnClickListener(this);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case KeyEvent.KEYCODE_BACK:
                Intent aboutme_login = new Intent();
                aboutme_login.setClass(InfoActivity.this,HomeActivity.class);
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
            case R.id.info_return:
                Intent intent_home = new Intent();
                intent_home.setClass(InfoActivity.this,HomeActivity.class);
                startActivity(intent_home);
                overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
    }
}
