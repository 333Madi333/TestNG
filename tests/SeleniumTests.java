import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testData.dataProvider;

import java.lang.reflect.Method;


public class SeleniumTests {
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


    @Test(testName = "Google Title test", description = "Testing if title is 'Google'", priority = 2)
    public void testGoogleTitle(Method method){
        driver.get("https://www.google.com/");
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Test testDetails = method.getAnnotation(Test.class);

        Reporter.log(testDetails.testName());
        Reporter.log(testDetails.description());
    }
    @Test(enabled = false)
    public void testAmazonTitle(){
        String url = "https://www.amazon.com/";
        driver.get(url);
        String expectedTitle = "Amazon.com. Spend less. Smile more.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    @Test(priority = 0, invocationTimeOut = 5000)
    public void testTlaAlertUrl(){
        String url = "http://automation.techleadacademy.io/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Alert']")).click();
        String expectedUrl = "http://automation.techleadacademy.io/#/alert";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }
    @Test(invocationCount = 20)
    public void testOrbitzSignIn(){
        driver.get("https://www.orbitz.com/");
        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign in']")).isEnabled());
    }

    @Test(dataProvider = "loginData", dataProviderClass = dataProvider.class)
    public void test02(String username, String password){
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.findElement(By.xpath("//*[@class='title']")).getText(), "PRODUCTS");

    }

}
