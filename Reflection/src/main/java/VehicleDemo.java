import enums.VehicleColor;

public class VehicleDemo {

    public static void main(String args[]){
        var Truck = new Truck(2020, VehicleColor.GREEN, false);
        System.out.println(Truck.getVehicleInfo());
        var Car = new Car(2015, VehicleColor.BLACK, true, false);
        System.out.println(Car.getVehicleInfo());

        var a = new ReflectionClass(Car.class);
        var b= new ReflectionClass(Truck);

        a.printFullClassInfo();
        b.printFullClassInfo();

    }
}