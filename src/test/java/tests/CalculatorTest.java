package tests;

import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{

    @Test(description = "Positive test with right inputs")
    public void paceCalcPositiveTest() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calculatorPage.open();
        calculatorPage.paceCalc();
        calculatorPage.distanceInput("2000");
        calculatorPage.timeInput("2", "03", "23");
        calculatorPage.saveButton();
        calculatorPage.getPace();
    }

    @Test
    public void caloricNeedsPositiveTest() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        calculatorPage.open();
        calculatorPage.weightInput("48");
        calculatorPage.heightInput("168");
        calculatorPage.ageInput("20");
        calculatorPage.femaleGender();
        calculatorPage.runDistance("200");
        calculatorPage.saveButton();
        calculatorPage.getCaloricNeeds();
    }
}
