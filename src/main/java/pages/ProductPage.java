package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ProductPage extends BasePage {

    @FindBy(xpath = "//span[text() = 'Все фильтры']")
    public WebElement AllfiltersBtn;

    public ProductPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}
