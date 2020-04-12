package ui.pageobjects;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selenide.$;

public class Dashboard {
    public void clickOnForm(String formName) {
        switch (formName) {
            case "Purchase Requsion Form":
                $(byCssSelector("[data-href = '/form/frm-b7cc14c8-4081-4ec0-b96c-042f53669474/']")).click();
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
            default:
                break;
        }

    }
}
