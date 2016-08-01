package com.xyd.base.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.xyd.R;
import com.xyd.base.BaseFragment;
import com.xyd.base.ui.HomeActivity;

/**
 * Created by Administrator on 2016/7/22.
 */
public class LoginPasswordFragment extends BaseFragment implements View.OnClickListener{

    private Button confirmButton;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.login_password_fragment, null);

        confirmButton = (Button) view.findViewById(R.id.comfirm_modify);
        confirmButton.setOnClickListener(this);
        return view;
    }
    @Override
    public String initContent() {
        return "修改安全信息";
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.comfirm_modify:
                Intent intent_pay = new Intent();
                intent_pay.setClass(getActivity(),HomeActivity.class);
                startActivity(intent_pay);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
}
