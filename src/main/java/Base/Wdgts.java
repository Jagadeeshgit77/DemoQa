package Base;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wdgts extends Tstbse {
	public void Prgrsbr() {
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)", "");
		driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
		js.executeScript("scrollBy(0,1500)", "");
		//new WebDriverWait(driver, 20).until(ExpectedConditions
		//		.elementToBeClickable(By.id("item-4"))).click();
		driver.findElement(By.xpath("//span[text()='Progress Bar']")).click();
		js.executeScript("scrollBy(0,-1000)", ""); 
		//driver.findElement(By.id("startStopButton")).click();
		WebElement s = driver.findElement(By.id("startStopButton"));
		Actions ss = new Actions(driver);
		ss.moveToElement(s).click().perform();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement s1 = driver.findElement(By.id("startStopButton"));
		Actions ss1 = new Actions(driver);
		ss1.moveToElement(s1).click().perform();
		
		String pb = driver.findElement(By.id("progressBar")).getText();
		System.out.println(pb);
	}
	
	public void Accordian() throws InterruptedException {
		driver.navigate().back();
		driver.navigate().back();
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)", "");
		driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
		driver.findElement(By.xpath("//span[text()='Accordian']")).click();
		driver.findElement(By.id("section1Heading")).click();
		String s1 = driver.findElement(By.id("section1Content")).getText();
		System.out.println(s1);
		Thread.sleep(3000);
		driver.findElement(By.id("section2Heading")).click();
		 
		String s2 = driver.findElement(By.id("section2Content")).getText();
		System.out.println(s2);
		Thread.sleep(3000);
		driver.findElement(By.id("section3Heading")).click();
		 
		String s3 = driver.findElement(By.id("section3Content")).getText();
	   
		System.out.println(s3);
	}
	
	public void AutoComp() {
		driver.findElement(By.xpath("//span[text()='Auto Complete']")).click();
		for (char c='a'; c<='z' ; c++ ) {
			driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")).click();
			//driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys(String.valueOf(c));
			WebElement element = new WebDriverWait(driver, 10).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")));
			element.sendKeys(String.valueOf(c));
			driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")).sendKeys(Keys.ENTER);
			String s = driver.findElement(By.xpath("//div[@class='auto-complete__value-container auto-complete__value-container--is-multi css-1hwfws3']")).getText();
			System.out.println(s);
		}
		Random r = new Random();
		int rN = r.nextInt(26); // Generates a random number between 0 and 25
		char rC = (char) (rN + 'a');
		driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']")).click();
		driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']")).sendKeys(String.valueOf(rC));
		driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']")).sendKeys(Keys.ENTER);
		String s1 = driver.findElement(By.xpath("//div[@class='auto-complete__value-container css-1hwfws3']")).getText();
		System.out.println(s1);
	}
	
	

}
