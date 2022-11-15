import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazone.com/");
	
	// Page source
	
	String allElements=driver.getPageSource();
	System.out.println(allElements);
	
	// Title
	
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.close();
}
}