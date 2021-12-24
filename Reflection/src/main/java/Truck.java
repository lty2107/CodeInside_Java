import enums.VehicleColor;

public class Truck extends Vehicle{

    public boolean isCanvasBack;

    public Truck(int yearOfProduction, VehicleColor color, boolean isCanvasBack){
        super(yearOfProduction, color);
        this.isCanvasBack = isCanvasBack;
    }

    public void setCanvasBack(boolean isCanvasBack){
        this.isCanvasBack = isCanvasBack;
    }

    public boolean isCanvasBack(){
        return isCanvasBack;
    }

    @Override
    public String getVehicleInfo() {
        return String.format("Vin: %s \nyearOfProduction: %d\ncolor: %s\nisCanvasBack: %b\n", getVin(), getYearOfProduction(), getColor(), isCanvasBack());
    }

}
