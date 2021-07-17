package test;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JsTest extends BaseTest {

    @Test
    public void jsTest1() throws InterruptedException {

        driver.get("https://www.onliner.by/");

        WebElement news = driver.findElement(By.xpath("//a[.='Новое за 24 часа']"));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", news);
//        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
//        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", news);

    }
}
