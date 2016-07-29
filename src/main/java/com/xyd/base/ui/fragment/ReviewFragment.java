package com.xyd.base.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.xyd.R;
import com.xyd.base.BaseFragment;
import com.xyd.base.ui.PayActivity;

/**
 * Created by Administrator on 2016/7/22.
 */
public class ReviewFragment extends BaseFragment implements View.OnClickListener{


    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.review_fragment, null);

        return view;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.pay:
                Intent intent_pay = new Intent();
                intent_pay.setClass(getActivity(),PayActivity.class);
                startActivity(intent_pay);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
}
