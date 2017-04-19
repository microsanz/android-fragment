package com.example.sanjaya.maps;

/**
 * Created by sanjaya on 4/7/2017.
 */

public class Lokasi {
    private String nama;
    private String lat;
    private String lng;

    public Lokasi(String nama,String lat,String lng){
        this.nama=nama;
        this.lat=lat;
        this.lng=lng;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }
}
