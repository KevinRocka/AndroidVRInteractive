package com.unity3d.main;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import com.unity3d.player.UnityPlayerActivity;
import com.unity3d.vrstandardassets.R;


/**
 * Created by Rocka on 16/9/9.
 */
public class UnityActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.u3d_main);
        View u3dView = mUnityPlayer.getView();
        LinearLayout ll = (LinearLayout) findViewById(R.id.u3d_ll);
        ll.addView(u3dView);
    }
}
