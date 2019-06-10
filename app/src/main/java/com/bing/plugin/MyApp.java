package com.bing.plugin;

import android.app.Application;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import android.widget.Toast;

import com.meituan.android.walle.WalleChannelReader;

public class MyApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        try {
            ApplicationInfo applicationInfo = getPackageManager().getApplicationInfo(getPackageName(),
                                                                                     PackageManager.GET_META_DATA);
            String channel = applicationInfo.metaData.getString("CHANNEL");
            Log.i("wubingzhao", "onCreate channel: "+channel);
            Toast.makeText(this,"channel:"+channel,Toast.LENGTH_SHORT).show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String channel = WalleChannelReader.getChannel(this);
        Log.i("wubingzhao", "onCreate walle channel: "+channel);
    }
}
