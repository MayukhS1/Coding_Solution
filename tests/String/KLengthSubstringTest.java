package String;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class KLengthSubstringTest {
    KLengthSubstring kls;
    @BeforeEach
    void setUp() {
        kls = new KLengthSubstring();
    }

    @Test
    void kLengthPalindromeTest1() {
        List<String> actual = Arrays.asList("aaa","aaa");
        assertEquals(actual,kls.kLengthPalindrome("aaaa",3));
    }

    @Test
    void kLengthPalindromeTest2() {
        List<String> actual = Collections.emptyList();
        assertEquals(actual,kls.kLengthPalindrome("aa",3));
    }

    @Test
    void kLengthPalindromeTest3() {
        List<String> actual = Collections.emptyList();
        assertEquals(actual,kls.kLengthPalindrome("ab",4));
    }

    @Test
    void kLengthPalindromeTest4() {
        List<String> actual = Collections.emptyList();
        assertEquals(actual,kls.kLengthPalindrome("aabb",3));
    }

    @Test
    void kLengthPalindromeTest5() {
        List<String> actual = Arrays.asList("aba","aaa");
        assertEquals(actual,kls.kLengthPalindrome("abaaa",3));
    }
}