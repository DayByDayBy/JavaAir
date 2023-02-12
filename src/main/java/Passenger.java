public class Passenger  {

    private String name;
    private double baggage;

    public Passenger (String name, double baggage){
        this.name = name;
        this.baggage = baggage;
    }

    public String getName() {
        return this.name;
    }
    public double getBaggage(){
        return this.baggage;
    }
}

