import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pagesourche_title {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazone.com/");
	String alldetails = driver.getPageSource();
	System.out.println(alldetails);
	Thread.sleep(3000);
	String title = driver.getTitle();
	System.out.println(title);
}
}
