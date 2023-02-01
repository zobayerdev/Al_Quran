package com.example.alquran.allahname;

public class ModelClass {
    private String bangla;
    private String arbi;


    public ModelClass(String bangla, String arbi) {
        this.bangla = bangla;
        this.arbi = arbi;
    }

    public String getBangla() {
        return bangla;
    }

    public void setBangla(String bangla) {
        this.bangla = bangla;
    }

    public String getArbi() {
        return arbi;
    }

    public void setArbi(String arbi) {
        this.arbi = arbi;
    }
}
