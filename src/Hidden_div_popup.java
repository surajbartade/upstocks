import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hidden_div_popup {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");	
		driver.findElement(By.xpath("button[text()='✕']")).click();
		
	}	
}