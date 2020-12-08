package steps;

import pages.AdvancedSearchPage;
import pages.ElectronicPage;
import ru.yandex.qatools.allure.annotations.Step;

public class ElectronicSteps {


    @Step("Переход в раздел - {0}")
    public void stepSelectSection(String value) {
        switch (value) {
            case "Наушники и Bluetooth-гарнитуры":
                new ElectronicPage().HeadphonesSection.click();
                break;
            case "Телевизоры":
                new ElectronicPage().TvSection.click();
                break;
            default:
                throw new AssertionError("Раздел '" + value + "' не объявлен на странице");
        }
    }
}


