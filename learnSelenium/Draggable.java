package learnSelenium;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draggable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		WebElement ele = driver.findElementById("draggable");
		Actions builder = new Actions(driver);
		int x = ele.getLocation().getX();
		int y = ele.getLocation().getY();
		System.out.println(x +" "+ y);
		builder.dragAndDropBy(ele, x+100, y+100).perform();

	}

}
