package ui.pageobjects;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class Dashboard {
    public void clickOnForm(String formName) {
        switch (formName) {
            case "Purchase Requsion Form":
                $(byCssSelector("[data-href = '/form/frm-b7cc14c8-4081-4ec0-b96c-042f53669474/']")).click();
                break;
            case "Food Request Form":
                $(byCssSelector("[data-href='/form/frm-6bab480d-2541-44ee-b09d-e21ffad93fe5/']")).click();
                break;
            default:
                break;
        }

    }
    public void clickOnDataPanel() {
        $(byCssSelector(".link.panel-open.icon-only")).click();
    }

    public void clickOnCreate(String formName) {
        switch (formName) {
            case "PRF":
                $(byCssSelector("[data-href = '/request/frm-b7cc14c8-4081-4ec0-b96c-042f53669474/new/']")).click();
                break;
            case "FRF":
                $(byCssSelector("[data-href = '/request/frm-6bab480d-2541-44ee-b09d-e21ffad93fe5/new/']")).click();
                break;
            default:
                break;
        }

    }
}
