package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class ElectronicPage extends BasePage {

    @FindBy(xpath = "//a[text() = 'Телевизоры']")
    public WebElement TvSection;

    @FindBy(xpath = "//a[contains(text(), 'Наушники и Bluetooth-гарнитуры')]")
    public WebElement HeadphonesSection;

    public ElectronicPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }
}
