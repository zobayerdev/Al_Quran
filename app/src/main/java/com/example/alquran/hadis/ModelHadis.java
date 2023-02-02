package com.example.alquran.hadis;

public class ModelHadis {

    private String num, des, source;

    public ModelHadis(String num, String des, String source) {
        this.num = num;
        this.des = des;
        this.source = source;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
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
