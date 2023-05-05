package chapterThree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirconditionalTest {
    @Test
    public void testThatAcExist(){
        Airconditional airconditional = new Airconditional();
        assertNotNull(airconditional);
    }
    @Test
    public void testThatAcCanBeTurnedOn(){
        Airconditional airconditional = new Airconditional();
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        assertTrue(airconditional.isOn());
    }
    @Test
    public void testThatAcCanBeTurnedOffWhenIsOn(){
        Airconditional airconditional = new Airconditional();
        assertFalse(airconditional.isOn());
        airconditional.turnOn();
        assertTrue(airconditional.isOn());
        airconditional.turnOff();
        assertFalse(airconditional.isOn());

    }
    @Test
    public void testThatAcCanBeIncreased(){
        Airconditional airconditional = new Airconditional();
        assertEquals(16, airconditional.getTemperature());
        airconditional.increaseTemperature();
        assertEquals(17, airconditional.getTemperature());
        airconditional.increaseTemperature();
        assertEquals(18, airconditional.getTemperature());
        airconditional.increaseTemperature();
        assertEquals(19, airconditional.getTemperature());

    }
    @Test
    public void testThatAcCanBeDecreased(){
        Airconditional airconditional = new Airconditional();
        assertEquals(16, airconditional.getTemperature());
        airconditional.increaseTemperature();
        airconditional.increaseTemperature();
        assertEquals(18, airconditional.getTemperature());
        airconditional.decreaseTemperature();
        airconditional.decreaseTemperature();
        assertEquals(16, airconditional.getTemperature());
    }
    @Test
    public void testThatAcWillNotBeIncreaseBeyond30(){
     Airconditional airconditional = new Airconditional();
     assertEquals(16, airconditional.getTemperature());
     airconditional.increaseTemperature();
     assertEquals(17, airconditional.getTemperature());
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     assertEquals(19, airconditional.getTemperature());
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     airconditional.increaseTemperature();
     assertEquals(30, airconditional.getTemperature());
    }
    @Test
    public void testThatAcCanNotDecreaseBelow16(){
        Airconditional airconditional = new Airconditional();
        assertEquals(16, airconditional.getTemperature());
        airconditional.decreaseTemperature();
        airconditional.decreaseTemperature();
        assertEquals(16, airconditional.getTemperature());
    }

}