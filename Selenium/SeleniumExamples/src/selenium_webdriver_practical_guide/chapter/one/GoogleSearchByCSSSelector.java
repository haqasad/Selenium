package selenium_webdriver_practical_guide.chapter.one;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearchByCSSSelector {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C://Users//haqasad//Documents//Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement searchButton = driver.findElement(By.cssSelector("#viewport"));
		System.out.println(searchButton.getText());
		
		System.out.println("******************************************");
		
		WebElement searchLink = driver.findElement(By
				.cssSelector("#viewport>#searchform>#gb>#gbw>*>*>*>*>a"));
		System.out.println(searchLink.getText());
		
		System.out.println("******************************************");
		
		List<WebElement> searchListOfLinks = driver.findElements(By.cssSelector("*>a"));
		System.out.println(searchListOfLinks.size());
		
		System.out.println("******************************************");
		
		for (int i=0; i<searchListOfLinks.size(); i++) {
			System.out.println(searchListOfLinks.get(i).getText());
		}
	}
}
