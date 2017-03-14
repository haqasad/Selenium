package selenium_webdriver_practical_guide.chapter.two;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {
	public static void main(String... args) {
		System.setProperty("webdriver.chrome.driver", "C://Users//haqasad//Documents//Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/haqasad/workspace/SeleniumExamples/src/selenium_webdriver_practical_guide/chapter/two/HTML/Sortable.html");

		Actions builder = new Actions(driver);
		// Move tile3 to the position of tile2
		builder.moveByOffset(200, 20).clickAndHold().moveByOffset(120, 0)
				.perform();
	}
}
