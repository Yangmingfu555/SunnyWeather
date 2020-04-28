package com.sunnyweather.android.gson;

/**
 * Package: com.sunnyweather.android.gson
 * Name: AQI
 * Author: yangmingfu
 * Create Time：2020/4/26
 * Description：
 */
public class AQI {

    public AQICity city;

    public class AQICity{

        public String aqi;

        public String pm25;
    }
}

