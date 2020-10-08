package Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NthSumOfDigitTest {

    NthSumOfDigit number;

    @BeforeEach
    void setUp() {
        number = new NthSumOfDigit();
    }

    @Test
    void nthNumberTest1() {
        assertEquals(75,number.nthNumber(5,12));
    }

    @Test
    void nthNumberTest2() {
        assertEquals(376,number.nthNumber(16,16));
    }
    @Test
    void nthNumberTest3() {
        assertEquals(685,number.nthNumber(20,19));
    }
    @Test
    void nthNumberTest4() {
        assertEquals(-1,number.nthNumber(0,16));
    }
    @Test
    void nthNumberTest5() {
        assertEquals(3202805,number.nthNumber(99889,20));
    }
}