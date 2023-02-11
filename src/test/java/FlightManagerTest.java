import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class FlightManagerTest {
    private double weightAllowance;
    private double bookedWeight;
    private double weightRemaining;
    private Flight fastballExpress;
    private Pilot pilot;
    private Plane plane;
    private Passenger passenger;

    @Before
    public void setup() {

        ArrayList<CabinCrewMember> crewList = new ArrayList<>();
        ArrayList<Passenger> manifest = new ArrayList<>();

        fastballExpress = new Flight(
                "616",
                plane,
                "KRAKOA",
                "WESTCHESTER",
                "0450",
                pilot,
                crewList,
                manifest);

        pilot = new Pilot("Laura Kinney", Rank.CAPTAIN, "X23");
        plane = new Plane(PlaneType.CESSNA);
        passenger = new Passenger("Bobby Drake");
    }

    @Test
    public void canCalculateBaggageAllowance(){
    }

    @Test
    public void canCalculateCheckedBaggage(){
    }

    @Test
    public void canCalculateRemainingBaggageWeight(){
    }



}





