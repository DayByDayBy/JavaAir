public class CabinCrewMember {
    private String name;
    private Rank rank;

    public CabinCrewMember (String name, Rank rank){
        this.name = name;
        this.rank = rank;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String makeAnnouncement() {
        return "please keep your seatbelts fastened, the pilot is pretty drunk today";
    }
}


