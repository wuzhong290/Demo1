package com.ybs.ymt;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.content.ComponentName;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private String reqData;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private String setData() {
        reqData = "调用者传递过来的数据";
        return reqData;
    }
    //点击按钮后触发调用另一个APP
    @SuppressLint("WrongConstant")
    public void onClcik(View view) {
        //要调用另一个APP的activity所在的包名
        String packageName = "com.ybs.demo_ybs";
        //要调用另一个APP的activity名字
        String activity = "com.ybs.demo_ybs.MainActivity";
        ComponentName component = new ComponentName(packageName, activity);
        Intent intent = new Intent();
        intent.setComponent(component);
        intent.setFlags(101);
        intent.putExtra("data", setData());
        startActivity(intent);
    }
}
