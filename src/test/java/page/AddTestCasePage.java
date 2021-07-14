package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddTestCasePage extends BasePage {

    private final static String endpoint = "index.php?/cases/add/646";
    private final static By addTestCase_button2_By = By.id("accept");
    private final static By administration_Label_By = By.id("navigation-admin");
    private final static By title_Input_By = By.id("title");
    private final static By preconds_Input_By = By.id("custom_preconds_display");


    public AddTestCasePage(WebDriver driver, boolean openPageByURL) {
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

    public WebElement getAddTestCaseButton2(){return driver.findElement(addTestCase_button2_By);}
    public WebElement getAdministrationLabel(){return driver.findElement(administration_Label_By);}
    public WebElement getTitleInput(){return driver.findElement(title_Input_By);}
    public WebElement getRecondInput(){return driver.findElement(preconds_Input_By);}

    public void setTitle(String text) {
        getTitleInput().sendKeys(text);
    }

    public void setRecond(String text) {
        getRecondInput().sendKeys(text);
    }

    public void clickAddTestCaseButton2() {
        getAddTestCaseButton2().click();
    }
}
