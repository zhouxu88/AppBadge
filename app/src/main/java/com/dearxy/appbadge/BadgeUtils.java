package com.dearxy.appbadge;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/**
 * Created by 周旭 on 2017/4/12.
 * Android原生方式设置角标
 */

public class BadgeUtils {
    private static final String INTENT_ACTION = "android.intent.action.BADGE_COUNT_UPDATE";
    private static final String INTENT_EXTRA_BADGE_COUNT = "badge_count";
    private static final String INTENT_EXTRA_PACKAGENAME = "badge_count_package_name";
    private static final String INTENT_EXTRA_ACTIVITY_NAME = "badge_count_class_name";

    //设置角标
    public static void setBadgeCount(Context context, int badgeCount) {
        Intent intent = new Intent(INTENT_ACTION);
        intent.putExtra(INTENT_EXTRA_BADGE_COUNT, badgeCount);
        intent.putExtra(INTENT_EXTRA_PACKAGENAME, getComponentName(context).getPackageName());
        intent.putExtra(INTENT_EXTRA_ACTIVITY_NAME, getComponentName(context).getClassName());
        context.sendBroadcast(intent);
    }

    //清除角标
    public static void removeBadge(Context context){
        setBadgeCount(context,0);
    }

    //获取ComponentName
    private static ComponentName getComponentName(Context context) {
        return context.getApplicationContext().getPackageManager()
                .getLaunchIntentForPackage(context.getApplicationContext().getPackageName())
                .getComponent();
    }
}
