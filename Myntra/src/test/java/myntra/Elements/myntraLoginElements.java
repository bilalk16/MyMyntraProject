package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myntraLoginElements {

		@FindBy(name="email")
		public WebElement Email;
		
		@FindBy(name="password")
		public WebElement password;
		
		@FindBy(className="login-login-button")
		public WebElement submit;
		
		
	}

	

