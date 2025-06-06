package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class LearnDropdown {

	public static void main(String[] args) 
	{
		
	ChromeOptions options =new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);
	
	driver.get("http://leaftaps.com/opentaps/control/main");
	driver.manage().window().maximize();
	
	String title = driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
	
	driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
	
	driver.findElement(By.className("decorativeSubmit")).click();
	
	driver.findElement(By.partialLinkText("CRM")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Create Lead")).click();
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("kokila");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");

	//by index
	WebElement sourceDD=  driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select select=new Select(sourceDD);
	select. selectByIndex(5);

	//by value
	WebElement industryDD=driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select select1=new Select(industryDD);
	select1.selectByValue("IND_FINANCE");
	
	//
	WebElement ownerDD = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select select2=new Select(ownerDD);
	select2.selectByVisibleText("Corporation");

	
	
	
	
	
	
	}

}
