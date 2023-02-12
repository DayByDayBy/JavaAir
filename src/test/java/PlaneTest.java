import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PlaneTest {

    private Plane plane1;
    private Plane plane2;
    private Plane plane3;

    @Before
    public void setup(){
        plane1 =  new Plane(PlaneType.BOEING747);
        plane2 =  new Plane(PlaneType.AIRBUSA350);
        plane3 =  new Plane(PlaneType.NIMROD);

    }

    @Test
    public void canGetPlaneSeats(){
        assertEquals(416, plane1.getSeats());
    }

    @Test
    public void checkPlaneHasCargoLimit(){
        assertEquals(6124, PlaneType.NIMROD.getCargoLimit());

    }



}
