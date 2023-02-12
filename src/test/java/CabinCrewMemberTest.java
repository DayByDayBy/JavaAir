import Rank;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CabinCrewMemberTest {

    private CabinCrewMember cabincrew1;
    private CabinCrewMember cabincrew2;
    private CabinCrewMember cabincrew3;

    @Before
    public void setup(){
        cabincrew1 =  new CabinCrewMember("Joseph", Rank.FLIGHT_ATTENDANT);
        cabincrew2 =  new CabinCrewMember("Jennifer", Rank.FLIGHT_ATTENDANT);
        cabincrew3 =  new CabinCrewMember("Jocasta", Rank.PURSER);
    }

    @Test
    public void CabinCrewMemberHasName(){
        assertEquals("Jocasta", cabincrew3.getName());
    }

    @Test
    public void CabinCrewMemberHasRank(){
        assertEquals(Rank.PURSER, cabincrew3.getRank());
    }

    @Test
    public void canCrewMakeAnnouncement(){
        assertEquals("please keep your seatbelts fastened, the pilot is pretty drunk today", cabincrew1.makeAnnouncement());
    }



}
