public class Plane {
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

        public PlaneType getPlaneType(){
            return this.planeType;
        }
}



