package com.dearxy.appbadge;

import android.content.Context;

import me.leolin.shortcutbadger.ShortcutBadger;

/**
 * Created by 周旭 on 2017/4/12.
 * 第三方库设置APP logo角标数量的工具类（机型适配比较好）
 */

public class BadgeCountUtils {

    //设置APP logo的角标
    public static void setBadgeCount(Context context, int badgeCount) {
        ShortcutBadger.applyCount(context, badgeCount); //for 1.1.4+
    }

    //移除角标
    public static void removeBadge(Context context) {
        ShortcutBadger.removeCount(context); //for 1.1.4+
    }
}
