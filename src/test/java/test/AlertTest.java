package test;

import baseEntities.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertTest extends BaseTest {


    @Test
    public void AlertTest1 (){

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement buttonAlert = driver.findElement(By.xpath("//button[text() = 'Click for JS Alert']"));
        buttonAlert.click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(), "You successfully clicked an alert");

    }

    @Test
    public void AlertTest2 (){

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement buttonConfirm = driver.findElement(By.xpath("//button[text() = 'Click for JS Confirm']"));
        buttonConfirm.click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(), "You clicked: Cancel");

    }

    @Test
    public void AlertTest3 (){

        driver.get("http://the-internet.herokuapp.com/javascript_alerts");

        WebElement buttonPrompt = driver.findElement(By.xpath("//button[text() = 'Click for JS Prompt']"));
        buttonPrompt.click();
        Alert alert = driver.switchTo().alert();
        alert.sendKeys("Hello");
        alert.accept();
        WebElement result = driver.findElement(By.id("result"));
        Assert.assertEquals(result.getText(), "You entered: Hello");

    }
}
