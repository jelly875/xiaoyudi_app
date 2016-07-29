package com.xyd.base.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.xyd.R;
import com.xyd.base.BaseActivity;

public class LoadingActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loading);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent mainIntent = new Intent(LoadingActivity.this,HomeActivity.class);
                LoadingActivity.this.startActivity(mainIntent);
                LoadingActivity.this.finish();

                overridePendingTransition(R.anim.fade_in,
                        R.anim.fade_out);
            }
        }, 3000);
    }
}
