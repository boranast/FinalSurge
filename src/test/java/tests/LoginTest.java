package tests;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest{
    @DataProvider(name = "Входящие данные для негативных тестов на логин")
    public Object[][] loginData() {
        return new Object[][]{
                {"qa17_3@mailinator.com", "", "Please enter a password."},
                {"", "Password01", "Please enter your e-mail address."},
        };
    }

    @Test(dataProvider = "Входящие данные для негативных тестов на логин")
    public void passwordShouldBeRequired(String user, String password, String error) {
        loginPage.open();
        loginPage.login(user, password);
        assertEquals(loginPage.getError(), error, "Сообщение об ошибке при логине некорректное");
    }
}
