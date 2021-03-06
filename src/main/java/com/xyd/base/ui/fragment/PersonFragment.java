package com.xyd.base.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;

import com.xyd.R;
import com.xyd.base.BaseFragment;

/**
 * Created by Administrator on 2016/7/22.
 */
public class PersonFragment extends BaseFragment implements View.OnClickListener{

    private Button nextButton;
    private FragmentManager fragmentManager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.person_fragment, null);
        nextButton = (Button)view.findViewById(R.id.next);
        nextButton.setOnClickListener(this);
        return view;
    }
    @Override
    public String initContent() {
        return "个人信息";
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        fragmentManager = getActivity().getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        Fragment fragment;
        RadioButton personRadio =  (RadioButton)getActivity().findViewById(R.id.person_radio);
        RadioButton professionRadio =  (RadioButton)getActivity().findViewById(R.id.profession_radio);
        RadioButton relationshipRadio =  (RadioButton)getActivity().findViewById(R.id.relationship_radio);
        switch (v.getId()) {
            case R.id.next:
                personRadio.setTextColor(getResources().getColor(R.color.black));
                professionRadio.setTextColor(getResources().getColor(R.color.green));
                relationshipRadio.setTextColor(getResources().getColor(R.color.black));
                fragment = new ProfessionFragment();
                transaction.replace(R.id.idcard_content, fragment);
                transaction.commit();
                break;
        }
    }
}
