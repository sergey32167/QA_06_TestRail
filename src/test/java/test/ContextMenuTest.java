package test;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextMenuTest extends BaseTest {

    @Test
    public void contextTest (){

        driver.get("http://the-internet.herokuapp.com/context_menu");

        WebElement field = driver.findElement(By.id("hot-spot"));

        Actions actions = new Actions(driver);
        actions.contextClick(field).build().perform();

    }

}

