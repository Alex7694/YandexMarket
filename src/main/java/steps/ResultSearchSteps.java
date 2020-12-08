package steps;

import org.openqa.selenium.JavascriptExecutor;
import pages.ProductPage;
import pages.ResultSearchPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ResultSearchSteps {

    @Step("Вывдено результатов поисковой выдачи на странице: {0}")
    public void stepcheckCountOfResultElements(int expectedCount) {
        new ResultSearchPage().checkCountOfResultElements(expectedCount);
    }

    @Step("Поле {0} заполняется значением: {1}")
    public void stepFillField(String field, String value) {
        new ResultSearchPage().fillField(field, value);
    }

    @Step("Нажатие на кнопку Найти")
    public void stepSearchButtonClick() {
        new ResultSearchPage().searchButtonClick();
    }

    @Step("Проверка наименование товара соответствует запомненному значению")
    public void stepCheckElements() {
        new ResultSearchPage().checkElements();
    }
}
