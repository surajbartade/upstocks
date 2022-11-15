import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xPath_for_year_dropdown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
		
	// click on create new account button
		
	Thread.sleep(3000);
	driver.findElement(By.xpath("")).click();
			
	// select the drop down which we need to handle
			
	Thread.sleep(3000);
	WebElement year= driver.findElement(By.xpath(""));
			
	// create the object of class 
		
	Select s=new Select(year);
	Thread.sleep(3000);
		
	// select by value
	s.selectByValue("1997");		
}
}
