import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_login_facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
	// enter user name (use formula xpath by attribute)
		
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("surya3871");
		
	// enter password
		
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Suraj$@318171");
		
	// click on login button (use formula xpath by text())
		
	driver.findElement(By.xpath("//button[@id='u_0_5_Rj']")).click();
}
}
