package com.nsv.jsmbaba.inheritance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Contractor extends Person {
    private Date contractStartDate;
    private Date contractEndDate;
}
