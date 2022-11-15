import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize_browser {
public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazone.com/");
	
	// Maximize
	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	// Minimize
	
	driver.manage().window().minimize();
	Thread.sleep(3000);
	
	// Set size
	
	Dimension d=new Dimension(100,200);
	driver.manage().window().setSize(d );
	Thread.sleep(3000);
	
	// Set position
	
	Point p=new Point(300,400);
	driver.manage().window().setPosition(p);
	
	driver.close();
	
}
}
