package com.cbfacademy.shapes;

public class Cylinder extends Shape {
    public double radius;
    public double height;
    
        public Cylinder(double radius, double height){
            super("Cylinder");
            this.radius = radius;
            this.height = height;
        }
    
        @Override
            public double getArea(){
            return this.height * Math.PI * (this.radius * this.radius);
    }
    
}
