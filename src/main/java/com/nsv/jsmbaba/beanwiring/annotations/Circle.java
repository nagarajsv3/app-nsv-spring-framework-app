package com.nsv.jsmbaba.beanwiring.annotations;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    public void drawCircle(){
        System.out.println("Drawing Circle...");
    }
}
