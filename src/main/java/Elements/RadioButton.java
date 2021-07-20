package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class RadioButton {
    private UIElement uiElement;
    private List<UIElement> options = new ArrayList<>();
    private WebDriver driver;


    /***
     * RadioButton uiElement для улучшения работы
     * @param driver
     * @param by необходимо передать значение атрибута name
     *
     */
    public RadioButton(WebDriver driver, By by) {
        this.driver = driver;

        for (WebElement element: driver.findElements(by)) {
            options.add(new UIElement(driver, element));
        }
    }

    public void selectByIndex(int index) {
        for (UIElement element : options) {
            if (Integer.parseInt(element.getAttribute("value")) == index) {
                element.click();
                break;
            }
        }
    }

    public void selectByText(String optionName) {
        for (UIElement element : options) {
            String textValue = element.getParent().findElement(By.tagName("strong")).getText();
            if (textValue.equalsIgnoreCase(optionName)) {
                element.click();
                break;
            }
        }
    }
}
