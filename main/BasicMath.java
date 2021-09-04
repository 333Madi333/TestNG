public class BasicMath {
    public static void main(String[] args) {

        BasicMath math = new BasicMath();

        int testData1 = 15;
        int testData2 = 4;

        int expectedResult = testData1 + testData2;
        int actualResult = math.sum(testData1, testData2);
        if (expectedResult == actualResult) {
            System.out.println("Sum test pass");
        } else {
            System.out.println("Sum test failed");
        };

        int expectedResult1 = testData1 - testData2;
        int actualResult1 = math.sub(testData1, testData2);
        if (expectedResult == actualResult) {
            System.out.println("Subtraction test pass");
        } else {
            System.out.println("Subtraction test failed");
        };

        double expectedResult2 = testData1 / testData2;
        double actualResult2 = math.div(testData1, testData2);
        if (expectedResult == actualResult) {
            System.out.println("Division test pass");
        } else {
            System.out.println("Division test failed");
        };

        int expectedResult3 = testData1 * testData2;
        int actualResult3 = math.mul(testData1, testData2);
        if (expectedResult == actualResult) {
            System.out.println("Multiplication test pass");
        } else {
            System.out.println("Multiplication test failed");
        };

    }

    public int sum(int... allNums) {
        int total = 0;
        for (int num : allNums) {
            total += num;
        }
        return total;
    }

    public int sub(int num1, int num2) {
        return num1 - num2;
    }

    public double div(double num1, double num2) {
        return num1 / num2;
    }

    public int mul(int num1, int num2) {
        return num1 * num2;
    }
}
