package selenium_webdriver_practical_guide.chapter.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffSet {
	public static void main(String... args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//haqasad//Documents//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/haqasad/workspace/SeleniumExamples/src/selenium_webdriver_practical_guide/chapter/two/HTML/Selectable.html");
		WebElement three = driver.findElement(By.name("three"));
		System.out.println("X coordinate: " + three.getLocation().getX()
				+ "  Y coordinate: " + three.getLocation().getY());
		Actions builder = new Actions(driver);
		builder.moveByOffset(three.getLocation().getX() + 1, three
				.getLocation().getY() + 1);
		builder.perform();
	}
}
