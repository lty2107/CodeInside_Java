package Lab_6_1;

public class ThreeDimensionCoords<T> extends TwoDimensionCoords{
    private T z;

    public void setZ(T z){
        this.z = z;
    }

    public T getZ(){
        return z;
    }

}
