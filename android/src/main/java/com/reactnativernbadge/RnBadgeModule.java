package com.reactnativernbadge;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;

import android.content.Context;

@ReactModule(name = RnBadgeModule.NAME)
public class RnBadgeModule extends ReactContextBaseJavaModule {
    public static final String NAME = "RnBadge";
    private Context mContext;
    private BadgeUtils mBadgeUtils;

    public RnBadgeModule(ReactApplicationContext reactContext) {
        super(reactContext);
        mContext = context;
        mBadgeUtils = new BadgeUtils(context.getApplicationContext());
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }


    @ReactMethod
    public void setBadgeNumber (Integer count) {
        mBadgeUtils.setBadge(mContext, count);
    }

    @ReactMethod
    public void clearBadge (Integer count) {
        mBadgeUtils.clearBadge(mContext);
    }

    public static native int nativeMultiply(int a, int b);
}
