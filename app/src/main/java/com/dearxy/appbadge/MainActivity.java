package com.dearxy.appbadge;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * 为应用添加角标，提示用户有新的未读消息
 */
public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private static int badgeCount = 10; //角标数量


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.badge_count_reduce_btn).setOnClickListener(this);
        findViewById(R.id.badge_count_add_btn).setOnClickListener(this);
        findViewById(R.id.badge_count_reduce2_btn).setOnClickListener(this);

        //设置角标数量
        BadgeUtils.setBadgeCount(this,10);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.badge_count_reduce_btn:
                //Android原生方式 角标数量减1
                BadgeUtils.setBadgeCount(this,--badgeCount);
                finish();
                break;
            case R.id.badge_count_add_btn:
                //第三方库 角标数量加1
                BadgeCountUtils.setBadgeCount(this,++badgeCount);
                finish();
                break;
            case R.id.badge_count_reduce2_btn:
                //第三方库 角标数量减1
                BadgeCountUtils.setBadgeCount(this,--badgeCount);
                finish();
                break;
        }
    }
}
