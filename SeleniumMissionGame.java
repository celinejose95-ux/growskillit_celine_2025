package selenium_assignment;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumMissionGame {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/celin/AppData/Local/Temp/f3862a12-8a58-4413-a3c1-cf201c958c22_upload_bf111789-5d91-4cb2-b35d-64db2147abf2%20(1).zip.c22/assignment/selenium-mission-game.html");
		Thread.sleep(1000);
		WebElement startbtn=driver.findElement(By.xpath("//button[text()='Start Mission']"));
		startbtn.click();
		Thread.sleep(2000);
		Alert alertbtn=driver.switchTo().alert();
		Thread.sleep(2000);
		alertbtn.sendKeys("Level1");
		alertbtn.accept();
		Thread.sleep(4000);
		Set<String>windows=driver.getWindowHandles();
		Iterator<String>it=windows.iterator();
		String parentwin=it.next();
		String childwin=it.next();
		driver.switchTo().window(childwin);
		Thread.sleep(3000);
		driver.findElement(By.id("levelInput")).sendKeys("level2");
		driver.findElement(By.xpath("//*[text()='Submit']")).click();
		Thread.sleep(7000);
		driver.switchTo().window(parentwin);
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.xpath("//div[@id='circle']"));
		WebElement drop=driver.findElement(By.xpath("//*[contains(text(),'Drop Circle Here')]"));
		act.dragAndDrop(drag, drop).perform();
		Thread.sleep(2000);
		WebElement drag1=driver.findElement(By.xpath("//div[@id='triangle']"));
		WebElement drop1=driver.findElement(By.xpath("//*[contains(text(),'Drop triangle Here')]"));
		act.dragAndDrop(drag1, drop1).perform();
		Thread.sleep(3000);
		WebElement frameswitch=driver.findElement(By.tagName("iframe"));
		driver.switchTo().frame(frameswitch);
		Select country=new Select(driver.findElement(By.id("country")));
		country.selectByContainsVisibleText("India");
		driver.findElement(By.xpath("//[text()='Submit']")).click();
		
		
		
	}
		

}
