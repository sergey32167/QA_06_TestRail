package step;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import page.AddProjectPage;
import page.AllProjects;

public class EditProjectStep extends BaseStep {
    public EditProjectStep(WebDriver driver) {
        super(driver);
    }

    public void editProject(String ProjectName){
        AllProjects allProjects = new AllProjects(driver,true);
        allProjects.clickEditProjectButton();
        AddProjectPage addProjectPage = new AddProjectPage(driver, true);
        addProjectPage.clearName();
        addProjectPage.setName(ProjectName);
        addProjectPage.clickAddProjectButton2();
    }
}
