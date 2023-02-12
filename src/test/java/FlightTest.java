import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;



public class FlightTest {


    private Pilot pilot;
    private Plane plane;
    private Flight flight;
    private Passenger passenger;

    private double baggageAllowance;
    private double bookedWeight;
    private double weightRemaining;


    @Before
    public void setup(){

        ArrayList<CabinCrewMember> crewList = new ArrayList<>();
        ArrayList<Passenger> manifest = new ArrayList<>();

        pilot =  new Pilot("Jules", Rank.CAPTAIN, "A113");
        plane =  new Plane(PlaneType.BOEING747);
        flight =  new Flight(
                "BA666",
                plane,
                "GLA",
                "LDN",
                "2358",
                pilot,
                crewList,
                manifest,
                baggageAllowance,
                bookedWeight,
                weightRemaining);

        passenger = new Passenger("Jean", 40);
    }

    @Test
    public void canGetFlightNumber(){
        assertEquals("BA666", flight.getFlightNumber());
    }

    @Test
    public void canGetSeats(){
            assertEquals(416, this.plane.getSeats());
        }

    @Test
    public void canAddPassengerToFlight(){
        flight.addPassenger(passenger);
        assertEquals(1, flight.getManifest().size());
    }


}