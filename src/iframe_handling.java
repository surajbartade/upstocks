import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe_handling {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?org/openqa/selenium/package-summary.html");
		driver.manage().window().maximize();
		//2nd frame
		driver.switchTo().frame("packageFrame");
		String a = driver.findElement(By.xpath("//a[text()='AbstractAnnotations']")).getText();
		System.out.println(a);
		//main webpage
		driver.switchTo().defaultContent();
		//1st frame
		driver.switchTo().frame("packageListFrame");
		String b = driver.findElement(By.xpath("//a[text()='org.openqa.selenium']")).getText();
		System.out.println(b);
		//main webpage
		driver.switchTo().defaultContent();
		//3rd webpage
		driver.switchTo().frame("classFrame");
		String c = driver.findElement(By.xpath("//div[text()='Describes a series of key/value pairs that encapsulate aspects of a browser.']")).getText();
		System.out.println(c);
}
}