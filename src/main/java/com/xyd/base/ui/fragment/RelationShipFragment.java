package com.xyd.base.ui.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.xyd.R;
import com.xyd.base.BaseFragment;

/**
 * Created by Administrator on 2016/7/22.
 */
public class RelationShipFragment extends BaseFragment implements View.OnClickListener{
    private String[] infoStr1 = new String[] {
            "亲属联系人1", "姓名", "关系", "电话"
    };
    private String[] infoStr2 = new String[] {
            "亲属联系人1", "姓名", "关系", "电话"
    };
    private String[] infoStr3 = new String[] {
            "其他", "姓名", "关系", "电话"
    };
    private Button submitButton;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.relationship_fragment, null);
        ListView infoList1 = (ListView) view.findViewById(R.id.listview1);
        infoList1.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, infoStr1));
        ListView infoList2 = (ListView) view.findViewById(R.id.listview2);
        infoList2.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, infoStr2));
        ListView infoList3 = (ListView) view.findViewById(R.id.listview3);
        infoList3.setAdapter(new ArrayAdapter<String>(getActivity(),
                android.R.layout.simple_list_item_1, infoStr3));
        submitButton = (Button)view.findViewById(R.id.submit);
        submitButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        switch (v.getId()) {
            case R.id.submit:
                break;
        }
    }
}
