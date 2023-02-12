import java.util.ArrayList;
import java.util.Collection;

public class Flight {

    String flightNumber;
    private Plane plane;
    private String destination;
    private String departureAirport;
    private String departureTime;
    private Pilot pilot;
    private ArrayList<CabinCrewMember> crewList;
    private ArrayList<Passenger> manifest;

    double baggageAllowance;
    double bookedWeight;
    double weightRemaining;

    public Flight
            (String flightNumber,
             Plane plane,
             String destination,
             String departureAirport,
             String departureTime,
             Pilot pilot,
             ArrayList<CabinCrewMember> crewList,
             ArrayList<Passenger> manifest,
             double baggageAllowance,
             double bookedWeight,
             double weightRemaining)
    {
        this.flightNumber = flightNumber;
        this.plane = plane;
        this.destination = destination;
        this.departureAirport = departureAirport;
        this.departureTime = departureTime;
        this.pilot = pilot;
        this.crewList = crewList;
        this.manifest = manifest;
        this.baggageAllowance = baggageAllowance;
        this.bookedWeight = bookedWeight;
        this.weightRemaining = weightRemaining;
    }




    public String getFlightNumber() {
        return this.flightNumber;
}

    public Plane getPlane() {
        return this.plane;
    }

    public void addPassenger(Passenger passenger) {
        if (manifest.size() < this.plane.getSeats()){
            manifest.add(passenger);
            passenger.setFlightNumber(flightNumber);
            Passenger.setSeatNumber();
        }
    }

    public void addCrew (CabinCrewMember cabinCrewMember) {
            crewList.add(cabinCrewMember);
        }
    public Collection<Passenger> getManifest() {
        return this.manifest;
    }







}
