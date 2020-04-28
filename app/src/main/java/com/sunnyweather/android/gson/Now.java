package com.sunnyweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Package: com.sunnyweather.android.gson
 * Name: Now
 * Author: yangmingfu
 * Create Time：2020/4/26
 * Description：
 */
public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More{
        @SerializedName("text")
        public String info;
    }
}
