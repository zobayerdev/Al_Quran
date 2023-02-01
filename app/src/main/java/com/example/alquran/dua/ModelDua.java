package com.example.alquran.dua;

public class ModelDua {

    private String dua_name, des, source;

    public ModelDua(String dua_name, String des, String source) {
        this.dua_name = dua_name;
        this.des = des;
        this.source = source;
    }

    public String getDua_name() {
        return dua_name;
    }

    public void setDua_name(String dua_name) {
        this.dua_name = dua_name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
