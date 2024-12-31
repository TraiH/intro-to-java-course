package com.cbfacademy.shapes;

public abstract class Shape {
   
public double area;
public String name;

public Shape (String name, double area){
    this.name = name;
    this.area = area;
    }
  
   public String getName(){
    return name;
    }

   public double getArea(){
    return area;
    }
}
