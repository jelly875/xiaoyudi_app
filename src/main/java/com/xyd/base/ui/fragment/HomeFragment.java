package com.xyd.base.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseFragment;
import com.xyd.base.ui.BorrowActivity;
import com.xyd.base.ui.LoginActivity;
import com.xyd.base.ui.RegisterActivity;
import com.xyd.base.ui.ReturnMoneyActivity;
import com.xyd.base.ui.view.InstrumentView;

import java.util.Timer;
import java.util.TimerTask;

public class HomeFragment extends BaseFragment implements View.OnClickListener {
    private Button registerButton,loginButton,applyButton;
    private String callIntent;
    private LinearLayout notLoginLayout,loginedLayout,borrowLayout,returnMoneyLayout;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment, null);
        final InstrumentView iView = (InstrumentView) view.findViewById(R.id.iView);
        final TextView txtView = (TextView) view.findViewById(R.id.txtView);
        TextView textView = (TextView) view.findViewById(R.id.txt_content);
        textView.setText(initContent());
        registerButton = (Button)view.findViewById(R.id.register);
        loginButton = (Button)view.findViewById(R.id.login);
        applyButton = (Button)view.findViewById(R.id.apply);
        applyButton.setOnClickListener(this);
        notLoginLayout = (LinearLayout)view.findViewById(R.id.not_login);
        loginedLayout = (LinearLayout)view.findViewById(R.id.logined);
        borrowLayout = (LinearLayout)view.findViewById(R.id.borrow);
        borrowLayout.setOnClickListener(this);
        returnMoneyLayout = (LinearLayout)view.findViewById(R.id.return_money);
        returnMoneyLayout.setOnClickListener(this);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                iView.setReferValue(682, new InstrumentView.RotateListener() {
                    @Override
                    public void rotate(float sweepAngle, final float value) {
                        if (getActivity() == null)
                            return;
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                txtView.setText(Math.round(value) + "");
                            }
                        });
                    }
                });
            }
        },1000);

        registerButton.setOnClickListener(this);
        loginButton.setOnClickListener(this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
        callIntent = getActivity().getIntent().getStringExtra("user");
        if(callIntent!=null){
            if(callIntent.equals("logined")){
                notLoginLayout.setVisibility(View.GONE);
                loginedLayout.setVisibility(View.VISIBLE);
            }
        }
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.register:
                registerButton.setBackgroundColor(getResources().getColor(R.color.red_press));
                registerButton.setTextColor(getResources().getColor(R.color.white));
                loginButton.setBackgroundColor(getResources().getColor(R.color.white));
                loginButton.setTextColor(getResources().getColor(R.color.red_press));
                Intent intent_register = new Intent();
                intent_register.setClass(getActivity(),RegisterActivity.class);
                intent_register.putExtra("call","home");
                startActivity(intent_register);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.login:
                registerButton.setBackgroundColor(getResources().getColor(R.color.white));
                registerButton.setTextColor(getResources().getColor(R.color.red_press));
                loginButton.setBackgroundColor(getResources().getColor(R.color.red_press));
                loginButton.setTextColor(getResources().getColor(R.color.white));
                Intent intent_login = new Intent();
                intent_login.setClass(getActivity(),LoginActivity.class);
                intent_login.putExtra("call","home");
                startActivity(intent_login);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.apply:
                applyButton.setBackgroundColor(getResources().getColor(R.color.red_press));
                Intent intent_apply = new Intent();
                intent_apply.setClass(getActivity(),BorrowActivity.class);
                startActivity(intent_apply);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.borrow:
                Intent intent_borrow = new Intent();
                intent_borrow.setClass(getActivity(),BorrowActivity.class);
                startActivity(intent_borrow);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.return_money:
                Intent intent_return_money = new Intent();
                intent_return_money.setClass(getActivity(),ReturnMoneyActivity.class);
                startActivity(intent_return_money);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
    @Override
    public String initContent() {
        return "小雨滴";
    }
}
