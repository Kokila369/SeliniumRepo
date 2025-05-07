package week2.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Launch the browser
		
		EdgeDriver driver=new EdgeDriver();
		// load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//enter the username
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		//click login
		driver.findElement(By.className("decorativeSubmit")).click();
		//click crm link
		driver.findElement(By.partialLinkText("CRM")).click();
		//click account tab
		driver.findElement(By.partialLinkText("Accounts")).click();
		//click create account
		driver.findElement(By.linkText("Create Account")).click();
		//enter account name
		driver.findElement(By.id("accountName")).sendKeys("KokilaS");
		//enter a description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		//enter a no of employees
		driver.findElement(By.id("numberEmployees")).sendKeys("96");
		//enter a site name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		
		//click create acc button
		driver.findElement(By.className("smallSubmit")).click();
		
		
		//Title of page
		String title=driver.getTitle();
		System.out.println(title);
		//close the Browser window
		driver.close();
		
		
		

	}

}
