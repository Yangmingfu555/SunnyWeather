package com.sunnyweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Package: com.sunnyweather.android.db
 * Name: County
 * Author: yangmingfu
 * Create Time：2020/4/26
 * Description：
 */
public class County extends LitePalSupport {

    private int id;

    private String countyName;

    private String weatherId;

    private int CityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public  String  getWeatherId() {
      return weatherId;

    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }
}
