package selenium_webdriver_practical_guide.chapter.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowHandling {
	public static void main(String... args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\haqasad\\Documents\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/Users/haqasad/workspace/SeleniumExamples/src/selenium_webdriver_practical_guide/chapter/three/HTML/Window.html");

		String window1 = driver.getWindowHandle();
		System.out.println("First Window Handle is: " + window1);

		WebElement link = driver.findElement(By.linkText("Google Search"));
		link.click();

		String window2 = driver.getWindowHandle();
		System.out.println("Second Window Handle is: " + window2);
		System.out.println("Number of Window Handles so for: "
				+ driver.getWindowHandles().size());

		driver.switchTo().window(window1);

	}
}
