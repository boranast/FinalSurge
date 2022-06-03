package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CalculatorPage extends BasePage{
    public CalculatorPage(WebDriver driver) {
        super(driver);
    }


    @Step("Opening calculator")
    public void open() {
        driver.get(baseUrl + "Calendar.cshtml");
        driver.findElement(By.cssSelector("[data-reveal-id=OtherCalc]")).click();
        driver.switchTo().frame("OtherCalciFrame");
    }

    @Step("Choosing pace calculator")
    public void paceCalc() {
        driver.findElement(By.xpath("//a[contains(text(),'Pace Calculator')]")).click();
    }

   @Step("Filling distance input")
    public void distanceInput(String distance) {
        driver.findElement(By.id("RunDist")).sendKeys(distance);
    }

    @Step("Filling time input")
    public void timeInput(String hours, String minutes, String seconds) {
        driver.findElement(By.id("TimeHH")).sendKeys(hours, minutes, seconds);
    }

    @Step("Filling distance input")
    public void saveButton() {
        driver.findElement(By.id("saveButtonSettings")).click();
    }

    @Step("Search for a pace")
    public String getPace() {
        return driver.findElement(By.xpath("//*[@class='w-box-header']//*[text()='Pace Chart']")).getText();
    }

    @Step("Filling weight input")
    public void weightInput(String weight) {
         driver.findElement(By.id("Weight")).sendKeys(weight);
    }

    @Step("Filling height input")
    public void heightInput(String height) {
        driver.findElement(By.id("HeightInchCent")).sendKeys(height);
    }

    @Step("Filling age input")
    public void ageInput(String age) {
        driver.findElement(By.id("Age")).sendKeys(age);
    }


}
