package test;

import baseEntities.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import page.DashboardPage;
import page.LoginPage;
import step.AddProjectStep;
import step.DeleteProjectStep;
import step.EditProjectStep;
import step.LoginStep;

public class SmokeTest extends BaseTest {
    @Parameters({"login-value", "psw-value"})
    @Test
    public void positiveLoginTestFirstUser(@Optional("atrostyanko+0601@gmail.com") String login, @Optional("hYE/RiquvQVIzXfiBwm3") String psw) {
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login(login, psw);
        Assert.assertEquals(new DashboardPage(driver,true).getLabelText(),"DASHBOARD", "Страница Dashboard не открылась");
    }

    @Test
    public void negativeLoginTest1(@Optional("sergey") String login, @Optional("11111") String psw) {
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login(login, psw);
        Assert.assertEquals(new LoginPage(driver, false).getErrorLabelText(), "Email/Login or Password is incorrect. Please try again.");
    }

    @Test
    public void addProjectTest(@Optional("atrostyanko+0601@gmail.com") String login, @Optional("hYE/RiquvQVIzXfiBwm3")String psw){
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login(login, psw);
        AddProjectStep addProjectStep = new AddProjectStep(driver);
        addProjectStep.addProject("new Project");

    }

    @Test
    public void editProjectTest(@Optional("atrostyanko+0601@gmail.com") String login, @Optional("hYE/RiquvQVIzXfiBwm3")String psw) throws InterruptedException {
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login(login, psw);
        AddProjectStep addProjectStep = new AddProjectStep(driver);
        addProjectStep.addProject("new Project");
        EditProjectStep editProjectStep = new EditProjectStep(driver);
        editProjectStep.editProject("new Project1");
    }

    @Test
    public void deleteProjectTest(@Optional("atrostyanko+0601@gmail.com") String login, @Optional("hYE/RiquvQVIzXfiBwm3")String psw) throws InterruptedException {
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login(login, psw);
        AddProjectStep addProjectStep = new AddProjectStep(driver);
        addProjectStep.addProject("new Project");
        EditProjectStep editProjectStep = new EditProjectStep(driver);
        editProjectStep.editProject("new Project1");
        DeleteProjectStep deleteProjectStep = new DeleteProjectStep(driver);
        deleteProjectStep.deleteProject("new Project1");
    }



}
