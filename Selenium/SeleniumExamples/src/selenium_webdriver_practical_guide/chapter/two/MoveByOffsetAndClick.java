package selenium_webdriver_practical_guide.chapter.two;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveByOffsetAndClick {
	public static void main(String... args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//haqasad//Documents//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/haqasad/workspace/SeleniumExamples/src/selenium_webdriver_practical_guide/chapter/two/HTML/Selectable.html");
		WebElement seven = driver.findElement(By.name("seven"));
		System.out.println("X coordinate: " + seven.getLocation().getX()
				+ " Y coordinate: " + seven.getLocation().getY());
		Actions builder = new Actions(driver);
		builder.moveByOffset(seven.getLocation().getX() + 1,
				seven.getLocation().getY() + 1).click();
		builder.perform();
	}
}
