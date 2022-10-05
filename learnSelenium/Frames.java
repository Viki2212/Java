package learnSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/frame");
		
		driver.switchTo().frame("firstFr");
		driver.findElementByName("fname").sendKeys("Vignesh");
		driver.findElementByName("lname").sendKeys("Sek");
		driver.switchTo().frame(1);
		driver.findElementByName("email").sendKeys("Viki@gmail.com");
		driver.switchTo().parentFrame();
		driver.findElementByName("lname").sendKeys("ar");
	}

}
