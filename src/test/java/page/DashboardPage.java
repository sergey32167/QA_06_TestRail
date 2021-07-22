package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DashboardPage extends BasePage {

    private final static String endpoint = "index.php?/dashboard";
    private final static By dashboard_Label_By = By.id("navigation-dashboard");
    private final static By addProject_Button_By = By.id("sidebar-projects-add");
    private final static By project_button_ByName = By.xpath("//*[text()= 'HelloTest']");
    private final static By menu_Button_By = By.id("navigation-menu");


    public DashboardPage(WebDriver driver, boolean openPageByURL) {
        super(driver, openPageByURL);
    }

    @Override
    protected void openPage() {
        driver.get(properties.getURL() + endpoint);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return getDashboardLabel().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public WebElement getDashboardLabel(){
        return driver.findElement(dashboard_Label_By);
    }
    public String getLabelText (){ return getDashboardLabel().getText();    }
    public WebElement getAddProjectButton(){
        return driver.findElement(addProject_Button_By);
    }
    public WebElement getMenuButton(){
        return driver.findElement(menu_Button_By);
    }

    public WebElement getProjectButton(String project_ByName) { return driver.findElement(project_button_ByName); }

    public void clickAddProjectButton() {
        getAddProjectButton().click();
    }
    public void clickMenuButton() { getMenuButton().click();
    }

    public void clickProjectButton (){
        getProjectButton("Hello Test").click();}
}
