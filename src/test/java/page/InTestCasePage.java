package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InTestCasePage extends BasePage {

    private final static String endpoint = "index.php?/cases/view/341";
    private final static By TestCase_button_By = By.id("navigation-suites");
    private final static By administration_Label_By = By.id("navigation-admin");
    private final static By editTestCase_button_By = By.cssSelector(".button-text");


    public InTestCasePage(WebDriver driver, boolean openPageByURL) {
        super(driver, openPageByURL);
    }

    @Override
    protected void openPage() {
        driver.get(properties.getURL() + endpoint);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return getAdministrationLabel().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public WebElement getTestCaseButton(){return driver.findElement(TestCase_button_By);}
    public WebElement getAdministrationLabel(){return driver.findElement(administration_Label_By);}
    public WebElement getEditTestCaseButton(){return driver.findElement(editTestCase_button_By);}

    public void clickTestCaseButton() {
        getTestCaseButton().click();
    }
    public void clickEditTestCaseButton() {
        getEditTestCaseButton().click();
    }
}
