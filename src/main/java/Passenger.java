import java.util.Random;

public class Passenger {

    private String name;
    private double baggage;
    String flightNumber;
    static Double seatNumber;

    public Passenger(String name, double baggage, String flightNumber, Double seatNumber) {
        this.name = name;
        this.baggage = baggage;
        this.flightNumber = flightNumber;
        this.seatNumber = seatNumber;
    }

    public String getName() {
        return this.name;
    }

    public double getBaggage() {
        return this.baggage;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    private static Double getSeatNumber() {
            return Passenger.seatNumber;
    }


    public static Double setSeatNumber() {
        Passenger.seatNumber = plane.seats * Math.random();

//            for(Passenger passenger : flight.manifest) {
//                Random random = new Random();
//                int seatNumber = random.nextInt(flight.getPlane().getPlaneType().getSeats());
//                if(getSeatNumber() == seatNumber) {
//                    continue;
//                } else {
//                    passenger.setSeatNumber(seatNumber);
//                    break;

                    return Passenger.seatNumber;
        }




}
