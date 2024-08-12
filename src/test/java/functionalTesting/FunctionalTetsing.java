package functionalTesting;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FunctionalTetsing {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" https://demo.dealsdray.com/");
		driver.manage().window().maximize();
		
		//login Process
		driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("prexo.mis@dealsdray.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		Thread.sleep(2000);
		
		//Orders Folder
		driver.findElement(By.xpath("//h3[normalize-space()='54']")).click();
		
		Thread.sleep(2000);
		
		//Bulk Orders
		driver.findElement(By.xpath("//button[normalize-space()='Add Bulk Orders']")).click();
		
		Thread.sleep(2000);
		
		//Upload The File
		driver.findElement(By.xpath("//input[@id='mui-7']")).sendKeys(System.getProperty("user.dir")+"\\Files\\demo-data.xlsx");
		
		
		Thread.sleep(2000);
		//import
		driver.findElement(By.xpath("//button[normalize-space()='Import']")).click();
		
		//Validate
		driver.findElement(By.xpath("//button[normalize-space()='Validate Data']")).click();
		
		Thread.sleep(2000);
		
	    Alert a=driver.switchTo().alert();
	    a.accept();
	   
		 Thread.sleep(2000);
	    
	    //ScreenShot
	    TakesScreenshot ts=(TakesScreenshot) driver;
	    
	    File sourcefile=ts.getScreenshotAs(OutputType.FILE);
	    File targetfile=new File(System.getProperty("user.dir")+"\\ScreenShots\\Fullpage.png");
	    
	    sourcefile.renameTo(targetfile);
	    
	    Thread.sleep(5000);
	    
	    driver.quit();
	    
	    
		
		

	}

}
