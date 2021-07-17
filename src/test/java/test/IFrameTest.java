package test;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class IFrameTest extends BaseTest {

    @Test
    public void iFrameTest1(){

        driver.get("http://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame(0);

        WebElement input = driver.findElement(By.tagName("p"));
        input.clear();
        input.sendKeys("Hello");

        driver.switchTo().parentFrame();
        WebElement centre = driver.findElement(By.xpath("//button[@aria-label = 'Align center']"));
        centre.click();



    }

    @Test
    public void iFrameTest2(){

        driver.get("https://www.onliner.by/");

        WebElement search = driver.findElement(By.xpath("//input[@class = 'fast-search__input']"));
        search.clear();
        search.sendKeys("тостер");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class = 'modal-iframe']")));
        WebElement product = driver.findElement(By.xpath("//a[text() = 'Тостер Philips HD2581/00']"));
//        У меня каждый раз выводит новый товар
//        WebElement search2 = driver.findElement(By.xpath("//input[@class = 'search__input']"));
//        search2.clear();
//        search2.sendKeys(product.getText());
//        search2.click();
//        WebElement closed = driver.findElement(By.cssSelector("search__close"));
//        closed.click();
//        product.isDisplayed();
    }

 }
