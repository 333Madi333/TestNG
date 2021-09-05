package testData;

import org.testng.annotations.DataProvider;

public class dataProviderNames {

    @DataProvider(name = "userInfo")
    public static Object [][] userInfo() {
        Object[][] data = new Object[7][5];
//       First user with all data
        data[0][0] = "John";
        data[0][1] = "Doe";
        data[0][2] = "123-456-7890";
        data[0][3] = "johndoe@mail.com";
        data[0][4] = "Student";

//      Second user with empty Name field
        data[1][0] = "";
        data[1][1] = "Pushkin";
        data[1][2] = "123-456-7890";
        data[1][3] = "pushkin@mail.com";
        data[1][4] = "Instructor";

//      Third user with empty phone number field
        data[2][0] = "Anton";
        data[2][1] = "Chehov";
        data[2][2] = "";
        data[2][3] = "anton@mail.com";
        data[2][4] = "Mentor";

//      Fourth user with empty E-mail field
        data[3][0] = "John";
        data[3][1] = "Doe";
        data[3][2] = "123-456-7890";
        data[3][3] = "";
        data[3][4] = "Student";

//      Fifth user with no Role selected
        data[4][0] = "Anton";
        data[4][1] = "Chehov";
        data[4][2] = "123-456-7890";
        data[4][3] = "anton@mail.com";
        data[4][4] = "Role";

//      Sixth user with empty LastName field
        data[5][0] = "John";
        data[5][1] = "";
        data[5][2] = "123-456-7890";
        data[5][3] = "johndoe@mail.com";
        data[5][4] = "Student";

//      Last user with all data
        data[6][0] = "Anton";
        data[6][1] = "Pushkin";
        data[6][2] = "123-456-7890";
        data[6][3] = "pushkin@mail.com";
        data[6][4] = "Mentor";

        return data;
    }
}
