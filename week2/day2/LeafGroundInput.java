package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGroundInput {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[contains(text(),'Type your')]/following::input")).sendKeys("Selvapriyanka");
		driver.findElement(By.xpath("//h5[contains(text(),'confirm')]/following::input[@type='text']")).sendKeys(Keys.ENTER);
		String errorMessage = driver.findElement(By.xpath("//h5[contains(text(),'confirm')]/following::span[contains(@class,'detail')]")).getText();
		assert errorMessage.contains("Age is mandatory");
		System.out.println();
		driver.findElement(By.xpath("//h5[contains(text(),'Append')]/following::input")).sendKeys(Keys.END+"India");
		Point usernamePosition = driver.findElement(By.xpath("//h5[contains(text(),'Position')]/following::label")).getLocation();
		driver.findElement(By.xpath("//h5[contains(text(),'Position')]/following::input")).click();
		Point usernameChangedPosition = driver.findElement(By.xpath("//h5[contains(text(),'Position')]/following::label")).getLocation();
		if(usernameChangedPosition!=usernamePosition)
		{
			System.out.println("Passed");
		}
			
		else
			System.out.println("Failed");
		System.out.println(usernamePosition);
		System.out.println(usernameChangedPosition);
		assert !driver.findElement(By.xpath("//h5[contains(text(),'disabled')]/following::input")).isEnabled();
		WebElement list = driver.findElement(By.xpath("//h5[contains(text(),'third')]/following::input"));
		list.sendKeys("Selvapriyanka");
		//list.findElements(null)
		driver.findElement(By.xpath("//h5[contains(text(),'typed')]/following::input")).clear();
	}

}
