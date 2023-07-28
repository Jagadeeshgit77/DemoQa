package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlrFrmWin extends Tstbse {
	public void Alerts(String name) {
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)", "");
		driver.findElement(By.xpath("//h5[text()='Alerts, Frame & Windows']")).click();
		js.executeScript("scrollBy(0,500)", "");
		new WebDriverWait(driver, 20).until(ExpectedConditions
				.elementToBeClickable(By.xpath("//span[text()='Alerts']"))).click();
		driver.findElement(By.id("alertButton")).click();
		driver.switchTo().alert().accept();
		
		// Click the button that triggers the alert
		driver.findElement(By.id("timerAlertButton")).click();

		// Wait for the alert to appear
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		
		driver.findElement(By.id("confirmButton")).click();
		driver.switchTo().alert().dismiss();
		
		/*driver.findElement(By.id("promtButton")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().sendKeys("Your Name");*/
		
		driver.findElement(By.id("promtButton")).click();
		//WebDriverWait wait = new WebDriverWait(driver, 10);
		Alert promptBox = wait.until(ExpectedConditions.alertIsPresent());
		promptBox.sendKeys(name);
		promptBox.accept();
		
		String res=driver.findElement(By.id("promptResult")).getText();
		System.out.println(res);
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
}
