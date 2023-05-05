package Bike;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeSnacksTest {
    @Test
    public void testThatObjectBikeExist(){
        BikeSnacks bikeSnacks = new BikeSnacks();
        assertNotNull(bikeSnacks);
    }
    @Test
    public void testThatBikeCanBeTurnedOn(){
        BikeSnacks bikeSnacks = new BikeSnacks();
        assertFalse(bikeSnacks.isOn());
        bikeSnacks.turnOn();
        assertTrue(bikeSnacks.isOn());
    }
    @Test
    public void testThatBikeCanBeTurnedOff(){
        BikeSnacks bikeSnacks = new BikeSnacks();
        assertFalse(bikeSnacks.isOn());
        bikeSnacks.turnOn();
        assertTrue(bikeSnacks.isOn());
        bikeSnacks.turnOff();
        assertFalse(bikeSnacks.isOn());
    }

    @Test
    public void testThatBikeCanBeAcceleratedOnGearOne(){
        BikeSnacks bikeSnacks = new BikeSnacks();

        assertFalse(bikeSnacks.isOn());
        assertEquals(0, bikeSnacks.getSpeed());
        assertEquals(0, bikeSnacks.getGear());

        bikeSnacks.turnOn();
        assertTrue(bikeSnacks.isOn());
        assertEquals(1, bikeSnacks.getSpeed());
        assertEquals(1, bikeSnacks.getGear());

        bikeSnacks.accelerate();
        assertEquals(2, bikeSnacks.getSpeed());

        for (int i = 0; i < 18; i++) {
            bikeSnacks.accelerate();
        }
        assertEquals(20, bikeSnacks.getSpeed());
    }


}