package page;

import baseEntities.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {

    private final static By username_Input_By = By.id("name");
    private final static By password_Input_By = By.id("password");
    private final static By login_Button_By = By.id("button_primary");
    private final static By error_Label_By = By.className("error-text");


    public LoginPage(WebDriver driver, boolean openPageByURL) {
        super(driver, openPageByURL);
    }

    @Override
    protected void openPage() {
        driver.get(properties.getURL());
    }

    @Override
    public boolean isPageOpened() {
        try {
            return getLoginButton().isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

    public WebElement getUsernameInput() {
        return driver.findElement(username_Input_By);
    }

    public WebElement getPasswordInput() {
        return driver.findElement(password_Input_By);
    }

    public WebElement getLoginButton() {
        return driver.findElement(login_Button_By);
    }

    public WebElement getErrorLabel() {
        return driver.findElement(error_Label_By);
    }
    public String getErrorLabelText (){
        return getErrorLabel().getText();
    }

    public void setUsername(String text) {
        getUsernameInput().sendKeys(text);
    }

    public void setPassword(String text) {
        getPasswordInput().sendKeys(text);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }


}
