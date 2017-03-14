package selenium_webdriver_practical_guide.chapter.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SwitchBetweenFrames {
	@SuppressWarnings("unused")
	public static void main(String... args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\haqasad\\Documents\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/haqasad/workspace/SeleniumExamples/src/selenium_webdriver_practical_guide/chapter/three/HTML/Frames.html");

		Actions action = new Actions(driver);

		driver.switchTo().frame(0);
		WebElement txt = driver.findElement(By.name("1"));
		txt.sendKeys("I'm Frame One");

		driver.switchTo().defaultContent();

		driver.switchTo().frame(1);
		txt = driver.findElement(By.name("2"));
		txt.sendKeys("I'm Frame Two");
	}
}
