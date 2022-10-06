package selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://letcode.in/dropdowns");

		WebElement fruits = driver.findElementById("fruits");
		Select drop = new Select(fruits);
		drop.selectByVisibleText("Mango");
		WebElement txt = driver.findElementByClassName("subtitle");
		System.out.println(txt.getText());


		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver1 = new ChromeDriver();

		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver1.get("https://letcode.in/dropdowns");

		WebElement superHeros = driver1.findElementById("superheros");
		Select drop1 = new Select(superHeros);
		drop1.selectByVisibleText("Batman");
		drop1.selectByIndex(1);
		drop1.selectByValue("im");
		List <WebElement> txt1 = drop1.getAllSelectedOptions();
		for (WebElement WebElement : txt1) {
			System.out.println(WebElement.getText());
		}
		

		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver2 = new ChromeDriver();

		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver2.get("https://letcode.in/dropdowns");

		WebElement country = driver2.findElementById("country");
		Select drop2 = new Select(country);
		drop2.selectByValue("India");
		System.out.println(drop2.getFirstSelectedOption().getText());
		
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver3 = new ChromeDriver();

		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver3.get("https://letcode.in/dropdowns");

		WebElement lang = driver3.findElementById("lang");
		Select drop3 = new Select(lang);
		drop3.selectByIndex(4);
		List <WebElement> txt3 = drop3.getOptions(); 
		for (WebElement WebElement : txt3) {
			System.out.println(WebElement.getText());
		}
	}
}

