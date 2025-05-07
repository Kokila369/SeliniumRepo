package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
    	driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//enter the password
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		//click leads tab
		driver.findElement(By.partialLinkText("Leads")).click();
		//click create lead button
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Bosch");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Kokila");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("S");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		//close the Browser window
		driver.close();
		
		
		
	}

}
