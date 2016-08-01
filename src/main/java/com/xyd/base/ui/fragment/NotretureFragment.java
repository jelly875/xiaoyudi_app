package com.xyd.base.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseFragment;
import com.xyd.base.ui.PayActivity;

/**
 * Created by Administrator on 2016/7/22.
 */
public class NotretureFragment extends BaseFragment implements View.OnClickListener{

    private TextView payText;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.notreturn_fragment, null);

        payText = (TextView) view.findViewById(R.id.pay);
        payText.setOnClickListener(this);
        return view;
    }
    @Override
    public String initContent() {
        return "我要还款";
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.pay:
                Intent intent_pay = new Intent();
                intent_pay.setClass(getActivity(),PayActivity.class);
                intent_pay.putExtra("call","notreture");
                startActivity(intent_pay);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
}
