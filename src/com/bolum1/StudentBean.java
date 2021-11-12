package com.bolum1;

import java.io.Serializable;


public class StudentBean implements Serializable {

    private String adi="";
    private String soyadi="";

    public StudentBean(){
        this.adi="Adı girilmedi";
                this.soyadi="Soyadı girilmedi";
    }

    public StudentBean(String adi,String soyadi) {
        //super();
        this.adi = adi;
        this.soyadi=soyadi;
    }

    @Override
    public String toString() {
        return "StudentBean{" + "adi='" + adi + '\'' + ", soyadi='" + soyadi + '\'' + '}';
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

}
