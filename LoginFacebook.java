package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginFacebook {

	public static void main(String[] args) {
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://en-gb.facebook.com");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(30));
	driver.findElement(By.linkText("Create new account")).click();
	driver.findElement(By.name("firstname")).sendKeys("Anitha");
	driver.findElement(By.name("lastname")).sendKeys("Priya");
	driver.findElement(By.name("reg_email__")).sendKeys("9585900333");
	driver.findElement(By.id("password_step_input")).sendKeys("kevin");
	WebElement day = driver.findElement(By.id("day"));
	Select BirthDay=new Select(day);
	BirthDay.selectByIndex(1);
	WebElement month = driver.findElement(By.id("month"));
	Select BirthMonth=new Select(month);
	BirthMonth.selectByIndex(1);
	WebElement year = driver.findElement(By.id("year"));
    Select BirthYear=new Select(year);
    BirthYear.selectByValue("1990");
    driver.findElement(By.name("sex")).click();
	}
	}
