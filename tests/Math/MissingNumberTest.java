package Math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MissingNumberTest {

    private MissingNumber number;
    @BeforeEach
    void setUp() {
        number = new MissingNumber();
    }

    @Test
    void test1() {
        assertEquals(7,number.missingNumber("1,2,3,4,5,6,8,9"));
    }
    @Test
    void test2() {
        assertEquals(4,number.missingNumber("1,2,3,5"));
    }
    @Test
    void test3() {
        assertEquals(3,number.missingNumber("1,2,4,5,6,7,8,9"));
    }
    @Test
    void test4() {
        assertEquals(3,number.missingNumber("1 ,2 ,4, 5, 6,7, 8 ,9"));
    }

    @Test
    void test5() {
        assertEquals(-1,number.missingNumber("{1,2,3,4,5,6,8}"));
    }

}