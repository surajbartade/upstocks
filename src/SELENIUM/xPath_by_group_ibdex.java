package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_by_group_ibdex {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		//enter username
		driver.findElement(By.xpath("(//input)[3]")).sendKeys("admin");
		//enter password
		driver.findElement(By.xpath("(//input)[4]")).sendKeys("manager");
}
}
