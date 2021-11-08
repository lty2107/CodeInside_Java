package Lab_6_1;

import java.util.ArrayList;

public class Main {

    public static void printXY(ArrayList<TwoDimensionCoords> arr){
        for (TwoDimensionCoords elem : arr){
            System.out.print("X: " + arr.get(arr.indexOf(elem)).getX() + "\t");
            System.out.print("Y: " + arr.get(arr.indexOf(elem)).getY() + "\n");
        }
    }

    public static void printXYZ(ArrayList<ThreeDimensionCoords> arr) {
        for (TwoDimensionCoords elem : arr) {
            try {
                System.out.print("X: " + arr.get(arr.indexOf(elem)).getX() + "\t");
                System.out.print("Y: " + arr.get(arr.indexOf(elem)).getY() + "\t");
                System.out.print("Z: " + arr.get(arr.indexOf(elem)).getZ() + "\n");
            } catch (Exception e){
                System.out.println("there is no Z coordinate for this element");
            }
        }
    }

    public static void main(String[] args){
        TwoDimensionCoords arr_1 = new TwoDimensionCoords();
        arr_1.setX(14);
        arr_1.setY(22);

        ThreeDimensionCoords arr_2 = new ThreeDimensionCoords();
        arr_2.setX(7);
        arr_2.setY(17);
        arr_2.setZ(29);

        FourDimensionCoords arr_3 = new FourDimensionCoords();
        arr_3.setX(4);
        arr_3.setY(5);
        arr_3.setZ(3);
        arr_3.setT(58);

        CoordsArrayList arrCoordinates = new CoordsArrayList();
        arrCoordinates.addCoords(arr_1);
        arrCoordinates.addCoords(arr_2);
        arrCoordinates.addCoords(arr_3);


        printXY(arrCoordinates.arr);
        printXYZ(arrCoordinates.arr);
    }
}
