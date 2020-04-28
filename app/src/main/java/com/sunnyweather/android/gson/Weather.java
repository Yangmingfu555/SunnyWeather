package com.sunnyweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Package: com.sunnyweather.android.gson
 * Name: Weather
 * Author: yangmingfu
 * Create Time：2020/4/26
 * Description：
 */
public class Weather{

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
