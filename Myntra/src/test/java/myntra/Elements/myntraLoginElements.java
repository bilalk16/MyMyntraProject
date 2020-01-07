package myntra.Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class myntraLoginElements {

		@FindBy(name="userID")
		public WebElement userid;
		
		@FindBy(name="password")
		public WebElement password;
		
		@FindBy(id="submitBtn")
		public WebElement submit;
		
		@FindBy(id="errorMessages")
		public WebElement errorMsg;
	}

	

