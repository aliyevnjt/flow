package ui.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;

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
//		try {
//
//		}catch (Exception e){}
//		element.waitUntil(Condition.exactText("Save All"),2000);
//		element.sendKeys(Keys.ENTER);
//		element.sendKeys(Keys.RETURN);
//
//		$(byXpath("//*[@id=\"kp-request--page\"]/div[3]/kp-card-box[4]/kp-card/kp-card-header/kp-card-actions/kp-link[2]")).click();
//		((JavascriptExecutor) WebDriverRunner.getWebDriver()).executeScript("arguments[0].click();", element);
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
		$(byCssSelector("[data-action = 'kp-request--"+ sendOrSave + "-request'] ")).click();

	}
//	public void blueBottomClick()  {
//		$(byCssSelector("[class='kp-button-blue']")).doubleClick().click();;
//		
//	}
//	
//	public void SendOrCancel(String send)  {
//		$(byText(send)).doubleClick();
//		
//	}
	
	
	
}
