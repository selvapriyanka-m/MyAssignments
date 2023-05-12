package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGroundSelect {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
		driver.manage().window().maximize();
        WebElement tool = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select automationTool=new Select(tool);
        automationTool.selectByVisibleText("Selenium");
        driver.findElement(By.xpath("//h5[contains(text(),'Course')]/following::button")).click();
        driver.findElement(By.xpath("//span[contains(@class,'ui-autocomplete-panel')]//li[text()='Selenium WebDriver']")).click();
        WebElement country=driver.findElement(By.xpath("//h5[contains(text(),'preferred country')]/following::Select"));
        Select preferredCountry=new Select(country);
        preferredCountry.selectByValue("India");
        WebElement city=driver.findElement(By.xpath("//h5[contains(text(),'Cities')]/following::Select"));
        Select preferredCity=new Select(city);
        preferredCity.selectByValue("Chennai");
        WebElement language=driver.findElement(By.xpath("//h5[contains(text(),'language randomly')]/following::Select"));
        Select preferredLanguage=new Select(language);
        preferredLanguage.selectByVisibleText("Tamil");
        WebElement langChosen=driver.findElement(By.xpath("//h5[contains(text(),'language chosen')]/following::Select"));
        Select langValue=new Select(langChosen);
        langValue.selectByValue("Two");
	}

}
