public enum PlaneType {

    BOEING747(416, 66560),
    AIRBUSA350(300, 48000),
    NIMROD (13, 6124),

    CESSNA(2, 240);

    private final int seats;
    private final int cargoLimit;


    private PlaneType(int seats, int cargoLimit){
        this.seats = seats;
        this.cargoLimit = cargoLimit;
    }
    public int getSeats(){
        return this.seats;
    }
    public int getCargoLimit(){
        return this.cargoLimit;
    }


}

