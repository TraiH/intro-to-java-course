package com.cbfacademy.shapes;

public class Sphere extends Shape {
    double radius;
   
    public Sphere(double radius){
        this.radius = radius;
    }
    
@Override
    public double getArea(){
    return 4 * Math.PI * (this.radius * this.radius);
    }
}


