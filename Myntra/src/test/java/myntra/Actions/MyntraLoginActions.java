package myntra.Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import myntra.Elements.myntraLoginElements;
import myntra.Utilites.SetupDriver;

public class MyntraLoginActions {

	public myntraLoginElements LoginElement;
	
	public MyntraLoginActions() {
		LoginElement = new myntraLoginElements();
		PageFactory.initElements(SetupDriver.driver, LoginElement);
	}
	
	public void launchLoginPage() {
		SetupDriver.driver.get("https://www.myntra.com/login?referer=https://www.myntra.com/");
		SetupDriver.driver.manage().window().maximize();
		SetupDriver.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

	public void inputEmail(String Email) {
		LoginElement.Email.sendKeys(Email);
	}
	
	public void inputPassword(String password) {
		LoginElement.password.sendKeys(password);
		
	}

	public void submit() {
		LoginElement.submit.click();
	}
}
