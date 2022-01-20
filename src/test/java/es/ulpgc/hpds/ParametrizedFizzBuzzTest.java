package es.ulpgc.hpds;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class ParametrizedFizzBuzzTest {
    private String expected;
    private int number;

@Parameterized.Parameters(name = "{index}, expected: {0}, result: {1}")
    public static Iterable data(){
        return Arrays.asList(new Object[][]{
                {"1",1},{"fizz",3},{"buzz",5},{"fizzbuzz",15},{"buzz",20}
        });
    }

    public ParametrizedFizzBuzzTest(String expected, int number) {
        this.expected = expected;
        this.number = number;
    }

    @Test
    public void testFizzbuzz(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(this.expected,fizzBuzz.value(this.number));
    }
}
