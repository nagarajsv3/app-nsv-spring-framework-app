package com.nsv.jsmbaba.loosecouping;

import lombok.Getter;

@Getter
public class ShapeCreator {
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
