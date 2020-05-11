package com.sendbird.android.sample.main;


import android.app.Application;

import com.sendbird.android.SendBird;
import com.sendbird.android.sample.fcm.MyFirebaseMessagingService;
import com.sendbird.android.sample.utils.PreferenceUtils;
import com.sendbird.android.sample.utils.PushUtils;

public class BaseApplication extends Application {

//    private static final String APP_ID = "9DA1B1F4-0BE6-4DA8-82C5-2E81DAB56F23"; // US-1 Demo
    private static final String APP_ID = "17EEF634-D553-4778-BC7C-630D07C8B92A"; // MYH. (Assignment1) Change the new APP_ID from Sendbrid Dashboard.
    public static final String VERSION = "3.0.40";

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(getApplicationContext());

        SendBird.init(APP_ID, getApplicationContext());

        PushUtils.registerPushHandler(new MyFirebaseMessagingService());
    }
}
