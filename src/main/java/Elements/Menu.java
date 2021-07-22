package Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    private UIElement uiElement;
    private WebDriver driver;
    private List<UIElement> fields = new ArrayList<>();

    public Menu(WebDriver driver, By by) {
        this.driver = driver;
        this.uiElement = new UIElement(driver, by);

        for (WebElement element : this.uiElement.findElements(By.xpath("//div[@id = 'helpDropdown']/ul/li/a"))) {
            fields.add(new UIElement(driver, element));
        }
    }

    public void selectByText(String rowName) {
        for (UIElement element : fields) {
            String valueText = element.getText();
            if (valueText.equalsIgnoreCase(rowName)) {
                element.click();
                break;
            }
        }
    }
}
