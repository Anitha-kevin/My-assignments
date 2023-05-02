package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClear {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("demosalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	 driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CTS");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("AnithaPriya");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VijayAnand");
	    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Anitha");
	    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("CustomerSupport");
	   driver.findElement(By.id("createLeadForm_description")).sendKeys("CreateLead");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("anitha.priya160207@gmail.com");
	    driver.findElement(By.name("submitButton")).click();
	    String lead = driver.getTitle();
	    System.out.println(lead);
	    driver.findElement(By.className("subMenuButton")).click();
	    driver.findElement(By.id("createLeadForm_companyName")).clear();
	    driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
	    driver.findElement(By.id("createLeadForm_firstName")).clear();
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priya");
	    driver.findElement(By.name("submitButton")).click();
	    System.out.println(driver.getTitle());	    
}
}

