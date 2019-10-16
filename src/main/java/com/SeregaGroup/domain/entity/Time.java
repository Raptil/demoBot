package com.SeregaGroup.domain.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Time {
    private Date nowDate;
    public Time(){
            nowDate = new Date();
    }


}
