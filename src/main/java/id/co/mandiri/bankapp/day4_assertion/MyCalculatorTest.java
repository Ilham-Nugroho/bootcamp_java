package id.co.mandiri.bankapp.day4_assertion;

import junit.framework.Assert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class MyCalculatorTest {
    MyCalculator myCalculator;

    @BeforeEach
    void setUp() {
        myCalculator = new MyCalculator();
    }

    @Test
    @DisplayName("Simple multiplication")
    void testMultiply() {
        Assert.assertEquals(20, myCalculator.multiply(4, 5));
    }

    @RepeatedTest(5)
    @DisplayName("Ensure correct headling of zero")
    void testMultiplyWithZero() {
        Assertions.assertEquals(0, myCalculator.multiply(0, 5),
                "Multiple with zero should be zero");
        Assertions.assertEquals(0, myCalculator.multiply(5, 0),
                "Multiple with zero should be zero");
    }

    @Test
    void groupedAssertions(){
        Assertions.assertAll(
                () -> Assertions.assertEquals(10, myCalculator.multiply(5,2)),
                () -> Assertions.assertEquals(10, myCalculator.multiply(5,2)),
                () -> Assertions.assertEquals(10, myCalculator.multiply(5,2)),
                () -> Assertions.assertEquals(10, myCalculator.multiply(5,2))
        );
    }

    @Test
    void testException() {
        Exception exception = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> myCalculator.multiply(1000, 1));
        Assertions.assertEquals("x should be less than 1000",
                exception.getMessage());
    }

    public static int[][] data(){
        return new int[][]{
                {1,2,2},{4,5,20},{7,8,56}
        };
    }

    @ParameterizedTest
    @MethodSource(value="data")
    void testWithParameter(int[] data){
        int m1 = data[0];
        int m2 = data[1];
        int expected = data[2];
        Assertions.assertEquals(expected, myCalculator.multiply(m1,m2));
    }
}
