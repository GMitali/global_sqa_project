package fileupload.globalsqa;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test	
public void global() throws Exception
{
	
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.globalsqa.com/samplepagetest/");
	driver.manage().window().maximize(); // maximize window
	//driver.manage().window().fullscreen(); // for fullscreen
	driver.findElement(By.name("file-553")).sendKeys("C:\\Users\\windows\\Pictures\\large.jpg"); // for file upload
	driver.findElement(By.id("g2599-name")).sendKeys("mitalee");
	driver.findElement(By.id("g2599-email")).sendKeys("mitaleeghosh555@gmail.com");
	driver.findElement(By.id("g2599-website")).sendKeys("Global Sqa");
	
	//Step 1 =  To create on obj of WebElement
	WebElement objWeb = driver.findElement(By.name("g2599-experienceinyears"));
	
	//Step 2 : to create on obj of select class
			
	Select objSelect = new Select(objWeb);
	
	//Step 3  : To select
	objSelect.selectByIndex(2);  //London
	Thread.sleep(5000);
	

	
	// for checkbox 
	WebElement Expercheckbtn1 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div[2]/form/div[5]/label[2]"));
	Expercheckbtn1.click();
	
	
	WebElement Expercheckbtn2 = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div[2]/form/div[5]/label[3]"));
	Expercheckbtn2.click();
	Thread.sleep(4000);
	
	// for radio button
	WebElement eduRadiobtn = driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[2]/div/div/div[2]/div[2]/form/div[6]/label[2]"));
	eduRadiobtn.click();
	
	
	// for alert box		
	System.out.println("Education is selencted : =>" +Expercheckbtn1.isSelected());
	
	
	// for comment box
	WebElement commentbox = driver.findElement(By.id("contact-form-comment-g2599-comment"));
	commentbox.sendKeys("Hello mitalee");
	
	WebElement subbtn = driver.findElement(By.className("pushbutton-wide"));
	subbtn.click();
	
	
	Thread.sleep(5000);
	driver.close();


}
