import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class BasicMathTest {

    @Test
    public void testSum() {
        BasicMath math = new BasicMath();

        int testData1 = 5;
        int testData2 = 7;

        int expectedResult = testData1 + testData2;
        int actualResult = math.sum(testData1, testData2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testSub() {
        BasicMath math = new BasicMath();

        int testData1 = 12;
        int testData2 = 5;

        int expectedResult = testData1 - testData2;
        int actualResult = math.sub(testData1, testData2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testDiv() {
        BasicMath math = new BasicMath();

        double testData1 = 16;
        double testData2 = 5;

        double expectedResult = testData1 / testData2;
        double actualResult = math.div(testData1, testData2);
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testMul() {
        BasicMath math = new BasicMath();

        int testData1 = 8;
        int testData2 = 3;

        int expectedResult = testData1 * testData2;
        int actualResult = math.mul(testData1, testData2);
        Assert.assertEquals(actualResult,expectedResult);
    }
}