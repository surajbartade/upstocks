import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_by_attribute {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
	
	// enter user name (use formula xpath by attribute)
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("surya3871");
	
	// enter password
	
	driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("Suraj$@318171");
	
	// click on login button (use formula xpath by text())
	
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
}
}
