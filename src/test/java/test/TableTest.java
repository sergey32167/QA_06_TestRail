package test;

import Elements.Table;
import Elements.UIElement;
import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import step.LoginStep;

public class TableTest extends BaseTest {
    @Test
    public void tableTest1() throws InterruptedException {
        LoginStep loginSteps = new LoginStep(driver);
        loginSteps.loginWithCorrectCredentials(properties.getUsername(), properties.getPassword());

        driver.get("https://aqa06onl02.testrail.io/index.php?/admin/projects/overview");

        Table table = new Table(driver, By.cssSelector("table.grid"));
        //System.out.println(table.rowsCount());
        //System.out.println(table.getElementFromCell(6, 0).getText());
        UIElement editButton = table.getElementFromCell("Hello_Project", 0, 1);
        //UIElement editButton = table.getElementFromCell("Hello_Project", 0, "Edit");
        editButton.click();

        //Thread.sleep(2000);
    }
}
