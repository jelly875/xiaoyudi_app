package com.xyd.base.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseFragment;
import com.xyd.base.ui.BankcardActivity;
import com.xyd.base.ui.BorrowActivity;
import com.xyd.base.ui.InfoActivity;
import com.xyd.base.ui.ReturnMoneyActivity;
import com.xyd.base.ui.SecureInfoActivity;

/**
 * Created by Administrator on 2016/7/22.
 */
public class AboutMeFragment extends BaseFragment implements View.OnClickListener{
    private ImageView infoImage;
    private LinearLayout bankcardLayout,borrowLayout,returnMoneyLayout,secureLayout;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aboutme_fragment, null);
        TextView textView = (TextView) view.findViewById(R.id.txt_content);
        textView.setText(initContent());
        infoImage = (ImageView) view.findViewById(R.id.info);
        infoImage.setOnClickListener(this);
        bankcardLayout = (LinearLayout) view.findViewById(R.id.bank_card);
        bankcardLayout.setOnClickListener(this);
        borrowLayout = (LinearLayout) view.findViewById(R.id.borrow);
        borrowLayout.setOnClickListener(this);
        returnMoneyLayout = (LinearLayout) view.findViewById(R.id.return_money);
        returnMoneyLayout.setOnClickListener(this);
        secureLayout = (LinearLayout) view.findViewById(R.id.secure);
        secureLayout.setOnClickListener(this);
        return view;
    }
    @Override
    public String initContent() {
        return "我";
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.info:
                Intent intent_info = new Intent();
                intent_info.setClass(getActivity(),InfoActivity.class);
                startActivity(intent_info);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.bank_card:
                Intent intent_bankcard = new Intent();
                intent_bankcard.setClass(getActivity(),BankcardActivity.class);
                startActivity(intent_bankcard);
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
            case R.id.secure:
                Intent intent_secure = new Intent();
                intent_secure.setClass(getActivity(),SecureInfoActivity.class);
                startActivity(intent_secure);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
}
