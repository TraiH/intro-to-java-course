package com.cbfacademy.cars;

public class App {
    public void main(String[] args) {
        // TODO: Display details of all cars in showroom
      Showroom showroom = new Showroom();

      // Display details of all cars in the showroom
      for (Car car : showroom.getCars()) {
          System.out.println(car.getDetails());
     }

        }
    }

