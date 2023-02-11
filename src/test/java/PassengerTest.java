import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void setup(){
        passenger1 =  new Passenger("Gary");
        passenger2 =  new Passenger("Lisa");
        passenger3 =  new Passenger("Helen");
    }

    @Test
    public void passengerHasName(){
        assertEquals("Lisa", passenger2.getName());

    }
}
