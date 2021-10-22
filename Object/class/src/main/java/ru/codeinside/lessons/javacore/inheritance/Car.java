package ru.codeinside.lessons.javacore.inheritance;

import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

public class Car extends Vehicle{
    public boolean isSportCar;
    public boolean isElectroCar;

    public Car(int yearOfProduction, VehicleColor color, boolean isSportCar, boolean isElectroCar){
        super(yearOfProduction, color);
        this.isSportCar = isSportCar;
        this.isElectroCar = isElectroCar;
    }

    public void setSportCar(boolean isSportCar){
        this.isSportCar = isSportCar;
    }

    public boolean isSportCar(){
        return isSportCar;
    }

    public void setElectroCar(boolean isElectroCar){
        this.isElectroCar = isElectroCar;
    }

    public boolean isElectroCar(){
        return isElectroCar;
    }



    @Override
    public String getVehicleInfo() {
        return String.format("Vin: %s \nyearOfProduction: %d\ncolor: %s\nisSportCar: %b\nisElectroCar: %b", getVin(), getYearOfProduction(), getColor(), isSportCar(), isElectroCar());
    }
}
