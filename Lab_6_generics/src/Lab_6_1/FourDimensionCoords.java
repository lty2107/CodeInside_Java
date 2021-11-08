package Lab_6_1;

public class FourDimensionCoords<T> extends ThreeDimensionCoords {
    private T t;

    public void setT(T t){
        this.t = t;
    }

    public T getT(){
        return t;
    }

}
