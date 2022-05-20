package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkoutPage extends BasePage{

    public WorkoutPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening workout page")
    public void open() {
        driver.get(baseUrl + "WorkoutAdd.cshtml");
    }
}
