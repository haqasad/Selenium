package selenium_webdriver_practical_guide.chapter.one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByXPath {
	
	public static void main(String[] args) {		
		System.setProperty("webdriver.gecko.driver", "C://Users//haqasad//Documents//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By
				.xpath("//*[@id='viewport']"));
		System.out.println(searchButton.getText());
	}
}
