package es.ulpgc.hpds;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizBuzzTest {

    @Test
    public void return_1_for_value_of_1(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.value(1);
        assertEquals("1",value);
    }

    @Test
    public void return_2_for_value_of_2(){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String value = fizzBuzz.value(2);
        assertEquals("2",value);
    }
}
