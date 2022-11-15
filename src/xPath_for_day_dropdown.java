import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class xPath_for_day_dropdown {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	
	// click on create new account button
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	
	// select the drop down which we need to handle
	
	Thread.sleep(3000);
	WebElement day= driver.findElement(By.xpath("//select[@id='day']"));
	
	// create the object of class 
	
	Select s=new Select(day);
	Thread.sleep(4000);
	
	// use select class methods (select by text);
	  s.selectByVisibleText("26");
	
	// select by value
	
	//s.selectByValue("1");
	 
	
	
	
}
}