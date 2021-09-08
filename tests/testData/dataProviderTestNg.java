package testData;
import org.testng.annotations.DataProvider;

public class dataProviderTestNg {
    @DataProvider(name = "userInfo")
    public static Object [][] userInfo() {
        Object[][] data = new Object[3][3];

        data[0][0] = "Admin";
        data[0][1] = "admin123";
        data[0][2] = "pass";

        data[1][0] = "User";
        data[1][1] = "user123";
        data[1][2] = "fail";

        data[2][0] = "John";
        data[2][1] = "Doe";
        data[2][2] = "fail";

        return data;
    }
}
