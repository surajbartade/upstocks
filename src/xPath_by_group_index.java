import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xPath_by_group_index {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.actitime.com/login.do");
		
	//enter user name
	
	driver.findElement(By.xpath("(//input)[3]")).sendKeys("Surya3871");
	
	// enter password
	
	driver.findElement(By.xpath("((//input)[4]")).sendKeys("Suraj$@318171");
}
}