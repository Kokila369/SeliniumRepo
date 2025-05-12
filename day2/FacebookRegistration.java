package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegistration {

	public static void main(String[] args) throws InterruptedException
	{

    ChromeOptions options=new ChromeOptions();
	options.addArguments("guest");
	ChromeDriver driver=new ChromeDriver(options);
	
	driver.get("https://en-gb.facebook.com/");
	driver.manage().window().maximize();
	
	// Added implicit wait to ensure the web page elements are fully loaded 
    driver.manage().timeouts().implicitlyWait(java.time.Duration.ofSeconds(10));
	
  //click on create new account
    driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
    
    //enter first name
    driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kokila");
    
    //enter last name
    driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("S");
    
  //enter email
  		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kokilas@gmail.com");
  		
  //enter Password 
  		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("Welcome@12");
    
    	//enter dob-date

       WebElement  day=driver.findElement(By.id("day"));
       Select select=new Select(day);
       select.selectByValue("8");
       
       //enter month
       
       WebElement month=driver.findElement(By.id("month"));
       Select month1=new Select(month);
       month1.selectByVisibleText("Apr");
       
       
      //enter year 
       
       WebElement year=driver.findElement(By.id("year"));
       Select year1=new Select(year);
       year1.selectByValue("1990");
       
   	//to select radio button in gender
		driver.findElement(By.xpath("(//input[@type='radio'])[1]")).click();
			
		// to get title of the page
		String title=driver.getTitle();		
       System.out.println(title);
       
       //close the window
	     driver.close();
			    


	}

}
