package com.example.dbhook;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;

import android.util.Log;

public class Main implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        // 不是需要 Hook 的包直接返回
        if (lpparam.packageName.equals("com.soulapp.android")) {
            XposedBridge.log("Loaded app1: " + lpparam.packageName);
        }
        else{
            XposedBridge.log("Loaded app2: " + lpparam.packageName);
        }

    }
}