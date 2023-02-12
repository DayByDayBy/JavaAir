import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void setup(){
        passenger1 =  new Passenger("Gary", 45);
        passenger2 =  new Passenger("Lisa", 45);
        passenger3 =  new Passenger("Helen", 45);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Lisa", passenger2.getName());

    }
}
