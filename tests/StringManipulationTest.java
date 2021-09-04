import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class StringManipulationTest {
    //Test Driven Development aka TDD
    @Test
    public void testConvertFirstLetterToUppercase(){
        StringManipulation stringManipulation = new StringManipulation();

        String testWords = "tech lead academy";

        String expected = "Tech Lead Academy";
        String actual = stringManipulation.ConvertFirstLetterToUppercase(testWords);

        Assert.assertEquals(actual, expected, "Not all words are upper case");

    }
    @Test
    public void testConvertFirstLetterToUppercase2(){
        StringManipulation stringManipulation = new StringManipulation();

        String testWords = "United States of America";

        String expected = "United States Of America";
        String actual = stringManipulation.ConvertFirstLetterToUppercase(testWords);

        Assert.assertEquals(actual, expected, "Not all words are upper case");

    }
    @Test
    public void TestReturnInitials (){
        StringManipulation stringManipulation = new StringManipulation();
        String testWords = "United States of America";
        String expected = "USOA";
        String actual = stringManipulation.ReturnInitials(testWords);
        Assert.assertEquals(actual,expected, "Not all initials are upper case");
    }
    @Test
    public void TestReturnInitials1 (){
        StringManipulation stringManipulation = new StringManipulation();
        String testWords = "Federal Bureau of Investigation";
        String expected = "FBOI";
        String actual = stringManipulation.ReturnInitials(testWords);
        Assert.assertEquals(actual,expected, "Not all initials are upper case");
    }
}