package step;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import page.DashboardPage;
import page.LoginPage;

public class LoginStep extends BaseStep {
    public LoginStep(WebDriver driver) {
        super(driver);
    }

    public DashboardPage loginWithCorrectCredentials(String email, String psw) {
        LoginPage loginPage = new LoginPage(driver, true);
        loginPage.getEmailInput().sendKeys(email);
        loginPage.getPasswordInput().sendKeys(psw);
        loginPage.getLoginButton().click();

        return new DashboardPage(driver, false);
    }

    public void login(String username, String password) {
        LoginPage loginPage = new LoginPage(driver, true);
        loginPage.setUsername(username);
        loginPage.setPassword(password);
        loginPage.clickLoginButton();

    }
}
