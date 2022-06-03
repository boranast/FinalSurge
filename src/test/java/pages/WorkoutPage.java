package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import static org.testng.Assert.assertTrue;

public class WorkoutPage extends BasePage{

    public WorkoutPage(WebDriver driver) {
        super(driver);
    }

    @Step("Opening workout page")
    public void open() {
        driver.get(baseUrl + "WorkoutAdd.cshtml");
    }

    @Step("Opening the run tab")
    public void runOpen() {
        driver.findElement(By.cssSelector("[data-code=run]")).click();
    }

    @Step("Opening the swim tab")
    public void swimOpen() {
        driver.findElement(By.cssSelector("[data-code=swim]")).click();
    }

    @Step("Opening the cross training tab")
    public void crossTrainingOpen() {
        driver.findElement(By.cssSelector("[data-code=cross-trai]")).click();
    }

    @Step("Opening the walk tab")
    public void walkOpen() {
        driver.findElement(By.cssSelector("[data-code=walk]")).click();
    }

    @Step("Opening the rest tab")
    public void restOpen() {
        driver.findElement(By.cssSelector("[data-code=rest]")).click();
    }

    @Step("Opening the strenght training tab")
    public void strenghtTrainingOpen() {
        driver.findElement(By.cssSelector("[data-code=strength-t]")).click();
    }

    @Step("Opening the recovery tab")
    public void recoveryOpen() {
        driver.findElement(By.cssSelector("[data-code=recovery]")).click();
    }

    @Step("Opening the other tab")
    public void otherOpen() {
        driver.findElement(By.cssSelector("[data-code=other]")).click();
    }

    @Step("Filling workout date input: Date - '{date}'")
    public void dateWorkout(String date) {
        driver.findElement(By.id("WorkoutDate")).sendKeys(date);
    }

    @Step("Clining input date")
    public void clearDateWorkout() {
        driver.findElement(By.id("WorkoutDate")).clear();
    }

    @Step("Filling workout time input: Time - '{time}'")
    public void timeWorkout(String time) {
        driver.findElement(By.id("WorkoutTime")).sendKeys(time);
    }

    @Step("Filling workout name input: Name - '{name}'")
    public void nameWorkout(String name) {
        driver.findElement(By.id("Name")).sendKeys(name);
    }

    @Step("Filling workout description input: Description - '{description}'")
    public void descriptionWorkout(String description) {
        driver.findElement(By.id("Desc")).sendKeys(description);
    }

    @Step("Filling workout distance input: Distance - '{distance}'")
    public void distanceWorkout(String distance) {
        driver.findElement(By.id("Distance")).sendKeys(distance);
        Select select1 = new Select(driver.findElement(By.id("DistType")));
        select1.selectByVisibleText("m");
        assertTrue(select1.getOptions().get(2).isSelected());
    }

    @Step("Filling workout distance input: Distance - '{distance}'")
    public void distanceForCrossTrainingWorkout(String distance) {
        driver.findElement(By.id("DistanceNoInt")).sendKeys(distance);
        Select select1 = new Select(driver.findElement(By.id("DistTypeNoInt")));
        select1.selectByVisibleText("m");
        assertTrue(select1.getOptions().get(2).isSelected());
    }

    @Step("Filling workout duration input: Duration - '{duration}'")
    public void durationWorkout(String duration) {
        driver.findElement(By.id("Duration")).sendKeys(duration);
    }

    @Step("Filling workout duration input: Duration - '{duration}'")
    public void durationNoIntWorkout(String duration) {
        driver.findElement(By.id("DurationNoInt")).sendKeys(duration);
    }

    @Step("Сhoosing an advanced workout")
    public void advancedWorkout() {
        driver.findElement(By.id("tIntervals")).click();
    }

    @Step("Filling workout reps input: Reps - '{reps}'")
    public void repsOfSetWorkout(String reps) {
        driver.findElement(By.id("SetReps1")).sendKeys(reps);
    }

    @Step("Filling workout distance input: Distance - '{distance}'")
    public void distanceOfSetWorkout(String distance) {
        driver.findElement(By.id("SetDist1")).sendKeys(distance);
    }

    @Step("Filling workout duration input: Duration - '{duration}'")
    public void durationOfSetWorkout(String duration) {
        driver.findElement(By.id("SetTime1")).sendKeys(duration);
    }

