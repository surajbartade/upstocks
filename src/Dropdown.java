import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@class=\"_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy\"]")).click();
		Thread.sleep(3000);
		WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
		Select s1=new Select(day);
		Thread.sleep(3000);
		s1.selectByVisibleText("8");
		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		Select s2=new Select(month);
		Thread.sleep(3000);
		s2.selectByIndex(6);
		
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s3=new Select(year);
		Thread.sleep(3000);
		s3.selectByValue("1997");
}
}