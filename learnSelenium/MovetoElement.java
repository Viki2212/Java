package learnSelenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class MovetoElement {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath("//button[.='✕']").click();
		driver.findElementByXPath("//div[.='Electronics']").click();
		WebElement target = driver.findElementByXPath("//span[.='Electronics']");
		Actions builder = new Actions(driver);
		builder.moveToElement(target).perform();
		driver.findElementByLinkText("Mi").click();
		Thread.sleep(3000);
		
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./Snaps/img.png");
		FileHandler.copy(src, dest);

	}

}
