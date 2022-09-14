import org.codurance.MarsRover;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.*;

public class MarsRoverShould {

    @Test
    public void
    turn_right_when_passed_one_right() {
        assertEquals( "0:0:E", new MarsRover().execute("R"));
    }
}
