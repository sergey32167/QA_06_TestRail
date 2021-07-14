package step;

import baseEntities.BaseStep;
import org.openqa.selenium.WebDriver;
import page.*;

public class AddEditDeleteTestCaseStep extends BaseStep {
    public AddEditDeleteTestCaseStep(WebDriver driver) {
        super(driver);
    }

    public void addTestCase(){
        DashboardPage dashboardPage = new DashboardPage(driver,true);
        dashboardPage.getProjectButton("Hello Test");
        InProjectPage inProjectPage = new InProjectPage(driver,true);
        inProjectPage.clickTestCaseButton();
        TestCasePages testCasePages = new TestCasePages(driver,true);
        testCasePages.clickAddTestCaseButton();
        AddTestCasePage addTestCasePage = new AddTestCasePage(driver,true);
        addTestCasePage.setTitle("www");
        addTestCasePage.setRecond("qwerty");
        addTestCasePage.getAddTestCaseButton2();
        InTestCasePage inTestCasePage = new InTestCasePage(driver,true);
        inTestCasePage.clickEditTestCaseButton();
        addTestCasePage.setTitle("www1");
        addTestCasePage.setRecond("qwerty1");
        addTestCasePage.getAddTestCaseButton2();
        inTestCasePage.getTestCaseButton();
        testCasePages.clickOkTestCaseButton();
        testCasePages.clickDeleteTestCaseButton();
        testCasePages.clickDeleteSomeTestCaseButton1();
        testCasePages.clickDeleteSomeTestCaseButton2();
    }
}
