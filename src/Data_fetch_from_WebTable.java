import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Data_fetch_from_WebTable {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\sachin bhavji\\\\Downloads\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/sachin%20bhavji/Downloads/Telegram%20Desktop/WebTable%20by%20ANKUSH%20(1).html");
    
	String sn = driver.findElement(By.xpath("//table[@id='2244']//th[2]")).getText();
	System.out.println(sn);
	
	String city = driver.findElement(By.xpath("//table[@id='2244']//th[3]")).getText();
	System.out.println(city);
	
	String sr = driver.findElement(By.xpath("//table[@id='2244']//th[1]")).getText();
	System.out.println(sr);
	
	String r1 = driver.findElement(By.xpath("//table[@id='2244']//tr[1]")).getText();
	System.out.println(r1);
	
	String r5 = driver.findElement(By.xpath("//table[@id='2244']//tr[5 ]")).getText();
	System.out.println(r5);
}
}