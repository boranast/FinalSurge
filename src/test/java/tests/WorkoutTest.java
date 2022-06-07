package tests;

import org.testng.annotations.Test;

public class WorkoutTest extends BaseTest{

    @Test(description = "Adding a running workout with correct data", retryAnalyzer = Retry.class)
    public void addRunWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.runOpen();
        workoutPage.timeWorkout("15:00");
        workoutPage.nameWorkout("Run");
        workoutPage.descriptionWorkout("Running in the park");
        workoutPage.distanceWorkout("3000");
        workoutPage.durationWorkout("01:19:06");
        workoutPage.feelGreat();
        workoutPage.perceivedEffortIsMaxEffort();
        workoutPage.minHRWorkout("100");
        workoutPage.avgHRWorkout("120");
        workoutPage.maxHRWorkout("140");
        workoutPage.kCalWorkout("300");
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }


    @Test(description = "Adding a swimming workout with correct data", retryAnalyzer = Retry.class)
    public void addSwimWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.swimOpen();
        workoutPage.clearDateWorkout();
        workoutPage.dateWorkout("5/25/2022");
        workoutPage.timeWorkout("15:30");
        workoutPage.nameWorkout("Swim");
        workoutPage.descriptionWorkout("Swimming in the pool");
        workoutPage.advancedWorkout();
        workoutPage.repsOfSetWorkout("5");
        workoutPage.distanceOfSetWorkout("500");
        workoutPage.durationOfSetWorkout("20:00");
        workoutPage.feelGreat();
        workoutPage.perceivedEffortIsVeryHard();
        workoutPage.kCalWorkout("200");
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }

    @Test(description = "Adding a Cross Training workout with correct data", retryAnalyzer = Retry.class)
    public void addCrossTrainingWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.crossTrainingOpen();
        workoutPage.clearDateWorkout();
        workoutPage.dateWorkout("5/13/2022");
        workoutPage.timeWorkout("12:00");
        workoutPage.nameWorkout("Cross");
        workoutPage.descriptionWorkout("Cross in the park");
        workoutPage.distanceForCrossTrainingWorkout("3500");
        workoutPage.durationNoIntWorkout("00:10:00");
        workoutPage.feelNormal();
        workoutPage.perceivedEffortIsHard();
        workoutPage.minHRWorkout("100");
        workoutPage.avgHRWorkout("120");
        workoutPage.maxHRWorkout("140");
        workoutPage.kCalWorkout("300");
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }

    @Test(description = "Adding a walking workout with correct data", retryAnalyzer = Retry.class)
    public void addWalkWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.walkOpen();
        workoutPage.clearDateWorkout();
        workoutPage.dateWorkout("5/25/2022");
        workoutPage.timeWorkout("16:00");
        workoutPage.nameWorkout("Walk");
        workoutPage.descriptionWorkout("Walk on the streets");
        workoutPage.distanceWorkout("5500");
        workoutPage.durationWorkout("00:10:00");
        workoutPage.elevationGainWorkout("400");
        workoutPage.elevationLossWorkout("500");
        workoutPage.feelTerrible();
        workoutPage.perceivedEffortIsModerate();
        workoutPage.powAvgWorkout("100");
        workoutPage.powMaxWorkout("200");
        workoutPage.cadAvgWorkout("120");
        workoutPage.cadMaxlWorkout("150");
        workoutPage.minHRWorkout("100");
        workoutPage.avgHRWorkout("120");
        workoutPage.maxHRWorkout("140");
        workoutPage.kCalWorkout("300");
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }

    @Test(description = "Adding a rest day with correct data", retryAnalyzer = Retry.class)
    public void addRestDayWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.restOpen();
        workoutPage.clearDateWorkout();
        workoutPage.dateWorkout("5/24/2022");
        workoutPage.nameWorkout("Rest");
        workoutPage.descriptionWorkout("Resting");
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }

    @Test(description = "Adding a Strength Training workout with correct data", retryAnalyzer = Retry.class)
    public void addStrengthTrainingWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.strenghtTrainingOpen();
        workoutPage.clearDateWorkout();
        workoutPage.dateWorkout("5/23/2022");
        workoutPage.timeWorkout("15:30");
        workoutPage.nameWorkout("Strength Training");
        workoutPage.descriptionWorkout("Strength Training in the gym");
        workoutPage.durationNoIntWorkout("01:50:00");
        workoutPage.feelGreat();
        workoutPage.perceivedEffortIsVeryLight();
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }

    @Test(description = "Adding a Recovery with correct data", retryAnalyzer = Retry.class)
    public void addRecoveryWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.recoveryOpen();
        workoutPage.clearDateWorkout();
        workoutPage.dateWorkout("5/22/2022");
        workoutPage.timeWorkout("16:30");
        workoutPage.nameWorkout("Recovery");
        workoutPage.descriptionWorkout("Recovery");
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }

    @Test(description = "Adding a Other Workout with correct data", retryAnalyzer = Retry.class)
    public void addOtherWorkout() {
        loginPage.open();
        loginPage.login(USER, PASSWORD);
        workoutPage.open();
        workoutPage.otherOpen();
        workoutPage.clearDateWorkout();
        workoutPage.dateWorkout("5/29/2022");
        workoutPage.timeWorkout("19:00");
        workoutPage.nameWorkout("Stretching");
        workoutPage.descriptionWorkout("Stretching");
        workoutPage.saveWorkout();
        workoutPage.getWorkout();
    }
}
