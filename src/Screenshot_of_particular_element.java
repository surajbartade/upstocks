import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot_of_particular_element {
	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		WebElement ts = driver.findElement(By.xpath("//a[@id='nav-logo-sprites']"));
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\SURAJ\\Desktop\\ds\\AmazoneScreenshot.jpg");
		Files.copy(src,dest);
}
}