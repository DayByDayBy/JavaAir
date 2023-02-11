public class Pilot  {

    private String name;
    private Rank rank;
    private String license;


    public Pilot (String name, Rank rank, String license){
        this.name = name;
        this.rank = rank;
        this.license = license;
    }

    public String getName() {
        return this.name;
    }

    public Rank getRank() {
        return this.rank;
    }

    public String getLicense() {
        return this.license;
    }

    public String flyPlane() {
        return "WOOOOOOOOOOOOOOH!";
    }

    public String landPlane() {
        return "Strap in folks, it's gonna be a bumpy one!";
    }
}


