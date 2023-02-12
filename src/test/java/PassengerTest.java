import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PassengerTest {

    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;

    @Before
    public void setup(){
        passenger1 =  new Passenger("Gary", 45, "", null);
        passenger2 =  new Passenger("Lisa", 45,"", null);
        passenger3 =  new Passenger("Helen", 45,"", null);
    }

    @Test
    public void passengerHasName(){
        assertEquals("Lisa", passenger2.getName());
    }

}
