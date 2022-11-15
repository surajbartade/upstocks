import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Customize {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
	Thread.sleep(4000);
	WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
	Actions a=new Actions(driver);
	Thread.sleep(4000);
	a.click(month).perform();
	Thread.sleep(4000);
	a.sendKeys(Keys.ARROW_UP).perform();
	Thread.sleep(4000);
	a.sendKeys(Keys.ARROW_DOWN).perform();
	Thread.sleep(4000);
	a.sendKeys(Keys.ARROW_DOWN).perform();
	a.sendKeys(Keys.ENTER).perform();
}
}