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
public class RelationShipFragment extends BaseFragment implements View.OnClickListener{

    private Button submitButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.relationship_fragment, null);
        submitButton = (Button)view.findViewById(R.id.submit);
        submitButton.setOnClickListener(this);
        return view;
    }
    @Override
    public String initContent() {
        return "社会关系";
    }
    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.submit:
                Intent intent_submit = new Intent();
                intent_submit.setClass(getActivity(),HomeActivity.class);
                startActivity(intent_submit);
                getActivity().overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
                break;
        }
    }
}
