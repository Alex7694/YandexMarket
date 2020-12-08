package steps;

import cucumber.api.java.en.When;
import pages.ResultSearchPage;

public class ScenarioSteps {

    AdvancedSearchSteps advancedSearchSteps = new AdvancedSearchSteps();
    ElectronicSteps electronicSteps = new ElectronicSteps();
    MarketSteps marketSteps = new MarketSteps();
    ProductSteps productSteps = new ProductSteps();
    ResultSearchSteps resultSearchSteps = new ResultSearchSteps();
    YandexSteps yandexSteps = new YandexSteps();
    ResultSearchPage resultSearchPage = new ResultSearchPage();
    String firstSearchResult = null;
    String secondSearchResult = null;
    String output= null;

    @When("^выбран пункт меню - \"(.+)\"$")
    public void selectMarketSection(String menuItem) {
        yandexSteps.stepSelectMarketSection(menuItem);
    }

    @When("^закртытие вкладки Яндекс и переход во вкладку Маркет")
    public void windowsHandlesManagment() {
        yandexSteps.stepWindowsHandlesManagment();
    }

    @When("^выбор пункта меню  - \"(.+)\"$")
    public void selectElectonicSection(String menuitem) {
        marketSteps.stepSelectElectonicSection(menuitem);
    }

    @When("^переход в раздел - \"(.+)\"$")
    public void selectSection(String section) {
        electronicSteps.stepSelectSection(section);
    }

    @When("^нажимаем на кнопку Все фильтры")
    public void checkoutButton() {
        productSteps.stepAllfiltersBtn();
    }

    @When("^поле \"(.+)\" заполняется значением - \"(.+)\"$")
    public void FillFields(String field, String value) {
        advancedSearchSteps.stepFillField(field, value);
    }


    @When("^активация чекбокса -  \"(.+)\"$")
    public void checkboxActivation(String manufacturer) {
        advancedSearchSteps.stepCheckboxActivation(manufacturer);
    }

    @When("^нажатие на кнопку Показать")
    public void ShowButton() {
        advancedSearchSteps.stepShowButton();
    }

    @When("^вывдено результатов поисковой выдачи на странице:  \"(.+)\"$")
    public void checkCountOfResultElements(int expectedCount) {
        resultSearchSteps.stepcheckCountOfResultElements(expectedCount);
    }

    @When("^запоминаем первое значение списка в первой поисковой выдаче")
    public void getFirstElementInFirstSearch() {
        firstSearchResult = resultSearchPage.getFirstElementInFirstSearch().getText();
    }

    @When("^запоминаем первое значение списка во второй поисковой выдаче")
    public void getFirstElementInSecondSearch() {
        secondSearchResult = resultSearchPage.getFirstElementInSecondSearch().getText();
    }

    @When("^в поле поиска вводим запомненное значение")
    public void fillFieldWithSavedValue() {
        resultSearchSteps.stepFillField("Поиск", firstSearchResult);
    }

    @When("^нажимаем кнопку Найти")
    public void findButtonClick() {
        resultSearchSteps.stepSearchButtonClick();
    }

    @When("^запоминаем первое элемент в поисковой выдаче")
    public void getFirstElementOfSearch() {
         output = resultSearchPage.searchInput.getAttribute("value");
    }



    @When("^наименование товара соответствует запомненному значению")
    public void checkElements() {
        resultSearchSteps.stepCheckElements();
    }
}
