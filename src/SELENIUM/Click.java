package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Click {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	WebElement element = driver.findElement(By.xpath("//a[text()='Gmail']"));
	Actions a=new Actions(driver);
	a.doubleClick(element).perform();
}
}