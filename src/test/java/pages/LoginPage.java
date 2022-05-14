package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    public static final By USER_INPUT = By.id("login_name");
    public static final By PASSWORD_INPUT = By.id("login_password");
    public static final By LOGIN_BUTTON = By.className("btn btn-beoro-1");
    public static final By ERROR_MESSAGE = By.className("error");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening login page")
    public void open() {
        driver.get(baseUrl);
    }

    @Step("Login by user {user} using password {password}")
    public void login(String user, String password) {
        driver.findElement(USER_INPUT).sendKeys(user);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

    }

    @Step("Getting error message")
    public String getError() {
        return driver.findElement(ERROR_MESSAGE).getText();
    }
}
