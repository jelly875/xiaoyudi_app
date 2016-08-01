package com.xyd.base.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
    private TextView bankSelect;
    private TextView timeSelect;
    private int num_bank = 0;
    private int num_time = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.borrow_activity);
        TextView textView = (TextView)findViewById(R.id.txt_content);
        textView.setText(initContent());
        borrowReturnImage = (ImageView)findViewById(R.id.borrow_return);
        borrowReturnImage.setOnClickListener(this);
        borrowRecordImage = (ImageView)findViewById(R.id.borrow_record);
        borrowRecordImage.setOnClickListener(this);
        applyButton = (Button)findViewById(R.id.apply);
        applyButton.setOnClickListener(this);
        bankSelect = (TextView) findViewById(R.id.bank_select);
        bankSelect.setOnClickListener(this);
        timeSelect = (TextView) findViewById(R.id.time);
        timeSelect.setOnClickListener(this);
    }
    @Override
    public String initContent() {
        return "我要借款";
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
            case R.id.bank_select:
                AlertDialog.Builder builder_bank = new AlertDialog.Builder(this);
                builder_bank.setTitle("请选择银行");
                final String[] bank = {"中国建设银行", "中国工商银行", "中国招商银行"};
                //    设置一个单项选择下拉框
                /**
                 * 第一个参数指定我们要显示的一组下拉单选框的数据集合
                 * 第二个参数代表索引，指定默认哪一个单选框被勾选上，1表示默认'女' 会被勾选上
                 * 第三个参数给每一个单选项绑定一个监听器
                 */
                builder_bank.setSingleChoiceItems(bank, num_bank, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
//                        Toast.makeText(BorrowActivity.this, "银行为：" + bank[which], Toast.LENGTH_SHORT).show();
                        num_bank = which;
                    }
                });
                builder_bank.setPositiveButton("确定", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        bankSelect.setText(bank[num_bank]);
                    }
                });
                builder_bank.setNegativeButton("取消", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                    }
                });
                builder_bank.show();
                break;
            case R.id.time:
                AlertDialog.Builder builder_time = new AlertDialog.Builder(this);
                builder_time.setTitle("请选择期限");
                final String[] time = {"1天", "2天", "3天","4天", "5天", "6天","7天", "8天", "9天", "10天",
                        "11天", "12天", "13天","14天", "15天", "16天","17天", "18天", "19天", "20天",
                        "21天", "22天", "23天","24天", "25天", "26天","27天", "28天", "29天", "30天"
                };
                //    设置一个单项选择下拉框
                /**
                 * 第一个参数指定我们要显示的一组下拉单选框的数据集合
                 * 第二个参数代表索引，指定默认哪一个单选框被勾选上，1表示默认'女' 会被勾选上
                 * 第三个参数给每一个单选项绑定一个监听器
                 */
                builder_time.setSingleChoiceItems(time, num_time, new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
//                        Toast.makeText(BorrowActivity.this, "期限为：" + time[which], Toast.LENGTH_SHORT).show();
                        num_time = which;
                    }
                });
                builder_time.setPositiveButton("确定", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {
                        timeSelect.setText(time[num_time]);
                    }
                });
                builder_time.setNegativeButton("取消", new DialogInterface.OnClickListener()
                {
                    @Override
                    public void onClick(DialogInterface dialog, int which)
                    {

                    }
                });
                builder_time.show();
                break;
        }
    }
}
