package com.cbfacademy.shapes;

public class Sphere extends Shape {
    public double radius; //create field called radius
    
   
    public Sphere(double radius){
        super("Sphere"); //reference to the parent class
        this.radius = radius;
    }
    
    @Override
    public double getArea(){
    return 4 * Math.PI * (this.radius * this.radius);
    }
}


