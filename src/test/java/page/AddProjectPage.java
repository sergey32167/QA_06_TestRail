package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddProjectPage extends BasePage {

    private final static String endpoint = "index.php?/admin/projects/add/1";
    private final static By addProject_Label_By = By.cssSelector(".content-header-title.page_title");
    private final static By projectName_Input_By = By.id("name");
    private final static By add_project_button2_By = By.id("accept");

    public AddProjectPage(WebDriver driver, boolean openPageByURL) {
        super(driver, openPageByURL);
    }

    @Override
    protected void openPage() {
        driver.get(properties.getURL() + endpoint);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return getAddProjectLabel().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public WebElement getAddProjectLabel(){
        return driver.findElement(addProject_Label_By);
    }

    public WebElement getProjectName (){
        return driver.findElement(projectName_Input_By);
    }

    public WebElement getAddProjectButton2 (){
        return driver.findElement(add_project_button2_By);
    }

    public void setName(String text) {
        getProjectName().sendKeys(text);
    }

    public void clearName (){
        getProjectName().clear();
    }

    public void clickAddProjectButton2() {
        getAddProjectButton2().click();
    }

}
