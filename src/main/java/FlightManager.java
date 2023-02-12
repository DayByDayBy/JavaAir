public class FlightManager {

    private double bookedWeight;
    private double weightRemaining;
    private Plane plane;

    public FlightManager(
                         double bookedWeight,
                         double weightRemaining,
                         Plane plane) {
                                        this.bookedWeight = bookedWeight;
                                        this.weightRemaining = weightRemaining;
                                        this.plane = plane;
    }
}


//
//
//
//
//    public String getFlightNumber() {
//        return this.flightNumber;
//    }
//
//    public Plane getPlane() {
//        return this.plane;
//    }
//
//    public void addPassenger(Passenger passenger) {
//        if (manifest.size() < this.plane.getSeats()){
//            manifest.add(passenger);
//        }
//    }
//
//    public void addCrew (CabinCrewMember cabinCrewMember) {
//        crewList.add(cabinCrewMember);
//    }
//    public Collection<Passenger> getManifest() {
//        return this.manifest;
//    }





