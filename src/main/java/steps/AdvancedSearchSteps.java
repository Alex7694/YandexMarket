package steps;

import pages.AdvancedSearchPage;
import ru.yandex.qatools.allure.annotations.Step;


public class AdvancedSearchSteps {


    @Step("Поле {0} заполняется значением: {1}")
    public void stepFillField(String field, String value) {
        new AdvancedSearchPage().fillField(field, value);
    }


    @Step("Нажатие на кнопку Показать")
    public void stepShowButton() {
        new AdvancedSearchPage().ShowButton.click();
    }

    @Step("Активация чекбокса: {0}")
    public void stepCheckboxActivation(String value) {
        switch (value) {
            case "Samsung":
                new AdvancedSearchPage().SamsungCheckbox.click();
                break;
            case "LG":
                new AdvancedSearchPage().LgCheckbox.click();
                break;
            case "Beats":
                new AdvancedSearchPage().BeatsCheckbox.click();
                break;
            default:
                throw new AssertionError("Чекбокс '" + value + "' не объявлен на странице");
        }
    }
}
