package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class AdvancedSearchPage extends BasePage {

    @FindBy(xpath = "//div[(text() = 'Samsung')]")
    public WebElement SamsungCheckbox;

    @FindBy(xpath = "//div[(text() = 'LG')]")
    public WebElement LgCheckbox;

    @FindBy(xpath = "//div[contains(text(), 'Beats')]")
    public WebElement BeatsCheckbox;

    @FindBy(xpath = "//a[contains(text(), 'Показать')]")
    public WebElement ShowButton;

    @FindBy(xpath = "//h4[contains(text(), 'Цена')]/../..//div[@data-prefix='от']/input")
    public WebElement priceInput;


    public AdvancedSearchPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName){
            case "Цена":
                fillField(priceInput, value);
                break;
            default:throw new AssertionError("Поле '"+fieldName+"' не объявлено на странице");
        }
    }
}
