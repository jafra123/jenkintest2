package WellsFargo;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:/Users/b/Desktop/1-IT-EXPERT/ArpanaSelenium/SeleniumDrivers/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.wellsfargo.com/");
	driver.manage().window().maximize();		
	//driver.findElement(By.id("drivertabNavPersonal")).click();
	driver.findElement(By.id("tabNavSmallBusiness")).click();	
	WebElement deastnation = driver.findElement(By.id("destination"));
	Select obj1 = new Select(deastnation);
	obj1.selectByVisibleText("Bill Pay");	
	driver.findElement(By.id("tabNavCommercial")).click();
	driver.findElement(By.name("q")).sendKeys("cjhecking");
	driver.findElement(By.name("q")).sendKeys(Keys.RETURN);		
	
	List<WebElement> links = driver.findElements(By.tagName("a"));
	int Linksize= links.size();
	System.out.println("Totoal links are "+Linksize);	 
	 for (int i = 1; i<=Linksize; i=i+1)	 
	 {	 
	 System.out.println(links.get(i).getText());	 
	 }
	 
	 }
	
	
	
	}
	
	