    @Step("Filling  minHR input: MinHR - '{minHR}'")
    public void minHRWorkout(String minHR) {
        driver.findElement(By.id("MinHR")).sendKeys(minHR);
    }

    @Step("Filling avgHR input: AvgHR - '{avgHR}'")
    public void avgHRWorkout(String avgHR) {
        driver.findElement(By.id("AvgHR")).sendKeys(avgHR);
    }

    @Step("Filling maxHR input: MaxHR - '{maxHR}'")
    public void maxHRWorkout(String maxHR) {
        driver.findElement(By.id("MaxHR")).sendKeys(maxHR);
    }

    @Step("Filling kCal input: KCal - '{kCal}'")
    public void kCalWorkout(String kCal) {
        driver.findElement(By.id("kCal")).sendKeys(kCal);
    }

    @Step("Filling powAvg input: PowAvg - '{kCal}'")
    public void powAvgWorkout(String powAvg) {
    driver.findElement(By.id("PowAvg")).sendKeys(powAvg);
    }

    @Step("Filling powMax input: PowMax - '{powMax}'")
    public void powMaxWorkout(String powMax) {
    driver.findElement(By.id("PowMax")).sendKeys(powMax);
    }

    @Step("Filling cadAvg input: CadAvg - '{cadAvg}'")
    public void cadAvgWorkout(String cadAvg) {
    driver.findElement(By.id("CadAvg")).sendKeys(cadAvg);
    }

    @Step("Filling cadMax input: CadMax - '{cadMax}'")
    public void cadMaxlWorkout(String cadMax) {
        driver.findElement(By.id("CadMax")).sendKeys(cadMax);
    }

    @Step("Filling Elevation Gain input: Elevation Gain - '{EGain}'")
    public void elevationGainWorkout(String elevationGain) {
        driver.findElement(By.id("EGain")).sendKeys(elevationGain);
    }

    @Step("Filling Elevation Loss input: Elevation Loss - '{ELoss}'")
    public void elevationLossWorkout(String elevationLoss) {
        driver.findElement(By.id("ELoss")).sendKeys(elevationLoss);
    }

    @Step("The mark of great feelings")
    public void feelGreat() {
        driver.findElement(By.id("hf_great")).click();
    }

    @Step("The mark good feelings")
    public void feelGood() {
        driver.findElement(By.id("hf_good")).click();
    }

    @Step("The mark of normal feelings")
    public void feelNormal() {
        driver.findElement(By.id("hf_normal")).click();
    }

    @Step("The mark of terrible feelings")
    public void feelTerrible() {
        driver.findElement(By.id("hf_terrible")).click();
    }

    @Step("The mark of Perceived Effort as 'Very Light'")
    public void perceivedEffortIsVeryLight() {
        Select select = new Select(driver.findElement(By.id("PerEffort")));
        select.selectByVisibleText("1 (Very Light)");
        assertTrue(select.getOptions().get(1).isSelected());
    }

    @Step("The mark of Perceived Effort as '6 (Moderate)'")
    public void perceivedEffortIsModerate() {
        Select select = new Select(driver.findElement(By.id("PerEffort")));
        select.selectByVisibleText("6 (Moderate)");
        assertTrue(select.getOptions().get(6).isSelected());
    }

    @Step("The mark of Perceived Effort as '8 (Hard)'")
    public void perceivedEffortIsHard() {
        Select select = new Select(driver.findElement(By.id("PerEffort")));
        select.selectByVisibleText("8 (Hard)");
        assertTrue(select.getOptions().get(8).isSelected());
    }

    @Step("The mark of Perceived Effort as '9 (Very Hard)'")
    public void perceivedEffortIsVeryHard() {
        Select select = new Select(driver.findElement(By.id("PerEffort")));
        select.selectByVisibleText("9 (Very Hard)");
        assertTrue(select.getOptions().get(9).isSelected());
    }

    @Step("The mark of Perceived Effort as '10 (Max Effort)'")
    public void perceivedEffortIsMaxEffort() {
        Select select = new Select(driver.findElement(By.id("PerEffort")));
        select.selectByVisibleText("10 (Max Effort)");
        assertTrue(select.getOptions().get(10).isSelected());
    }

    @Step("Save button for workout")
    public void saveWorkout() {
        driver.findElement(By.id("saveButton")).click();
    }

    @Step("Search for a workout")
    public String getWorkout() {
        return driver.findElement(By.className("activityTypeName")).getText();
    }
}
