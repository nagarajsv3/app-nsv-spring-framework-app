package com.nsv.jsmbaba.beanwiring;

import lombok.Getter;

@Getter
public class ShapeCreator {
    private Circle circle;

    public void setCircle(Circle circle) {
        System.out.println("Bean Wiring is using setter");
        this.circle = circle;
    }

    public ShapeCreator() {
    }
    public ShapeCreator(Circle circle) {
        System.out.println("Bean Wiring is using constructor");
        this.circle= circle;
    }
}
