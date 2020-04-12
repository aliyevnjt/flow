package ui.stepdefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Then;
import ui.pageobjects.Dashboard;

public class DashBoardStepDefs {
	Dashboard db = new Dashboard();
	@Then("User clicks on data panel")
	public void user_clicks_on_data_panel() {
	    db.clickOnDataPanel();
	    Configuration.holdBrowserOpen = true;
	}
	
	@Then("User clicks on {string}")
	public void user_clicks_on(String formName) {
	    db.clickOnForm(formName);
	}

	@Then("User click on {string} create")
	public void user_click_on_create(String formName) {
	    db.clickOnCreate(formName);
	}
	
	
	
}
