package es.ulpgc.hpds;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FizBuzzTest {

    FizzBuzz fizzBuzz;

    @Before
    public void init(){
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void return_1_for_value_of_1(){

        assertEquals("1",fizzBuzz.value(1));
    }

    @Test
    public void return_2_for_value_of_2(){

        assertEquals("2",fizzBuzz.value(2));
    }

    @Test
    public void return_fizz_for_value_of_3(){

        assertEquals("fizz",fizzBuzz.value(3));
    }

    @Test
    public void return_buzz_for_value_of_5(){
        assertEquals("buzz",fizzBuzz.value(5));
    }

    @Test
    public void return_fizz_for_value_of_6(){
        assertEquals("fizz",fizzBuzz.value(6));
    }
    @Test
    public void return_fizz_for_value_of_9(){
        assertEquals("fizz",fizzBuzz.value(9));
    }

    @Test
    public void return_buzz_for_value_of_10(){
        assertEquals("buzz",fizzBuzz.value(10));
    }

    @Test
    public void return_fizzbuzz_for_value_of_15(){
        assertEquals("fizzbuzz",fizzBuzz.value(15));
    }

    @Test
    public void return_fizzbuzz_for_value_of_30(){
        assertEquals("fizzbuzz",fizzBuzz.value(30));
    }
}
