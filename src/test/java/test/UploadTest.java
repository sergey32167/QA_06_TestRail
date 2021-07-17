package test;

import baseEntities.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadTest extends BaseTest {

    @Test
    public void uploadFileTest() throws InterruptedException {

        driver.get("http://the-internet.herokuapp.com/upload");

        WebElement inputButton = driver.findElement(By.id("file-upload"));
        inputButton.sendKeys(""); // пока не до конца разобрал... как пойму сразу допишу
        WebElement uploadButton = driver.findElement(By.id("file-submit"));
        uploadButton.click();
        Thread.sleep(2000);
        WebElement fileLabel =driver.findElement(By.id("uploaded-files"));
        Assert.assertEquals(fileLabel.getText(), "how-to-upload-file-with-relative-path-in-selenium-webdriver[1]");
    }
}
