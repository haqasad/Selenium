package selenium_webdriver_practical_guide.chapter.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHoldAndReleaseOnWebElement {
	public static void main(String... args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//haqasad//Documents//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/haqasad/workspace/SeleniumExamples/src/selenium_webdriver_practical_guide/chapter/two/HTML/Sortable.html");
		WebElement three = driver.findElement(By.name("three"));
		WebElement two = driver.findElement(By.name("two"));

		Actions builder = new Actions(driver);
		// Move tile3 to the position of tile2
		builder.clickAndHold(three).release(two).perform();
	}
}
