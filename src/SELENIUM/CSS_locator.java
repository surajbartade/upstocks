package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_locator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.cssSelector("input[id='username']")).sendKeys("admin");
		//enter password
		driver.findElement(By.cssSelector("input[name='pwd']")).sendKeys("manager");
}
}
