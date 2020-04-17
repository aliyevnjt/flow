package ui.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;

public class Forms {
	public void selectSchool(String school) {
		$(byId("kp-request--select--school")).selectOption(school);
	}
	
	public void selectDepartment(String dept) {
		$(byId("kp-request--select--department")).selectOption(dept);
	}
	
	public void inputTitle(String title) {
		$(byId("kp-request--input--title")).setValue(title);
	}
	
	public void inputDesc(String desc) {
		$(byId("kp-request--input--description")).setValue(desc);
	}
	
	public void addNew() {
		$(byCssSelector("[data-action = 'kp-request--add-item']")).click();
	}
	
	public void addSaveDelete(String addSavedelete) {
		SelenideElement element = $(byCssSelector("kp-link[data-action *= 'kp-request--" + addSavedelete + "']"));
		try {
			element.wait(500);
			element.click();
		}catch (Exception e){}

	}
	
	public void selectAccount(String account) {
		$(byCssSelector("[data-kp-item-input-id = 'account']")).selectOption(account);
	}
	
	public void inputAccountTitleAndDescription(String titleOrDescription , String input) {
		$(byCssSelector("[data-kp-item-input-id = '" + titleOrDescription + "']")).setValue(input);
	}
	
	public void selectVendor(String vendor) {
		$(byCssSelector("[data-kp-item-input-id = 'vendor']")).selectOption(vendor);
	}
	
	public void inputUrl(String url) {
		$(byCssSelector("[data-kp-item-input-id = 'url']")).setValue(url);
	}
	
	public void inputCount(String count) {
		SelenideElement element = $(byCssSelector("[data-kp-item-input-id = 'count']"));
		element.clear();
		element.setValue(count);
	}
	
	public void inputPrice(String price) {
		$(byCssSelector("[data-kp-item-input-id = 'price']")).setValue(price);
	}

	public void sendOrSaveRequest(String sendOrSave) {
		$(byCssSelector("[data-action = 'kp-request--" + sendOrSave + "-request']")).click();

	}
}
