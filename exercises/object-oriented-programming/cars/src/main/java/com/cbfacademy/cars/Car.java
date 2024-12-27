package com.cbfacademy.cars;

public class Car {

        private String make;
        private String model;
        private String colour;
        private int year;

    public Car(String make, String model, String colour, int year){ 

        this.make = make; 
        this.model = model;
        this.year = year;
        this.colour = colour;
    }

    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getYear(){
        return year;
    }
    public String getColour(){
        return colour;
    }
    public void setColour(String newColour){
        colour = newColour; 
    }
    public String getDetails(){
        return make + ", " + model + ", " + year + ", " + colour;  
    }

}