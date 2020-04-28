package com.sunnyweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Package: com.sunnyweather.android.gson
 * Name: Forecast
 * Author: yangmingfu
 * Create Time：2020/4/27
 * Description：
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;



    public class Temperature{

        public String max;

        public String min;
    }

    public class More{

        @SerializedName("text_d")

        public String info;
    }
}
