import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(3000);
	driver.get("https://www.amazon.in/?ie=UTF8&tag=googinprimeexpt5-21&ascsubtag=_k_Cj0KCQjw94WZBhDtARIsAKxWG-8CQTDxLGjhdJ9Mw2RERbc20g9czs8kBR9_rZXNG1VmkwNAQf6Pu6AaAhZqEALw_wcB_k_&gclid=Cj0KCQjw94WZBhDtARIsAKxWG-8CQTDxLGjhdJ9Mw2RERbc20g9czs8kBR9_rZXNG1VmkwNAQf6Pu6AaAhZqEALw_wcB");
	Thread.sleep(3000);
	driver.navigate().forward();
	driver.navigate().back();
	Thread.sleep(3000);
	driver.navigate().refresh();
	
}
}
