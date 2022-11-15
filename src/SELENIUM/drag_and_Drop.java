package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class drag_and_Drop {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement ele2 = driver.findElement(By.xpath("//div[@id='droppable']"));
		WebElement ele1 = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		Actions a=new Actions(driver);
		a.dragAndDrop(ele2, ele1).perform();
}
}