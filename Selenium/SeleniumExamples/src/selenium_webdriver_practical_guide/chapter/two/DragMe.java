package selenium_webdriver_practical_guide.chapter.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragMe {
	public static void main(String... args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//haqasad//Documents//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/haqasad/workspace/SeleniumExamples/src/selenium_webdriver_practical_guide/chapter/two/HTML/DragMe.html");
		WebElement dragMe = driver.findElement(By.id("draggable"));

		Actions builder = new Actions(driver);
		builder.dragAndDropBy(dragMe, 300, 200).perform();
	}
}
