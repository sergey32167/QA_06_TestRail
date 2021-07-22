package test;

import Elements.Checkbox;
//import Elements.Menu;
import Elements.Menu;
import Elements.RadioButton;
import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import page.DashboardPage;
import step.LoginStep;

public class HomeWorkLesson13 extends BaseTest {

    @Test
    public void checkBox ()  {

        LoginStep loginSteps = new LoginStep(driver);
        loginSteps.loginWithCorrectCredentials(properties.getUsername(), properties.getPassword());
        driver.get("https://aqa06onl02.testrail.io/index.php?/admin/projects/add/1");

        Checkbox checkbox = new Checkbox(driver, By.id("show_announcement"));
        checkbox.changeState(true);
    }

    @Test
    public void radioButtonTest(){
        LoginStep loginSteps = new LoginStep(driver);
        loginSteps.loginWithCorrectCredentials(properties.getUsername(), properties.getPassword());
        driver.get("https://aqa06onl02.testrail.io/index.php?/admin/projects/add/1");

        RadioButton radioButton = new RadioButton(driver, By.name("suite_mode"));
        radioButton.selectByIndex(2);
        radioButton.selectByText("Use multiple test suites to manage cases");
    }

    @Test
    public void dropDownMenuTest1() throws InterruptedException {
        LoginStep loginSteps = new LoginStep(driver);
        loginSteps.loginWithCorrectCredentials(properties.getUsername(), properties.getPassword());

        DashboardPage dashboardPage = new DashboardPage(driver, true);
        dashboardPage.clickMenuButton();
//        waits.waitForVisibility(By.id("helpDropdown"));
        Menu menu = new Menu(driver, By.id("helpDropdown"));
        menu.selectByText("TestRail User Guide");
        Thread.sleep(3000);


    }
}
