package com.sunnyweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Package: com.sunnyweather.android.gson
 * Name: Suggestion
 * Author: yangmingfu
 * Create Time：2020/4/26
 * Description：
 */
public class Suggestion {

    @SerializedName("comf")
    public Comfort comfort;

    @SerializedName("cw")
    public CarWash carWash;

    public Sport sport;

    public class Comfort{

        @SerializedName("txt")
        public String info;

    }

    public class CarWash{

        @SerializedName("txt")
        public String info;

    }

    public class Sport{

        @SerializedName("txt")
        public String info;
    }
}
