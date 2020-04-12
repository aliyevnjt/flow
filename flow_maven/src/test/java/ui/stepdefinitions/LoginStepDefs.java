package ui.stepdefinitions;


import com.codeborne.selenide.Configuration;
import io.cucumber.java.en.Given;
import ui.pageobjects.Login;

public class LoginStepDefs {
	private Login login = new Login();
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
	    login.navigateToUrl();
	}

	@Given("User logs in application with username {string} and password {string}")
	public void user_logs_in_application_with_username_and_password(String usrname, String pwd) {
	   login.login(usrname, pwd);
	}
}
