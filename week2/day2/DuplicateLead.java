package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DuplicateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.findElement(By.id("username")).sendKeys("demoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM/SFA")).click();
        driver.findElement(By.linkText("Leads")).click();
        driver.findElement(By.xpath("//a[contains(text(),'Find')]")).click();
        driver.findElement(By.xpath("//span[text()='Email']")).click();
        driver.findElement(By.xpath("//label[contains(text(),'Email Address')]/following::input")).sendKeys("selvapriyanka94@gmail.com");
        driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Lead List']/following::a[@class='linktext'])[3]")));
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.refreshed(ExpectedConditions.elementToBeClickable(By.xpath("(//span[text()='Lead List']/following::a[@class='linktext'])[4]"))));
        WebElement leadfirstNameInList = driver.findElement(By.xpath("(//span[text()='Lead List']/following::a[@class='linktext'])[3]"));
        WebElement leadLastNameInList = driver.findElement(By.xpath("(//span[text()='Lead List']/following::a[@class='linktext'])[4]"));
        String firstLeadName = leadfirstNameInList.getText();
        String lastLeadName = leadLastNameInList.getText();
        String leadName = firstLeadName+" "+lastLeadName;
        //System.out.println(firstLeadName);
        leadfirstNameInList.click();
        driver.findElement(By.linkText("Duplicate Lead")).click();
        String pageTitle = driver.getTitle();
        if(pageTitle.contains("Duplicate Lead"))
        	System.out.println("Page title is "+pageTitle+". Passed");
        else
        System.out.println("Page title is "+pageTitle+". Failed");
        driver.findElement(By.name("submitButton")).click();
        String firstName = driver.findElement(By.xpath("//span[text()='First name']/following::span")).getText();
        String lastName = driver.findElement(By.xpath("//span[text()='Last name']/following::span")).getText();
        String name = firstName+" "+lastName;
        if(leadName.equals(name))
        	System.out.println("Duplicated Lead name is "+leadName+". Passed");
        else
        	System.out.println("Duplicated Lead name is "+leadName+". Passed");
        driver.close();
	}

}
