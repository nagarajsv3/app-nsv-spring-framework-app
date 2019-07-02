package com.nsv.jsmbaba.inheritance;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Person {
    private String firstName;
    private String lastName;
    private String company;
}
