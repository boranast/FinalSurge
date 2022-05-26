package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    LoginPage loginPage;
    WebDriver driver;
    BasePage basePage;
    WorkoutPage workoutPage;
    String baseUrl = "https://www.fitday.com/fitness/Login.html";
    public static final String USER = "qa17_3@mailinator.com";
    public static final String PASSWORD = "Password01";

    @Parameters({"browser"})
    @BeforeMethod(description = "Opening browser")
    public void setup(@Optional("chrome") String browser, ITestContext testContext) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            //options.addArguments("--headless");
            driver = new ChromeDriver(options);
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }

        testContext.setAttribute("driver", driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
        workoutPage = new WorkoutPage(driver);

    }

    @AfterMethod(alwaysRun = true, description = "Closing Browser")
    public void close() {
        if (driver != null) {
            driver.quit();
        }

    }
}