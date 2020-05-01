package ui.stepdefinitions;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.pageobjects.Forms;

public class FormsStepDefs {
	
	Forms forms = new Forms();
	
	@Then("Select School {string}")
	public void select_School(String school) {
	    forms.selectSchool(school);
	}

	@Then("Select Department {string}")
	public void select_Department(String dept) {
	   forms.selectDepartment(dept);
	}

	@Then("Input title {string}")
	public void input_title(String title) {

		forms.inputTitle(title);
	}

	@Then("Input description {string}")
	public void input_description(String desc) {
	forms.inputDesc(desc);
	}
	
	@Then("Click Add New")
	public void click_Add_New() {
	   forms.addNew();
	}
	
	@Given("Select account {string}")
	public void select_account(String account) {
	   forms.selectAccount(account);
	}

	@Given("For {string} input {string}")
	public void for_input(String titleOrDesc, String inputValue) {
	   forms.inputAccountTitleAndDescription(titleOrDesc, inputValue);
	}
	
	@Given("Select vendor {string}")
	public void select_vendor(String vendor) {
	    forms.selectVendor(vendor);
	}

	@Given("Input url {string}")
	public void input_url(String url) {
	    forms.inputUrl(url);
	}

	@Given("Input count {string}")
	public void input_count(String count) {
	   forms.inputCount(count);
	}

	@Given("Input price {string}")
	public void input_price(String price) {
	   forms.inputPrice(price);
	}

	@Then("{string} All")
	public void all(String addSaveDelete)  {
		SelenideElement el = $(byCssSelector("[data-action *= 'kp-request--" + addSaveDelete + "-items']"));
		sleep(1000);
		el.click();
	}

	@Given("User clicks on blue button")
	public void user_clicks_on_blue_button() {
		sleep(1000);
		SelenideElement el = $(byCssSelector("a[class='kp-button-blue']"));
		el.scrollIntoView("{block: \"end\"}");
		el.click();
	}

	@Given("User clicks on send request")
	public void user_clicks_on_send_request(){
		$(byText("upload_circle")).click();
		$(byText("Send")).click();
	}

	@Given("User saves request")
	public void user_saves_request() {
		$(byText("cloud_upload")).click();
	}

	@Given("User clicks on {string} request")
	public void user_clicks_on_request(String string) {
		$(byText("OK")).click();
		$(byCssSelector("[id = 'kp-request--page'] [data-panel='left']")).click();
	}




}
