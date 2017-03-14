package selenium_webdriver_practical_guide.chapter.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetCSSValue {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//haqasad//Documents//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.name("btnK"));
		System.out.println(searchButton.getCssValue("font-family"));
		System.out.println(searchButton.getCssValue("font-size"));
		System.out.println(searchButton.getCssValue("position"));
		System.out.println(searchButton.getCssValue("font-weight"));
		System.out.println(searchButton.getCssValue("background-color"));
		System.out.println(searchButton.getCssValue("background-position"));
		System.out.println(searchButton.getCssValue("visibility"));
		System.out.println(searchButton.getCssValue("color"));
	}
}
