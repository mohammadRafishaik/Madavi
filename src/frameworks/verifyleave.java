package frameworks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class verifyleave {
	
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		driver.get("http://testingmasters.com/hrm");
		driver.manage().window().maximize();
		driver.findElement(By.id("txtUsername")).sendKeys("user01");
		driver.findElement(By.id("txtPassword")).sendKeys("pass1234");
		driver.findElement(By.id("btnLogin")).click();
		
		WebElement ele =driver.findElement(By.xpath(".//*[@id='menu_leave_viewLeaveModule']/b"));
		Actions leave = new Actions(driver);
		leave.moveToElement(ele).build().perform();
		driver.findElement(By.xpath(".//*[@id='menu_leave_applyLeave']")).click();
		String  ele1 =driver.findElement(By.xpath(".//*[@id='apply-leave']/div[1]/h1")).getText();
		if(ele1.contains("Apply Leave"))
		{
			System.out.println("apply leave present");
		}
		
		else
		{
			System.out.println("apply leave not present");
		}
		
	}
}
