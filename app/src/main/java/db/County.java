package db;

import org.litepal.crud.LitePalSupport;

/**
 * Package: db
 * Name: County
 * Author: yangmingfu
 * Create Time：2020/4/13
 * Description：
 */
public class County extends LitePalSupport {

    private int id;

    private String countyName;

    private int weatherId;

    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
}
