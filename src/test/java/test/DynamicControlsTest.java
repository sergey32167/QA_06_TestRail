package test;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class DynamicControlsTest extends BaseTest {

    @Test
    public void DynamicTest (){

        driver.get("http://the-internet.herokuapp.com/dynamic_controls");


        WebElement checkBox = driver.findElement(By.id("checkbox"));
        checkBox.click();
        WebElement button1 = driver.findElement(By.xpath("//button[text() = 'Remove']"));
        button1.click();
        waits.waitForVisibility(By.id("message"));
        waits.waitForInvisibility(By.id("checkbox"), 5);
        WebElement input = driver.findElement(By.xpath("//input"));
        input.isEnabled();
        WebElement button2 = driver.findElement(By.xpath("//button[text() = 'Enable']"));
        button2.click();
        waits.waitForVisibility(By.id("message"));
        input.isEnabled();

    }

}

