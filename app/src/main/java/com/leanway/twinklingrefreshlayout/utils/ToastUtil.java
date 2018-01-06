package com.leanway.twinklingrefreshlayout.utils;

import android.widget.Toast;

import com.leanway.twinklingrefreshlayout.TkApplication;


/**
 * Created by lcodecore on 2017/2/28.
 */

public class ToastUtil {
    public static void show(String msg){
        Toast.makeText(TkApplication.appContext, msg, Toast.LENGTH_SHORT).show();
    }
}
