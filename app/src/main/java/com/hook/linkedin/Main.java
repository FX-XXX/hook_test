package com.hook.linkedin;

import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.callbacks.XC_LoadPackage;
import de.robv.android.xposed.XposedBridge;

public class Main implements IXposedHookLoadPackage {
    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        // 不是需要 Hook 的包直接返回
        if (lpparam.packageName.equals("com.linkedin.android")) {
            XposedBridge.log("Loaded linkedin: " + lpparam.packageName);
        }
        else{
            XposedBridge.log("Loaded other: " + lpparam.packageName);
        }

    }
}