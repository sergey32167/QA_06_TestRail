package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.naming.Name;

public class AllProjects extends BasePage {

    private final static String endpoint = "index.php?/admin/projects/overview";
    private final static By project_Label_By = By.cssSelector(".content-header-title.page_title");
    private final static By delete_project_button_ByName = By.xpath("//*[text()= 'new Project']/ancestor::tr//div[@class = 'icon-small-delete']");
    private final static By edit_project_button_ByName = By.xpath("//*[text()= 'new Project']/ancestor::tr//div[@class = 'icon-small-edit']");
    private final static By yes_delete_label_By = By.xpath("//*[text() = 'Yes, delete this project (cannot be undone)']/ancestor::div[@class = 'checkbox']//input[@name = 'deleteCheckbox']");
    private final static By ok_button_By = By.xpath("//*[@id = 'deleteDialog']//a[contains(text(), 'OK')]");

    public AllProjects(WebDriver driver, boolean openPageByURL) {
        super(driver, openPageByURL);
    }

    @Override
    protected void openPage() {
        driver.get(properties.getURL() + endpoint);
    }

    @Override
    public boolean isPageOpened() {
        try {
            return getProjectLabel().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public WebElement getProjectLabel() {
        return driver.findElement(project_Label_By);
    }

    public String getProjectLabelText() {
        return getProjectLabel().getText();
    }

    public WebElement getEditButton(String project_ByName) {

        return driver.findElement(edit_project_button_ByName);
    }


    public WebElement getDeleteButton(String project_ByName) {
        return driver.findElement(delete_project_button_ByName);
    }

    public WebElement getYesDeleteLabel() {
        return driver.findElement(yes_delete_label_By);
    }

    public WebElement getOkButton() {
        return driver.findElement(ok_button_By);
    }

    public void clickEditProjectButton() {
        getEditButton("new project").click();
    }

    public void clickDeleteProjectButton() {
        getDeleteButton("new project1").click();
    }

    public void clickYesDeleteLabel() {
        getYesDeleteLabel().click();
    }

    public void clickOkButton() {
        getOkButton().click();
    }
}
