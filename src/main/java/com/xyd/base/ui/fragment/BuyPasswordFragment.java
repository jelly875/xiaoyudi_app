package com.xyd.base.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.xyd.R;
import com.xyd.base.BaseFragment;

/**
 * Created by Administrator on 2016/7/22.
 */
public class BuyPasswordFragment extends BaseFragment implements View.OnClickListener{

    private Button resetButton;
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.buy_password_fragment, null);

        resetButton = (Button) view.findViewById(R.id.reset);
        resetButton.setOnClickListener(this);
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
            case R.id.reset:
                break;
        }
    }
}
