package Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PerfectSquaresTest {

    PerfectSquares numbers;

    @BeforeEach
    void setUp() {
        numbers = new PerfectSquares();
    }

    @Test
    void perfectSquaresTest1() {
        List<Integer> expected = Arrays.asList(4,9,16,25);
        List<Integer> actual = numbers.perfectSquares(3,25);
        assertEquals(expected,actual);
    }

    @Test
    void perfectSquaresTest2() {
        List<Integer> expected = Arrays.asList(16,25,36,49);
        List<Integer> actual = numbers.perfectSquares(10,50);
        assertEquals(expected,actual);
    }
}