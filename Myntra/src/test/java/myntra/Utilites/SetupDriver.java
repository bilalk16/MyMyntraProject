package myntra.Utilites;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SetupDriver {
		
		public static WebDriver driver;

		public static void setupDriver() {
				WebDriverManager.chromedriver().version("79.0.3945.36").setup();
				/*ChromeOptions options = new ChromeOptions();
				options.addArguments("--disable-notifications");
				driver = new ChromeDriver(option);*/ 
			      
				driver= new ChromeDriver();
			}
		public static WebDriver getDriver() {
				return driver;

			}

		public static void tearDownDriver() {
				driver.quit();
			}
}
