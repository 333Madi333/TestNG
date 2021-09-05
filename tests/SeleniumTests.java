import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

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


    @Test(testName = "Google Title test", description = "Testing if title is 'Google'")
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
    @Test
    public void testTlaAlertUrl(){
        String url = "http://automation.techleadacademy.io/";
        driver.get(url);
        driver.findElement(By.xpath("//a[text()='Alert']")).click();
        String expectedUrl = "http://automation.techleadacademy.io/#/alert";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);

    }
    @Test
    public void testOrbitzSignIn(){
        String url = "https://www.orbitz.com/";
        driver.get(url);
        Assert.assertTrue(driver.findElement(By.xpath("//button[text()='Sign in']")).isEnabled());
    }
}
