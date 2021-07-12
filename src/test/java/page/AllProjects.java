package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class AllProjects extends BasePage {

    private final static String endpoint = "index.php?/admin/projects/overview";
    private final static By Project_Label_By = By.cssSelector(".content-header-title.page_title");
    private final static By projectName_Input_By = By.id("name");
    private final static By add_project_button2_By = By.id("accept");

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
}
