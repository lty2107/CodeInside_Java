package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

import java.util.Arrays;
import java.util.stream.Stream;

public class VehicleDemo {

    public static void main(String args[]){

        Stream.of(new Truck(2019, VehicleColor.BLACK, false),
                      new Truck(2016, VehicleColor.BLUE, true),
                      new Truck(2010, VehicleColor.RED, false)
        ).forEach(vehicle -> System.out.println(vehicle.getVehicleInfo()));

        Stream.of(new Car(2020, VehicleColor.RED, true, false),
                    new Car(2015, VehicleColor.BLACK, false, false),
                    new Car(2021, VehicleColor.RED, true, true)
        ).filter(car -> car.isElectroCar).forEach(car -> System.out.println(car.getVehicleInfo()));
    }
}
