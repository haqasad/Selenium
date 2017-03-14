package selenium_webdriver_practical_guide.chapter.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchButtonById {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//haqasad//Documents//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchBox = driver.findElement(By.id("gs_htif0"));
		searchBox.sendKeys("searchbox found successfully");
		searchBox.submit();
	}
}
