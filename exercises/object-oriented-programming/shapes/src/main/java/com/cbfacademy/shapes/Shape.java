package com.cbfacademy.shapes;

public abstract class Shape {
    public String name;

public Shape (String name){
    this.name = name;
    }

public String getName(){
    return name;
    }

   public abstract double getArea();

}
