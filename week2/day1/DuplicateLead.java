package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.linkText("Create Lead")).click();
        driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Selvapriyanka");
        driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Muthukrishnan");
        driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priyanka");
        driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
        driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Learning");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("selvapriyanka94@gmail.com");
        WebElement state=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select stateOption = new Select(state);
        stateOption.selectByVisibleText("New York");
        driver.findElement(By.className("smallSubmit")).click();
        String title = driver.getTitle();
        if(title.equals("View Lead | opentaps CRM"))
        	System.out.println("Passed - Lead is created successfully. Page title after login is "+title);
        else
        	System.out.println("Failed - Lead is not created successfully. Page title after login is "+title);
        driver.findElement(By.linkText("Duplicate Lead")).click();
        WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
        companyName.clear();
        companyName.sendKeys("TestLeafOrganization");
        WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
        firstName.clear();
        firstName.sendKeys("Priyanka");
        driver.findElement(By.className("smallSubmit")).click();
        if(driver.getTitle().equals("View Lead | opentaps CRM"))
        	System.out.println("Passed - Lead is updated successfully. Page title after login is "+title);
        else
        	System.out.println("Failed - Lead is not updated successfully. Page title after login is "+title);
	}

}
