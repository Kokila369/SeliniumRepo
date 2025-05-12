package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;


public class CreateAccountDropdown {

	public static void main(String[] args) {

		ChromeOptions options=new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
	
		
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		
		driver.findElement(By.partialLinkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("KokilaSelvaraj");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
        //choose from industry dropdown
		WebElement industryDD=driver.findElement(By.name("industryEnumId"));
		Select select1=new Select(industryDD);
		select1.selectByVisibleText("Computer Software");
		
		//choose from ownership dropdown
		WebElement ownershipDD=driver.findElement(By.name("ownershipEnumId"));
		Select select2=new Select(ownershipDD);
		select2.selectByVisibleText("S-Corporation");
		
		//choose from source dropdown
		WebElement sourceDD=driver.findElement(By.id("dataSourceId"));
		Select select3=new Select(sourceDD);
		select3.selectByValue("LEAD_EMPLOYEE");
		
		//choose from campaign dropdown
		WebElement campaignDD=driver.findElement(By.id("marketingCampaignId"));
		Select select4=new Select(campaignDD);
		select4.selectByIndex(6);
		
		//choose from state dropdown
		WebElement stateDD=driver.findElement(By.id("generalStateProvinceGeoId"));
		Select select5=new Select(stateDD);
		select5.selectByValue("TX");
		
		
		//click create acc button
		driver.findElement(By.className("smallSubmit")).click();
		

		//get title of the page

	 	String title = driver.getTitle();
		System.out.println(title);
	    
	    //close the window
	    driver.close();
		

	}

}
