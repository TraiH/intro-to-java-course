package com.cbfacademy.shapes;

public class Rectangle extends Shape {
    public double length;
    public double width;
    
            public Rectangle (double length, double width){
                super("Rectangle");
                this.width = width;
                this.length = length;
                
        }
        @Override
            public double getArea(){
            return (this.length * this.width);
            }    
    
}
