package com.example.alquran.amol;

public class ModelAmol {

    private String number, des, source;

    public ModelAmol(String number, String des, String source) {
        this.number = number;
        this.des = des;
        this.source = source;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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
