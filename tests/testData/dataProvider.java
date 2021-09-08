package testData;

import org.testng.annotations.DataProvider;

public class dataProvider {
    @DataProvider(name = "loginData")
    public static Object [][] logInData() {
        Object[][] data = new Object[2][2];
        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";
        data[1][0] = "locked_out_user";
        data[1][1] = "secret_sauce";
        return data;
    }

    @DataProvider(name = "userInfo")
    public static Object [][] userInfo() {
        Object[][] data = new Object[3][6];
        data[0][0] = "Donald";
        data[0][1] = "Biden";
        data[0][2] = "111-111-1111";
        data[0][3] = "donbid@mail.test";
        data[0][4] = "Mentor";
        data[0][5] = "pass";

        data[1][0] = "Donald";
        data[1][1] = "Biden";
        data[1][2] = "111-111-1111";
        data[1][3] = "";
        data[1][4] = "Student";
        data[1][5] = "fail";

        data[2][0] = "Donald";
        data[2][1] = "Biden";
        data[2][2] = "";
        data[2][3] = "donbid@mail.test";
        data[2][4] = "Instructor";
        data[2][5] = "fail";

        return data;
    }
}
