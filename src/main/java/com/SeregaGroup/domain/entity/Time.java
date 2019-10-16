package com.SeregaGroup.domain.entity;


import java.util.Date;

public class Time {
    private Date nowDate;
    public Time(){
            nowDate = new Date();
    }

    public Date getNowDate() {
        return nowDate;
    }

    public void setNowDate(Date nowDate) {
        this.nowDate = nowDate;
    }
}
