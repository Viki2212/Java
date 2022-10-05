package learnSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class W3School {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[.='Try it']").click();
		Alert ale = driver.switchTo().alert();
		ale.sendKeys("Vignesh Sekar");
		ale.accept();
		String txt = driver.findElementById("demo").getText();
		System.out.println(txt);
		
		driver.quit();
		
	}
}
