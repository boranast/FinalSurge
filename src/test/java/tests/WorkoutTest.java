package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkoutTest extends BaseTest{

    @Test
    public void addRunWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=run]")).click();
        driver.findElement(By.id("WorkoutTime")).sendKeys("16:30");
        driver.findElement(By.id("Name")).sendKeys("Run");
        driver.findElement(By.id("Desc")).sendKeys("Running in the park");
        driver.findElement(By.id("Distance")).sendKeys("3000");
        driver.findElement(By.id("Duration")).sendKeys("03:19:06");
        driver.findElement(By.id("Pace")).sendKeys("03:19");
        driver.findElement(By.id("hf_great")).click();

        Select select = new Select(driver.findElement(By.id("PerEffort")));
        select.selectByVisibleText("2 (Light)");
        assertTrue(select.getOptions().get(2).isSelected());

        driver.findElement(By.id("MinHR")).sendKeys("10");
        driver.findElement(By.id("AvgHR")).sendKeys("10");
        driver.findElement(By.id("MaxHR")).sendKeys("10");
        driver.findElement(By.id("kCal")).sendKeys("500");
        driver.findElement(By.id("saveButton")).click();

    }

}
