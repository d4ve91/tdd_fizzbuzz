import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzTest{
    
    @Test
    public void shouldProcessingSingleSerialNumber(){
        FizzBuzz fizzBuzz = new FizzBuzz();

        Assert.assertEquals("1", fizzBuzz.process(1));
        Assert.assertEquals("2", fizzBuzz.process(2));
        Assert.assertEquals("Fizz", fizzBuzz.process(3));
        Assert.assertEquals("4", fizzBuzz.process(4));
        Assert.assertEquals("Buzz", fizzBuzz.process(5));
        Assert.assertEquals("Fizz", fizzBuzz.process(6));
        
        Assert.assertEquals("Buzz", fizzBuzz.process(10));
        
        Assert.assertEquals("Buzz", fizzBuzz.process(20));
        Assert.assertEquals("Fizz", fizzBuzz.process(18));
        Assert.assertEquals("19", fizzBuzz.process(19));
        Assert.assertEquals("Buzz", fizzBuzz.process(20));

        Assert.assertEquals("FizzBuzz", fizzBuzz.process(30));


    }
}