package selenium_webdriver_practical_guide.chapter.three;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitTime {
	public static void main(String... args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\haqasad\\Documents\\Drivers\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		WebElement element = (new WebDriverWait(driver, 10))
				.until(new ExpectedCondition<WebElement>() {
					@Override
					public WebElement apply(WebDriver d) {
						return d.findElement(By.name("q"));
					}

				}

				);
	}

}
