package com.xyd.base.ui.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.xyd.R;
import com.xyd.base.BaseFragment;
import com.xyd.base.ui.IdcardIdentifyActivity;
import com.xyd.base.ui.PhoneIdentifyActivity;
import com.xyd.base.ui.PhotoIdentifyActivity;

/**
 * Created by Administrator on 2016/7/22.
 */
public class IdentifyFragment extends BaseFragment implements View.OnClickListener{

    private LinearLayout phoneIdentifyLayout;
    private LinearLayout idcardIdentifyLayout;
    private LinearLayout photoIdentifyLayout;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.identify_fragment, null);
        TextView textView = (TextView) view.findViewById(R.id.txt_content);
        phoneIdentifyLayout = (LinearLayout)view.findViewById(R.id.phone_identify);
        phoneIdentifyLayout.setOnClickListener(this);
        idcardIdentifyLayout = (LinearLayout)view.findViewById(R.id.idcard_identify);
        idcardIdentifyLayout.setOnClickListener(this);
        photoIdentifyLayout = (LinearLayout)view.findViewById(R.id.photo_identify);
        photoIdentifyLayout.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.phone_identify:
                Intent intent_phone_identify = new Intent();
                intent_phone_identify.setClass(getActivity(),PhoneIdentifyActivity.class);
                startActivity(intent_phone_identify);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.idcard_identify:
                Intent intent_idcard_identify = new Intent();
                intent_idcard_identify.setClass(getActivity(),IdcardIdentifyActivity.class);
                startActivity(intent_idcard_identify);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
            case R.id.photo_identify:
                Intent intent_photo_identify = new Intent();
                intent_photo_identify.setClass(getActivity(),PhotoIdentifyActivity.class);
                startActivity(intent_photo_identify);
                getActivity().overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);
                break;
        }
    }
}
