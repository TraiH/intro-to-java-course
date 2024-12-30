package com.cbfacademy.cars;
import java.nio.file.ProviderMismatchException;
import java.util.ArrayList;
import java.util.List;

public class Showroom {
    
    private List<Car> cars;

    public Showroom() {
        this.cars = new ArrayList<>();
        cars.add(new Car("Volvo", "V40", "blue", 2012));
        cars.add(new Car("Porsche", "Panamera", "red", 2009));
        cars.add(new Car("Audi", "A3", "grey", 2018));
    }

    public List<Car> getCars() {
        return cars;
    }
}
