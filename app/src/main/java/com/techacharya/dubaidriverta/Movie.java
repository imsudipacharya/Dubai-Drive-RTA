package com.techacharya.dubaidriverta;

public class Movie {

    private String name;
    private String img;
    private String dlink;
    private  int imu;

    public Movie(String name, String img, String dlink, int imu) {
        this.name = name;
        this.img = img;
        this.dlink = dlink;
        this.imu = imu;
    }

    public Movie() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getDlink() {
        return dlink;
    }

    public void setDlink(String dlink) {
        this.dlink = dlink;
    }


    public Integer getImu() {
        return imu;
    }

    public void setImu(Integer imu) {
        this.imu = imu;
    }
}