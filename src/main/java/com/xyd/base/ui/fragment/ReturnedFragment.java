package com.xyd.base.ui.fragment;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.xyd.R;
import com.xyd.base.BaseFragment;

/**
 * Created by Administrator on 2016/7/22.
 */
public class ReturnedFragment extends BaseFragment {

    private Button payButton;
    private FragmentManager fragmentManager;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.returned_fragment, null);


        return view;
    }


}
