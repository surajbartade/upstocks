package SELENIUM;

import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource_Title {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\sachin bhavji\\Downloads\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	
	
	//String AllElenents = driver.getPageSource();
//	System.out.println(AllElenents);
	
	
	String Title = driver.getTitle();
	System.out.println(Title);
	
}
}
