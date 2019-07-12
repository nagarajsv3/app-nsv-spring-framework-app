package com.nsv.jsmbaba.springjdbc;

import lombok.*;

import java.util.Date;
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Clerk {
    private String ssn;
    private String name;
    private Date joinedDate;
    private Date terminationDate;
    private boolean active;
}
