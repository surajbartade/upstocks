package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_ppopup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
}
}