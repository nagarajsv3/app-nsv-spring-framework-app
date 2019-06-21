package com.nsv.jsmbaba.xmlplusannotations;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Getter
@Component(value="shapecreator")
public class ShapeCreator {

    @Autowired
    @Qualifier(value="rectangle")
    private Shape shape;

    public void setShape(Shape shape) {
        System.out.println("Dependency Injection - Setter Based");
        this.shape = shape;
    }
    public ShapeCreator(){

    }

    public ShapeCreator(Shape shape){
        System.out.println("Dependency Injection - Constructor Based");
        this.shape = shape;
    }
}
