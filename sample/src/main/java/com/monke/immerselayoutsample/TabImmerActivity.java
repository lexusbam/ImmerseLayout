package com.monke.immerselayoutsample;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

import com.monke.immerselayout.ImmerseLinearLayout;

/**
 * 创建人：Monke
 * 创建时间：2017/2/7
 *
 * @version V1.0
 */
public class TabImmerActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_tabimmer);
    }
}
