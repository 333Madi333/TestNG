import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testData.dataProviderTestNg;

public class TestNg {
    WebDriver driver = null;

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\Selenium\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.close();
    }

    @Test(testName = "Orange", dataProviderClass = dataProviderTestNg.class, dataProvider = "userInfo")
    public void test03(String name, String password, String expected) throws InterruptedException {

        driver.get("https://opensource-demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/7");

        driver.findElement(By.id("txtUsername")).sendKeys(name);
        driver.findElement(By.id("txtPassword")).sendKeys(password);
        driver.findElement(By.id("btnLogin")).click();


        String expectedURL = "https://opensource-demo.orangehrmlive.com/index.php/pim/viewPersonalDetails/empNumber/7";
        String actualURL = driver.getCurrentUrl();

        if (expected.equals("pass")) {
            Assert.assertEquals(actualURL, expectedURL);
        } else {
            Assert.assertNotEquals(actualURL, expectedURL);
        }
    }
}
