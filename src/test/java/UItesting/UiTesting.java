package UItesting;

import java.io.File;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class UiTesting {

	public static void main(String[] args) throws InterruptedException
	{
		//Chrome-driver
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Calendar cal=Calendar.getInstance();
		Date time=cal.getTime();
		String timestrap=time.toString().replace(":", "").replace(" ", "");
		
		String url="https://www.getcalley.com/page-sitemap.xml";
		
		By txt_link=By.xpath("//a[normalize-space()='https://www.getcalley.com/']");
		By txt_link2=By.xpath("//a[normalize-space()='https://www.getcalley.com/calley-lifetime-offer/']");
		By txt_link3=By.xpath("//a[normalize-space()='https://www.getcalley.com/see-a-demo/']");	
		By txt_link4=By.xpath("//a[normalize-space()='https://www.getcalley.com/calley-teams-features/']");
		By txt_link5=By.xpath("//a[normalize-space()='https://www.getcalley.com/calley-pro-features/']");
		
		//desktop-Resoultion
		Dimension d=new Dimension(1920, 1080);
		Dimension d1=new Dimension(1366,768);
		Dimension d2=new Dimension(1536,864);
	
		String path="\\DesktopScreenshots\\1920×1080\\";
		String path1="\\DesktopScreenshots\\1366×768\\";
		String path2="\\DesktopScreenshots\\1536×864\\";
		
		//mobile-Resoulution
		Dimension m=new Dimension(360, 640);
		Dimension m1=new Dimension(375, 667);
		Dimension m2=new Dimension(414, 896);
		
		String mpath="\\MobileScreenShots\\360×640\\";
		String mpath1="\\MobileScreenShots\\375×667\\";
		String mpath2="\\MobileScreenShots\\414×896\\";
		
		//txt_link-1
		UiTesting.capture(driver, timestrap, path, d, url, txt_link,"chrome_getcalley");
		UiTesting.capture(driver, timestrap, path1, d1, url, txt_link,"chrome_getcalley");
		UiTesting.capture(driver, timestrap, path2, d2, url, txt_link,"chrome_getcalley");
		UiTesting.capture(driver, timestrap, mpath, m, url, txt_link,"chrome_getcalley");
		UiTesting.capture(driver, timestrap, mpath1, m1, url, txt_link,"chrome_getcalley");
		UiTesting.capture(driver, timestrap, mpath2, m2, url, txt_link,"chrome_getcalley");
	
		//txt_link-2
		UiTesting.capture(driver, timestrap, path, d, url, txt_link2,"chrome_lifetimeoffer");
		UiTesting.capture(driver, timestrap, path1, d1, url, txt_link2,"chrome_lifetimeoffer");
		UiTesting.capture(driver, timestrap, path2, d2, url, txt_link2,"chrome_lifetimeoffer");
		UiTesting.capture(driver, timestrap, mpath, m, url, txt_link2,"chrome_lifetimeoffer");
		UiTesting.capture(driver, timestrap, mpath1, m1, url, txt_link2,"chrome_lifetimeoffer");
		UiTesting.capture(driver, timestrap, mpath2, m2, url, txt_link2,"chrome_lifetimeoffer");
		
		//txt_link-3
		UiTesting.capture(driver, timestrap, path, d, url, txt_link3,"chrome_demo");
		UiTesting.capture(driver, timestrap, path1, d1, url, txt_link3,"chrome_demo");
		UiTesting.capture(driver, timestrap, path2, d2, url, txt_link3,"chrome_demo");
		UiTesting.capture(driver, timestrap, mpath, m, url, txt_link3,"chrome_demo");
		UiTesting.capture(driver, timestrap, mpath1, m1, url, txt_link3,"chrome_demo");
		UiTesting.capture(driver, timestrap, mpath2, m2, url, txt_link3,"chrome_demo");
		
		//txt_link-4
		UiTesting.capture(driver, timestrap, path, d, url, txt_link4,"chrome_teams_feauture");
		UiTesting.capture(driver, timestrap, path1, d1, url,txt_link4,"chrome_teams_feauture");
		UiTesting.capture(driver, timestrap, path2, d2, url,txt_link4,"chrome_teams_feauture");
		UiTesting.capture(driver, timestrap, mpath, m, url, txt_link4,"chrome_teams_feauture");
		UiTesting.capture(driver, timestrap, mpath1, m1, url,txt_link4,"chrome_teams_feauture");
		UiTesting.capture(driver, timestrap, mpath2, m2, url, txt_link2,"chrome_lteams_feauture");
		
		//txt_link-5
		UiTesting.capture(driver, timestrap, path, d, url, txt_link5,"chrome_pro_feature");
		UiTesting.capture(driver, timestrap, path1, d1, url, txt_link5,"chrome_pro_feature");
		UiTesting.capture(driver, timestrap, path2, d2, url, txt_link5,"chrome_pro_feature");
		UiTesting.capture(driver, timestrap, mpath, m, url, txt_link5,"chrome_pro_feature");
		UiTesting.capture(driver, timestrap, mpath1, m1, url, txt_link5,"chrome_pro_feature");
		UiTesting.capture(driver, timestrap, mpath2, m2, url, txt_link5,"chrome_pro_feature");
		
		driver.quit();
		
		WebDriver driver2=new FirefoxDriver();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//txt_link-1
		UiTesting.capture(driver2, timestrap, path, d, url, txt_link,"firefox__getcalley");
		UiTesting.capture(driver2, timestrap, path1, d1, url, txt_link,"firefox_getcalley");
		UiTesting.capture(driver2, timestrap, path2, d2, url, txt_link,"firefox_getcalley");
		UiTesting.capture(driver2, timestrap, mpath, m, url, txt_link,"firefox_getcalley");
		UiTesting.capture(driver2, timestrap, mpath1, m1, url, txt_link,"firefox_getcalley");
		UiTesting.capture(driver2, timestrap, mpath2, m2, url, txt_link,"firefox_getcalley");
		
		//txt_link-2
		UiTesting.capture(driver2, timestrap, path, d, url, txt_link2,"firefox__lifetimeoffer");
		UiTesting.capture(driver2, timestrap, path1, d1, url, txt_link2,"firefox_lifetimeoffer");
		UiTesting.capture(driver2, timestrap, path2, d2, url, txt_link2,"firefox_lifetimeoffer");
		UiTesting.capture(driver2, timestrap, mpath, m, url, txt_link2,"firefox_lifetimeoffer");
		UiTesting.capture(driver2, timestrap, mpath1, m1, url, txt_link2,"firefox_lifetimeoffer");
		UiTesting.capture(driver2, timestrap, mpath2, m2, url, txt_link2,"firefox_lifetimeoffer");
		
		//txt_link-3
		UiTesting.capture(driver2, timestrap, path, d, url, txt_link3,"firefox_demo");
		UiTesting.capture(driver2, timestrap, path1, d1, url, txt_link3,"firefox_demo");
		UiTesting.capture(driver2, timestrap, path2, d2, url, txt_link3,"firefox_demo");
		UiTesting.capture(driver2, timestrap, mpath, m, url, txt_link3,"firefox_demo");
		UiTesting.capture(driver2, timestrap, mpath1, m1, url, txt_link3,"firefox_demo");
		UiTesting.capture(driver2, timestrap, mpath2, m2, url, txt_link3,"firefox_demo");
		
		//txt_link-4
		UiTesting.capture(driver2, timestrap, path, d, url, txt_link4,"firefox_teams_feauture");
		UiTesting.capture(driver2, timestrap, path1, d1, url, txt_link4,"firefox_teams_feauture");
		UiTesting.capture(driver2, timestrap, path2, d2, url, txt_link4,"firefox_teams_feauture");
		UiTesting.capture(driver2, timestrap, mpath, m, url, txt_link4,"firefox_teams_feauture");
		UiTesting.capture(driver2, timestrap, mpath1, m1, url, txt_link4,"firefox_teams_feauture");
		UiTesting.capture(driver2, timestrap, mpath2, m2, url, txt_link4,"firefox_lteams_feauture");
		
		//txt_link-5
		UiTesting.capture(driver2, timestrap, path, d, url, txt_link5,"firefox_pro_feature");
		UiTesting.capture(driver2, timestrap, path1, d1, url, txt_link5,"firefox_pro_feature");
		UiTesting.capture(driver2, timestrap, path2, d2, url, txt_link5,"firefox_pro_feature");
		UiTesting.capture(driver2, timestrap, mpath, m, url, txt_link5,"firefox_pro_feature");
		UiTesting.capture(driver2, timestrap, mpath1, m1, url, txt_link5,"chrome_pro_feature");
		UiTesting.capture(driver2, timestrap, mpath2, m2, url, txt_link5,"firefox_pro_feature");
		
		driver2.quit();
		
		
	}
	
	public static void capture(WebDriver driver,String time,String path,Dimension d,String url,By txt,String name)
	{
		driver.get(url);
		driver.manage().window().setSize(d);
		driver.findElement(txt).click();
		TakesScreenshot ts=(TakesScreenshot) driver;
		File srcfile=ts.getScreenshotAs(OutputType.FILE);
		File trgtfile=new File(System.getProperty("user.dir")+path+name+time+".png");
		srcfile.renameTo(trgtfile);
	
	}
	

}
