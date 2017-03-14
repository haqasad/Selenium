package selenium_webdriver_practical_guide.chapter.three;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BrowserCapabilities {
	
	@SuppressWarnings("unchecked")
	public static void main(String... args) {
		Map capabilitiesMap = new HashMap();
		capabilitiesMap.put("takesScreenShot", true);
		DesiredCapabilities capabilities = new DesiredCapabilities(capabilitiesMap);
		
		System.setProperty("webdriver.gecko.driver", "C://Users//haqasad//Documents//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver(capabilities);
		driver.get("http://www.google.com");
		}

}
