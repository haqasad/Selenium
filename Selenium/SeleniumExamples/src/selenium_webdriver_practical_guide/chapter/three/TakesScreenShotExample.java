package selenium_webdriver_practical_guide.chapter.three;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TakesScreenShotExample {
	
	public static void main(String... args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\haqasad\\Documents\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.packtpub.com/");
		File scrFile = ((TakesScreenshot)driver).
				getScreenshotAs(OutputType.FILE);
		System.out.println(scrFile.getAbsolutePath());
		try {
			FileUtils.copyFile(scrFile, new File("C:\\Users\\haqasad\\Pictures\\Saved Pictures\\test00_screenshot.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
