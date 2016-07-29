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
import com.xyd.base.ui.InfoActivity;

public class AboutMeFragment extends BaseFragment implements View.OnClickListener{
    private ImageView infoImage;
    private LinearLayout bankcardLayout;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.aboutme_fragment, null);
        TextView textView = (TextView) view.findViewById(R.id.txt_content);
        infoImage = (ImageView) view.findViewById(R.id.info);
        infoImage.setOnClickListener(this);
        bankcardLayout = (LinearLayout) view.findViewById(R.id.bank_card);
        bankcardLayout.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
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
        }
    }
}
