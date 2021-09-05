import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testData.dataProviderNames;

public class HomeWorkTestData {
    WebDriver driver = null;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test(testName = "New User input test", dataProvider = "userInfo", dataProviderClass = dataProviderNames.class)
    public void test03(String firstName, String lastName, String phoneNum, String email, String role) throws InterruptedException {
//       Navigating to user management page
        driver.get("http://automation.techleadacademy.io/#/usermgt");

//       Filling out fields with data from data provider
        driver.findElement(By.id("Firstname")).sendKeys(firstName);
        driver.findElement(By.id("Lastname")).sendKeys(lastName);
        driver.findElement(By.id("Phonenumber")).sendKeys(phoneNum);
        driver.findElement(By.id("Email")).sendKeys(email);

//        Selecting role
        Select select = new Select(driver.findElement(By.id("Select-role")));
        select.selectByVisibleText(role);

//        Verifying if Submit data is enabled
        Assert.assertTrue(driver.findElement(By.id("submit-btn")).isEnabled());

    }


}
