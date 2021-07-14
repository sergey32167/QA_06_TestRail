package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestCasePages extends BasePage {

    private final static String endpoint = "index.php?/suites/view/646";
    private final static By addTestCase_button_By = By.id("sidebar-cases-add");
    private final static By administration_Label_By = By.id("navigation-admin");
    private final static By okTestCase_button_By = By.xpath("//input[@class ='selectionCheckbox' and @name]");
    private final static By deleteTestCase_button_By = By.xpath("//span[@class = 'button-text' and text() = 'Delete']");
    private final static By delete_test_case_button1_By = By.xpath("//div[@class = 'button-group dialog-buttons-highlighted']/a[contains(@class, 'dialog-action-secondary button-black')]");
    private final static By delete_test_case_button2_By = By.xpath("//div[@class = 'button-group dialog-buttons-highlighted']/a[contains(@class, 'button button-left button-black dialog-action-default')]");

    public TestCasePages(WebDriver driver, boolean openPageByURL) {
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

    public WebElement getAddTestCaseButton() {
        return driver.findElement(addTestCase_button_By);
    }
    public WebElement getAdministrationLabel() {
        return driver.findElement(administration_Label_By);
    }
    public String getAdministrationLabelText() {
        return getAdministrationLabel().getText();
    }
    public WebElement getOkTestCaseButton() {
        return driver.findElement(okTestCase_button_By);
    }
    public WebElement getDeleteTestCaseButton() {
        return driver.findElement(deleteTestCase_button_By);
    }
    public WebElement getDeleteSomeTestCaseButton1() {
        return driver.findElement(delete_test_case_button1_By);
    }

    public WebElement getDeleteTestCaseButton2() {
        return driver.findElement(delete_test_case_button2_By);
    }
    public void clickAddTestCaseButton (){getAddTestCaseButton().click();}
    public void clickOkTestCaseButton (){getOkTestCaseButton().click();}
    public void clickDeleteTestCaseButton (){getDeleteTestCaseButton().click();}
    public void clickDeleteSomeTestCaseButton1() {getDeleteSomeTestCaseButton1().click();}
    public void clickDeleteSomeTestCaseButton2() {getDeleteTestCaseButton2().click();}
}
