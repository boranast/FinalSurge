package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WorkoutTest extends BaseTest{

    @Test(description = "Adding a running workout with correct data", retryAnalyzer = Retry.class)
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
        driver.findElement(By.id("hf_great")).click();

        Select select2 = new Select(driver.findElement(By.id("PerEffort")));
        select2.selectByVisibleText("2 (Light)");
        assertTrue(select2.getOptions().get(2).isSelected());

        driver.findElement(By.id("MinHR")).sendKeys("10");
        driver.findElement(By.id("AvgHR")).sendKeys("10");
        driver.findElement(By.id("MaxHR")).sendKeys("10");
        driver.findElement(By.id("kCal")).sendKeys("500");
        driver.findElement(By.id("saveButton")).click();

    }

    @Test(description = "Adding a swimming workout with correct data", retryAnalyzer = Retry.class)
    public void addSwimWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=swim]")).click();
        driver.findElement(By.id("WorkoutTime")).sendKeys("16:30");
        driver.findElement(By.id("Name")).sendKeys("Swim");
        driver.findElement(By.id("Desc")).sendKeys("Swimming in the pool");
        driver.findElement(By.id("tIntervals")).click();
        driver.findElement(By.id("SetReps1")).sendKeys("4");
        driver.findElement(By.id("SetDist1")).sendKeys("400");
        driver.findElement(By.id("SetTime1")).sendKeys("20:00");
        driver.findElement(By.id("SetAdd1")).click();
        driver.findElement(By.id("SetRestTime1")).sendKeys("05:00");
        driver.findElement(By.id("SetRestAmount1")).sendKeys("300");

        driver.findElement(By.id("SetReps2")).sendKeys("4");
        driver.findElement(By.id("SetDist2")).sendKeys("400");
        driver.findElement(By.id("SetTime2")).sendKeys("20:00");

        driver.findElement(By.id("hf_good")).click();
        Select select = new Select(driver.findElement(By.id("PerEffort")));
        select.selectByVisibleText("1 (Very Light)");
        assertTrue(select.getOptions().get(1).isSelected());

        driver.findElement(By.id("kCal")).sendKeys("800");
        driver.findElement(By.id("saveButton")).click();

    }

    @Test(description = "Adding a Cross Training workout with correct data", retryAnalyzer = Retry.class)
    public void addCrossTrainingWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=cross-trai]")).click();
        driver.findElement(By.id("WorkoutTime")).sendKeys("16:30");
        driver.findElement(By.id("Name")).sendKeys("Cross");
        driver.findElement(By.id("Desc")).sendKeys("Cross in the park");

        driver.findElement(By.id("DistanceNoInt")).sendKeys("3500");
        Select select1 = new Select(driver.findElement(By.id("DistTypeNoInt")));
        select1.selectByVisibleText("m");
        assertTrue(select1.getOptions().get(2).isSelected());

        driver.findElement(By.id("DurationNoInt")).sendKeys("00:10:00");

        driver.findElement(By.id("hf_normal")).click();
        Select select2 = new Select(driver.findElement(By.id("PerEffort")));
        select2.selectByVisibleText("3 (Light)");
        assertTrue(select2.getOptions().get(3).isSelected());

        driver.findElement(By.id("MinHR")).sendKeys("100");
        driver.findElement(By.id("AvgHR")).sendKeys("120");
        driver.findElement(By.id("MaxHR")).sendKeys("150");
        driver.findElement(By.id("kCal")).sendKeys("800");
        driver.findElement(By.id("saveButton")).click();

    }

    @Test(description = "Adding a walking workout with correct data", retryAnalyzer = Retry.class)
    public void addWalkWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=walk]")).click();
        driver.findElement(By.id("WorkoutDate")).clear();
        driver.findElement(By.id("WorkoutDate")).sendKeys("5/25/2022");
        driver.findElement(By.id("WorkoutTime")).sendKeys("16:30");
        driver.findElement(By.id("Name")).sendKeys("Walk");
        driver.findElement(By.id("Desc")).sendKeys("Walk on the streets");

        driver.findElement(By.id("Distance")).sendKeys("5500");
        Select select1 = new Select(driver.findElement(By.id("DistType")));
        select1.selectByVisibleText("m");
        assertTrue(select1.getOptions().get(2).isSelected());

        driver.findElement(By.id("Duration")).sendKeys("00:10:00");
        driver.findElement(By.id("EGain")).sendKeys("6000");
        driver.findElement(By.id("ELoss")).sendKeys("500");


        driver.findElement(By.id("hf_normal")).click();
        Select select2 = new Select(driver.findElement(By.id("PerEffort")));
        select2.selectByVisibleText("3 (Light)");
        assertTrue(select2.getOptions().get(3).isSelected());

        driver.findElement(By.id("PowAvg")).sendKeys("100");
        driver.findElement(By.id("PowMax")).sendKeys("200");
        driver.findElement(By.id("CadAvg")).sendKeys("120");
        driver.findElement(By.id("CadMax")).sendKeys("150");
        driver.findElement(By.id("MinHR")).sendKeys("100");
        driver.findElement(By.id("AvgHR")).sendKeys("120");
        driver.findElement(By.id("MaxHR")).sendKeys("150");
        driver.findElement(By.id("kCal")).sendKeys("800");
        driver.findElement(By.id("saveButton")).click();

    }

    @Test(description = "Adding a rest day with correct data", retryAnalyzer = Retry.class)
    public void addRestDayWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=rest]")).click();
        driver.findElement(By.id("WorkoutDate")).clear();
        driver.findElement(By.id("WorkoutDate")).sendKeys("5/24/2022");

        driver.findElement(By.id("Name")).sendKeys("Rest");
        driver.findElement(By.id("Desc")).sendKeys("Resting");

        driver.findElement(By.id("saveButton")).click();

    }

    @Test(description = "Adding a Strength Training workout with correct data", retryAnalyzer = Retry.class)
    public void addStrengthTrainingWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=strength-t]")).click();
        driver.findElement(By.id("WorkoutDate")).clear();
        driver.findElement(By.id("WorkoutDate")).sendKeys("5/23/2022");
        driver.findElement(By.id("WorkoutTime")).sendKeys("16:30");
        driver.findElement(By.id("Name")).sendKeys("Strength Training");
        driver.findElement(By.id("Desc")).sendKeys("Strength Training in the gym");

        driver.findElement(By.id("DurationNoInt")).sendKeys("01:50:00");

        driver.findElement(By.id("hf_great")).click();
        Select select2 = new Select(driver.findElement(By.id("PerEffort")));
        select2.selectByVisibleText("1 (Very Light)");
        assertTrue(select2.getOptions().get(1).isSelected());

        driver.findElement(By.id("saveButton")).click();

    }

    @Test(description = "Adding a Recovery with correct data", retryAnalyzer = Retry.class)
    public void addRecoveryWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=recovery]")).click();
        driver.findElement(By.id("WorkoutDate")).clear();
        driver.findElement(By.id("WorkoutDate")).sendKeys("5/22/2022");
        driver.findElement(By.id("WorkoutTime")).sendKeys("16:30");
        driver.findElement(By.id("Name")).sendKeys("Recovery");
        driver.findElement(By.id("Desc")).sendKeys("Recovery");

        driver.findElement(By.id("saveButton")).click();

    }

    @Test(description = "Adding a Other Workout with correct data", retryAnalyzer = Retry.class)
    public void addOtherWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        driver.findElement(By.cssSelector("[data-code=other]")).click();
        driver.findElement(By.id("WorkoutDate")).clear();
        driver.findElement(By.id("WorkoutDate")).sendKeys("5/29/2022");
        driver.findElement(By.id("WorkoutTime")).sendKeys("19:00");
        driver.findElement(By.id("Name")).sendKeys("Stretching");
        driver.findElement(By.id("Desc")).sendKeys("Stretching");

        driver.findElement(By.id("saveButton")).click();

    }
}
