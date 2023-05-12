package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Contacts")).click();
        driver.findElement(By.linkText("Create Contact")).click();
        driver.findElement(By.id("firstNameField")).sendKeys("Selvapriyanka");
        driver.findElement(By.id("lastNameField")).sendKeys("Muthukrishnan");
        driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Priyanka");
        driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("M");
        driver.findElement(By.xpath("//span[text()='Department']/following::input")).sendKeys("Testing");
        driver.findElement(By.xpath("//span[contains(text(),'Important')]/preceding::textarea")).sendKeys("Xpath learning");
        driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("selvariyanka94@gmail.com");
        WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
        Select stateOption = new Select(state);
        stateOption.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.linkText("Edit")).click();
        driver.findElement(By.xpath("//span[text()='Description']/following::textarea")).clear();
        driver.findElement(By.xpath("//span[contains(text(),'Important')]/following::textarea")).sendKeys("Selenium Training");
        driver.findElement(By.xpath("//input[@name='submitButton']")).click();
        String title = driver.getTitle();
        if(title.equals("View Contact | opentaps CRM"))
        	System.out.println("Passed - Contant updated. Page title is :"+title);
        else
        	System.out.println("Failed - Contant not updated. Page title is :"+title);
        
	}

}
