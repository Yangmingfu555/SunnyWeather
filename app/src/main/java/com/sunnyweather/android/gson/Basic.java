package com.sunnyweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Package: com.sunnyweather.android.gson
 * Name: Basic
 * Author: yangmingfu
 * Create Time：2020/4/26
 * Description：
 */
public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
