package SELENIUM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
            
		driver.manage().window().maximize();
		
		driver.switchTo().frame("classFrame");
		String a = driver.findElement(By.xpath("//span[text()='Interface Summary']")).getText();
		System.out.println(a);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageListFrame");
		String b = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(b);
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageFrame");
		String c = driver.findElement(By.xpath("//a[text()='AbstractFindByBuilder']")).getText();
		System.out.println(c);
}
}
