package ui.stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
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
	public void all(String addSaveDelete) throws InterruptedException {
		forms.addSaveDelete(addSaveDelete);
	}



}
