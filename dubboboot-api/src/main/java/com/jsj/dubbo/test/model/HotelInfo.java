package com.jsj.dubbo.test.model;

import com.jsj.dubbo.test.base.MyBatisModelBase;

public class HotelInfo extends MyBatisModelBase {
    private Integer id;

    private String hotelid;

    private String cityid;

    private String hotelname;

    private String json;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHotelid() {
        return hotelid;
    }

    public void setHotelid(String hotelid) {
        this.hotelid = hotelid == null ? null : hotelid.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getHotelname() {
        return hotelname;
    }

    public void setHotelname(String hotelname) {
        this.hotelname = hotelname == null ? null : hotelname.trim();
    }

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json == null ? null : json.trim();
    }
}