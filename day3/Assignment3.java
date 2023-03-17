package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		//Launch the URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		//Maximize the window
		driver.manage().window().maximize();
	
		//Locater to get username and password
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Infosys");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("priya");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Selvam");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("lakshmi");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CSE");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("I am learning selenium");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("lakshmi25@gmail.com");
		WebElement source=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select drop = new Select(source);
		drop.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.className("inputBox")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Lakshmi");
		driver.findElement(By.className("smallSubmit")).click();
		
	}

}
