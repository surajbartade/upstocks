package SELENIUM;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Particular_element_screenshot {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		
		WebElement ts = driver.findElement(By.xpath("//img[@class='lnXdpd']"));
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SURAJ\\Desktop\\New folder\\surya.jpg");
		Files.copy(src, dest);
}
}
