package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {
    private WebDriverWait wait;

    public Waits(WebDriver driver, int timeOut) {
        wait = new WebDriverWait(driver, timeOut);
    }

    public Boolean waitForVisibility(By by) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }

}
