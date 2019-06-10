package com.bing.plugin;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class TestActivity extends Activity {

    private String text = "666";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        Log.i("wubingzhao", "TestActivity onCreate: ");
    }

    public void onBtnClicked(View view) {
        ((TextView)view).setText("fix bug!!!"+text);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("wubingzhao", "TestActivity onDestroy: ");
    }
}
