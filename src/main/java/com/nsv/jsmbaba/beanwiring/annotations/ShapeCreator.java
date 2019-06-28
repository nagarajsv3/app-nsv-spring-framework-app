package com.nsv.jsmbaba.beanwiring.annotations;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//we can apply @Autowired on instance variable, setter method and constructor
@Component
@Getter
public class ShapeCreator {

    @Autowired
    private Circle circle;

    //@Autowired
    public void setCircle(Circle circle) {
        System.out.println("Bean Wiring is using setter");
        this.circle = circle;
    }

    public ShapeCreator() {
    }
    //@Autowired
    public ShapeCreator(Circle circle) {
        System.out.println("Bean Wiring is using constructor");
        this.circle= circle;
    }
}
