import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");	
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234",Keys.ENTER);
		Alert alt=driver.switchTo().alert();
		alt.accept();
		//alt.dismiss();
	}
}
