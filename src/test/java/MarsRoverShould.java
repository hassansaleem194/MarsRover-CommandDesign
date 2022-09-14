import org.codurance.MarsRover;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class MarsRoverShould {

    MarsRover marsRover;
    @BeforeEach
    void setup() {
        marsRover = new MarsRover();
    }

    @ParameterizedTest
    @CsvSource({
//            rotate Mars Rover Right
        "R, 0:0:E",
        "RR, 0:0:S",
        "RRR , 0:0:W",
    })
    void turn_when_passed_rotation_command (String inputCommand, String expectedOutput) {
        String actualResult = marsRover.execute(inputCommand);
        assertEquals(expectedOutput, actualResult);
    }


}
