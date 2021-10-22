package ru.codeinside.lessons.javacore.inheritance;

import org.junit.jupiter.api.Test;
import ru.codeinside.lessons.javacore.inheritance.enums.VehicleColor;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TruckTest {

    @Test
    void getVehicleInfoTest() {
        var truckOne = new Truck(2020, VehicleColor.BLACK, true);
        assertNotNull(truckOne.getVehicleInfo());
        assertTrue(truckOne.getVehicleInfo().contains("2020"));
        assertTrue(truckOne.getVehicleInfo().toLowerCase(Locale.ROOT).contains("black"));

        var truckTwo = new Truck(2021, VehicleColor.getColorByName("red"), false);
        assertNotNull(truckTwo.getVehicleInfo());
        assertTrue(truckTwo.getVehicleInfo().contains("2021"));
        assertTrue(truckTwo.getVehicleInfo().toLowerCase(Locale.ROOT).contains("red"));
    }

    @Test
    void createTruckTest() {
        var truckOne = new Truck(2020, VehicleColor.BLACK, true);
        assertSame(VehicleColor.BLACK, truckOne.getColor());
        assertNotNull(truckOne.vin);
        assertEquals(17, truckOne.vin.length());
        assertEquals(2020, truckOne.yearOfProduction);
        assertTrue(truckOne.isCanvasBack());

        var truckTwo = new Truck(2021, VehicleColor.getColorByName("red"), false);
        assertSame(VehicleColor.RED, truckTwo.getColor());
        assertNotNull(truckTwo.vin);
        assertEquals(17, truckTwo.vin.length());
        assertEquals(2021, truckTwo.yearOfProduction);
        assertFalse(truckTwo.isCanvasBack());

        var truckThree = new Truck(2018, VehicleColor.getColorByName("pink"), false);
        assertSame(VehicleColor.UNDEFINED, truckThree.getColor());
        assertNotNull(truckThree.vin);
        assertEquals(17, truckThree.vin.length());
        assertEquals(2018, truckThree.yearOfProduction);
        assertFalse(truckThree.isCanvasBack());
    }
}
