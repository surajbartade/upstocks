import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_down_up {
public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
    JavascriptExecutor jse=(JavascriptExecutor)driver;
    jse.executeScript("window.scrollBy(0,2000);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(2000,4000);");
    Thread.sleep(3000);
    jse.executeScript("window.scrollBy(4000,-5000);");
}
}
