package com.nsv.jsmbaba.xmlplusannotations;

import org.springframework.stereotype.Component;

@Component(value="rectangle")
public class Rectangle implements Shape {
    public void drawShape() {
        System.out.println("Drawing rectangle...");
    }
}
