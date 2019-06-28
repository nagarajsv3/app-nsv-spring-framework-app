package com.nsv.jsmbaba.xmlplusannotations;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
@Getter
public class ShapeCreator1 {
    @Autowired
    @Qualifier(value="circle")
    private Shape shape;

    public void setShape(Shape shape) {
        System.out.println("Dependency Injection - Setter Based");
        this.shape = shape;
    }
    public ShapeCreator1(){

    }

    public ShapeCreator1(Shape shape){
        System.out.println("Dependency Injection - Constructor Based");
        this.shape = shape;
    }
}
