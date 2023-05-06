package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {

	public static void main(String[] args){
	ChromeDriver driver=new ChromeDriver();
driver.get(" http://leaftaps.com/opentaps/control/main");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("AnithaPriya");
driver.findElement(By.id("ext-gen334")).click();
driver.findElement(By.linkText("ICICI")).click();
String title = driver.getTitle();
System.out.println(title);
driver.findElement(By.xpath("//a[@href='updateLeadForm?partyId=10890']")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("TCS");
driver.findElement(By.name("submitButton")).click();
driver.close();
}
}
