package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookCreateAccount {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[contains(text(),'Create new')]")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Selvapriyanka");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Muthukrishnan");
		driver.findElement(By.xpath("(//div[@id='reg_form_box']//input)[3]")).sendKeys("7904341989");
		driver.findElement(By.xpath("//div[contains(text(),'password')]/following-sibling::input")).sendKeys("Test@12345");
		WebElement day = driver.findElement(By.id("day"));
		Select dayOption=new Select(day);
		dayOption.selectByValue("19");
		WebElement month = driver.findElement(By.id("month"));
		Select monthOption=new Select(month);
		monthOption.selectByVisibleText("Dec");
		WebElement year = driver.findElement(By.id("year"));
		Select yearOption=new Select(year);
		yearOption.selectByVisibleText("1994");
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
	}

}
