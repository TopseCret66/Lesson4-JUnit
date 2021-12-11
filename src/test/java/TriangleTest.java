import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest {


    @Test
    public void shouldCalculateZeroSquare() {
        double square = Triangle.redSquare(6, 10, 4);

        Assertions.assertEquals(0, square);
    }

    @Test
    public void shouldCalculateNotZeroSquare() {
        double square = Triangle.redSquare(6, 9, 4);

        Assertions.assertEquals(9.56229574945264, square);
    }


}