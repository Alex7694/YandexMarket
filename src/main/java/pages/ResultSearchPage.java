package pages;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import steps.BaseSteps;

import java.util.List;

public class ResultSearchPage extends BasePage {

    @FindBy(xpath = "//h3/a[contains(@href, 'product')]")
    List<WebElement> firstSearchResults;

    @FindBy(xpath = "//a[contains(@class, 'o cia-cs')]")
    List<WebElement> secondSearchResults;

    @FindBy(xpath = "//input[@placeholder= 'Искать товары']")
    public WebElement searchInput;

    @FindBy(xpath = "//div[contains(text(), 'Найти')]")
    public WebElement searchButton;

    public void searchButtonClick() {
        try {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchButton);
        } catch (NullPointerException exception) {
        }
    }

    public void checkCountOfResultElements(int expectedCount) {
        int list = firstSearchResults.size();
        Assert.assertEquals(expectedCount, list);
    }

    public WebElement getFirstElementInFirstSearch() {
        return firstSearchResults.get(0);
    }

    public WebElement getFirstElementInSecondSearch() {
        return secondSearchResults.get(0);
    }

    public void checkElements() {
        Assert.assertEquals(getFirstElementInFirstSearch(), getFirstElementInSecondSearch());
    }

    public ResultSearchPage() {
        PageFactory.initElements(BaseSteps.getDriver(), this);
    }

    public void fillField(String fieldName, String value) {
        switch (fieldName) {
            case "Поиск":
                fillField(searchInput, value);
                break;
            default:
                throw new AssertionError("Поле '" + fieldName + "' не объявлено на странице");
        }
    }
}
