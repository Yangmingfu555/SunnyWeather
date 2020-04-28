package com.sunnyweather.android.util;


import okhttp3.OkHttpClient;
import okhttp3.Request;


/**
 * Package: util
 * Name: HttpUtil
 * Author: yangmingfu
 * Create Time：2020/4/17
 * Description：
 */
public class HttpUtil {
    public static  void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);

    }

}
