package ui.pageobjects;

import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Login {
	
	public void login(String usrname, String pwd) {
		$(byId("kp-login--input--username")).setValue(usrname);
		$(byId("kp-login--input--password")).setValue(pwd);
		$(byId("kp-login--submit")).click();
	}
	
	public void navigateToUrl() {
		open(System.getProperty("url"));
	}
}
