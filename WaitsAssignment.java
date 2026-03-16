package selenium_assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("file:///C:/Users/celin/AppData/Local/Temp/48002f06-ccf9-4553-b3f6-8822150d6406_upload_92b75a56-02bc-4268-9b5c-7504f597a45a.zip.406/Selenium_waits_Assignment/example3.html");

		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("foodHeading")));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("category")));

 

		

		

		//WebElement element=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cartCount")));

		System.out.println("Menu item is visible");

		 

		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		 

		WebElement category=driver.findElement(By.xpath("//button[contains(text(),'Dessert')]"));

		category.click();

		 

		WebElement cart=driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[2]"));

		cart.click();

		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("cartCount"),"1"));

		 

		WebElement confirmBtn=driver.findElement(By.xpath("//button[@id='confirmOrderBtn']"));

		confirmBtn.click();

		driver.findElement(By.id("closePopupBtn")).click();

	}

}
