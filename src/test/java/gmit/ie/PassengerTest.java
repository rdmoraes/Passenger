package gmit.ie;
/*
    PassengerTest - Performs test on class Passenger

    Renan Moraes
    G00353112
    05/03/2020
 */

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PassengerTest {

    Passenger passenger;
    @BeforeEach
    void init(){
        passenger = new Passenger("Mr","Robert","AB172000000", "0836547895", 20);
    }




      @Test
    void testSetTitle() {
        passenger.setTitle("Ms");
        assertEquals("Ms", passenger.getTitle());
    }


    @Test
    void testSetName() {
        passenger.setName("Renan");
        assertEquals("Renan", passenger.getName());
    }

    @Test
    void testSetId() {
        passenger.setId("G0351457450");
        assertEquals("G0351457450", passenger.getId());
    }

    @Test
    void testSetPhone() {
        passenger.setPhone("0999978142");
        assertEquals("0999978142", passenger.getPhone());
    }


    @Test
    void testSetAge() {
        passenger.setAge(24);
        assertEquals(24, passenger.getAge());
    }

    @Test
    void testThrowExceptionSetTitle(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> passenger.setTitle("Sr"));
        assertEquals("Invalid argument.Title option are Mr, Mrs or Ms", exception.getMessage());
    }

    @Test
    void testThrowExceptionSetName(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> passenger.setName("E"));
        assertEquals("Invalid argument.Name must be over than 3 char", exception.getMessage());
    }

    @Test
    void testThrowExceptionSetID(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> passenger.setId("E012"));
        assertEquals("Invalid argument.ID must be over than 10 char", exception.getMessage());
    }

    @Test
    void testThrowExceptionSetPhone(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> passenger.setPhone("0893522"));
        assertEquals("Invalid argument. Phone must be minimum of 10 digits", exception.getMessage());
    }

    @Test
    void testThrowExceptionSetAge(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> passenger.setAge(15));
        assertEquals("Invalid argument. Age must be over 16", exception.getMessage());
    }



}
