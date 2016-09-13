package com.unity3d.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.unity3d.vrstandardassets.R;


/**
 * Created by Rocka on 16/9/1.
 * <p/>
 *
 * Q1:Failed to initialize your hardware dose not support this applicatio
 *      如果有初始化失败的问题,注意可能是否缺少对应的x86或者armeabi-v7a的so文件
 * Q2:java.lang.ClassNotFoundException: com.google.vr.platform.unity.UnityVrActivityListener
 *      如果有找不到UnityVrActivityListener这类似问题，是因为从unity生产的依赖项目缺少文件，删除后手动从Unity项目导入aar
 *      File -> New Module -> Import Jar/Aar,选择 Assets/Plugins/gvr_android_common.aar,unitygvractivity.aar
 */
public class MainActivity extends AppCompatActivity {

    Button btnApp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnApp = (Button)findViewById(R.id.btn_vr_app);
        btnApp.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this , UnityActivity.class);
                startActivity(intent);
            }
        });
    }
}
