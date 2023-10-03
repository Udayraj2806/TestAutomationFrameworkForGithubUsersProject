package base;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import utils.Constants;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;

@BeforeTest
public void beforeTestMethod(){

}
    @BeforeMethod
    @Parameters("browser")
    public void beforeMethodMethods(String browser, Method testMethod){
    setupDriver(browser);
        System.out.println("name of Browser"+browser);
        driver.manage().window().maximize();

        driver.get(Constants.url);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }
    @AfterMethod
    public void afterMethod(){

    }
    @AfterTest
    public void afterTest(){

    }



    public void setupDriver(String browser){
        System.out.println("I am"+browser);
        if(browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(browser.equalsIgnoreCase("edge")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
     }
}
