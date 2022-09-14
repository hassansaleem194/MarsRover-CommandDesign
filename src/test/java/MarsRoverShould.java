import org.codurance.MarsRover;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class MarsRoverShould {

    @Test
    public void
    turn_right_when_passed_one_right() {
        assertEquals( "0:0:E", new MarsRover().execute("R"));
    }

    @Test
    public void
    turn_right_twice_when_passed_two_rights() {
        assertEquals( "0:0:S", new MarsRover().execute("RR"));
    }

    @Test
    public void
    turn_right_thrice_when_passed_three_rights() {
        assertEquals( "0:0:W", new MarsRover().execute("RRR"));
    }


}
