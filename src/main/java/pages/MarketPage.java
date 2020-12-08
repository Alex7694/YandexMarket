package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

public class MarketPage extends BasePage {

    @FindBy(xpath = "//div[@data-zone-name = 'menu']")
    public WebElement SectionMenu;


    public MarketPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void selectElectonicSection(String menuItem) {
        ((JavascriptExecutor) BaseSteps.getDriver()).executeScript("arguments[0].click();",
                SectionMenu.findElement(By.xpath(".//span[text() = '" + menuItem + "']")));
    }
}
