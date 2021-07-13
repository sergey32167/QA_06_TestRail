package step;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import page.AllProjects;

public class DeleteProjectStep extends BaseStep {
    public DeleteProjectStep(WebDriver driver) {
        super(driver);
    }

    public void deleteProject(String ProjectName) {
        AllProjects allProjects = new AllProjects(driver,true);
        allProjects.clickDeleteProjectButton();
        allProjects.clickYesDeleteLabel();
        allProjects.clickOkButton();
    }
}
