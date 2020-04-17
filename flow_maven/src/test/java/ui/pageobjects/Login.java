package ui.pageobjects;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;

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
		Configuration.browser=System.getProperty("browser");
		Configuration.headless=Boolean.valueOf(System.getProperty("headless"));
		Configuration.holdBrowserOpen=true;
		open(System.getProperty("url"));
	}
}
