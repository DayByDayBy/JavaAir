import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class FlightManagerTest {


    private Flight fastballExpress;
    private Pilot pilot;
    private Plane plane;
    private Passenger passenger;
    double baggageAllowance;
    private double bookedWeight;
    private double weightRemaining;

    @Before
    public void setup() {
        ArrayList<CabinCrewMember> crewList = new ArrayList<>();
        ArrayList<Passenger> manifest = new ArrayList<>();
        pilot = new Pilot("Laura Kinney", Rank.CAPTAIN, "X23");
        plane = new Plane(PlaneType.CESSNA);
        passenger = new Passenger("Bobby Drake", 45);
        fastballExpress = new Flight(
                "616",
                plane,
                "KRAKOA",
                "WESTCHESTER",
                "0450",
                pilot,
                crewList,
                manifest,
                baggageAllowance,
                bookedWeight,
                weightRemaining);
    }
    @Test
    public void canGetBaggageAllowance(){
        assertEquals(60, plane.getBaggageAllowance(), 0.0);
    }

    @Test
    public void canCalculateCheckedBaggage(){
        fastballExpress.addPassenger(passenger);
        assertEquals(45, fastballExpress.getManifest().size() * passenger.getBaggage(), 0.0);
    }

    @Test
    public void canCalculateRemainingBaggageWeight(){
        fastballExpress.addPassenger(passenger);
        assertEquals(
                75,
                plane.getTotalBaggageLimit() - (passenger.getBaggage() * fastballExpress.getManifest().size()),
                0.0);
        }
}



// this is all very basic, would be better if it was a bigger manifest than one.
// and the test above is just removing a passenger bag from the total, not removing
// a manifest size * bags, which i think would be cleaner/better


// okay, disregard above, have now updated it
// leaving the comments to remind me of the iteration if i come back to it later
