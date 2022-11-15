package SELENIUM;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		
		ChromeOptions c=new ChromeOptions();
		c.addArguments("--disable-notifications");
		c.addArguments("start-maximized");
		
		ChromeDriver driver=new ChromeDriver(c);
		driver.get("https://www.hdfc.com/");
}
}