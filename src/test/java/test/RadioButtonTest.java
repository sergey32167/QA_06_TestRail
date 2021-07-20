package test;

import Elements.RadioButton;
import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import step.LoginStep;

public class RadioButtonTest extends BaseTest {

    @Test
    public void radioButtonTest1(@Optional("atrostyanko+0601@gmail.com") String login, @Optional("hYE/RiquvQVIzXfiBwm3") String psw) {
        LoginStep loginStep = new LoginStep(driver);
        loginStep.login(login, psw);

        driver.get("https://aqa06onl02.testrail.io/index.php?/admin/projects/add");
        RadioButton radioButton = new RadioButton(driver, By.name("suite_mode"));
        radioButton.selectByIndex(2);
        radioButton.selectByText("Use multiple test suites to manage cases");

    }
}
