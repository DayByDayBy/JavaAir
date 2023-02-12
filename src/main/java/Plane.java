public class Plane {
    public double baggageAllowance;
    private PlaneType planeType;
        public Plane (PlaneType planeType){
            this.planeType = planeType;
        }
        public int getSeats() {
        return this.planeType.getSeats();
        }
        public int getCargoLimit() {
        return this.planeType.getCargoLimit();
        }
        public int getTotalBaggageLimit() {
        return this.planeType.getCargoLimit()/2;
    }

        public PlaneType getPlaneType(){
            return this.planeType;
        }

    public double getBaggageAllowance() {
            return (this.getCargoLimit() / this.getSeats()) / 2;
        }

    }


