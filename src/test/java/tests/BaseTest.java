package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.annotations.*;
import pages.*;

import java.time.Duration;

@Listeners(TestListener.class)
public class BaseTest {

    CalculatorPage calculatorPage;
    LoginPage loginPage;
    WebDriver driver;
    BasePage basePage;
    WorkoutPage workoutPage;
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
        } else if (browser.equalsIgnoreCase("Microsoft Edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        testContext.setAttribute("driver", driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        loginPage = new LoginPage(driver);
        basePage = new BasePage(driver);
        workoutPage = new WorkoutPage(driver);
        calculatorPage = new CalculatorPage(driver);

    }

    @AfterMethod(alwaysRun = true, description = "Closing Browser")
    public void close() {
        if (driver != null) {
            driver.quit();
        }

    }
}