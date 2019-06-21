package com.nsv.jsmbaba.xmlplusannotations;

import org.springframework.stereotype.Component;

@Component(value="circle")
public class Circle implements Shape {
    public void drawShape() {
        System.out.println("Drawing circle...");
    }
}
