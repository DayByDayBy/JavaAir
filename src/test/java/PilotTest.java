import Rank;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PilotTest {

    private Pilot pilot1;
    private Pilot pilot2;
    private Pilot pilot3;

    @Before
    public void setup(){
        pilot1 =  new Pilot("Jules", Rank.CAPTAIN, "A113");
        pilot2 =  new Pilot("Julie", Rank.CAPTAIN, "THX1138");
        pilot3 =  new Pilot("Julian", Rank.FIRST_OFFICER, "NCC1701");
    }

    @Test
    public void checkPilotHasName(){
        assertEquals("Julie", pilot2.getName());
    }

    @Test
    public void checkPilotHasRank(){
        assertEquals(Rank.CAPTAIN, pilot1.getRank());

    }
    // not in the MVP, but easy enough to write, and feels important - the pilot _should_ be licensed
    @Test
    public void checkPilotHasLicense(){
        assertEquals("A113", pilot1.getLicense());
    }

    @Test
    public void pilotCanFlyPlane(){
        assertEquals("WOOOOOOOOOOOOOOH!", pilot1.flyPlane());
    }

    @Test
    public void pilotCanLandPlane(){
        assertEquals("Strap in folks, it's gonna be a bumpy one!", pilot1.landPlane());
    }






}
