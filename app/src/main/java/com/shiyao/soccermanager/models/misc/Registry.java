package com.shiyao.soccermanager.models.misc;

import android.app.Application;
import android.content.Context;

/**
 * Created by SLiu on 8/25/2017.
 */

public class Registry extends Application {
    private static Context mContext;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
    }

    public static Context getContext() {
        return mContext;
    }
}
