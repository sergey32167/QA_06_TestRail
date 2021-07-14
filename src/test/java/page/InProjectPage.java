package page;

import baseEntities.BasePage;
import org.openqa.selenium.*;

public class InProjectPage extends BasePage {

    private final static String endpoint = "index.php?/projects/overview/676";
    private final static By testCase_Button_By = By.id("navigation-suites");
    private final static By returnDashboard_Label_By = By.id("navigation-dashboard-top");

    public InProjectPage(WebDriver driver, boolean openPageByURL) {
        super(driver, openPageByURL);
    }

    @Override
    protected void openPage() {
        driver.get(properties.getURL() + endpoint);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return getReturnDashboardLabel().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public WebElement getTestCaseButton() {
        return driver.findElement(testCase_Button_By);
    }
    public WebElement getReturnDashboardLabel() {
        return driver.findElement(returnDashboard_Label_By);
    }
    public String getReturnLabelText() {
        return getReturnDashboardLabel().getText();
    }
    public void clickTestCaseButton (){getTestCaseButton().click();}
}
