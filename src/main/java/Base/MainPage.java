package Base;


import org.openqa.selenium.By;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class MainPage extends Tstbse {
	
	public void ScrlNclk() {
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");  
		driver.findElement(By.xpath("//h5[text()='Elements']")).click();
		
	}
	public void TextBox(String user, String email, String ca,String pa) throws InterruptedException {
		ScrlNclk();
		driver.findElement(By.id("item-0")).click();
		driver.findElement(By.id("userName")).sendKeys(user);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		driver.findElement(By.id("currentAddress")).sendKeys(ca);
		driver.findElement(By.id("permanentAddress")).sendKeys(pa);
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js1.executeScript("window.scrollBy(0,250)", "");  
		driver.findElement(By.id("submit")).click();
		
	}
	public void RadioButton() throws InterruptedException {
		ScrlNclk();
		driver.findElement(By.id("item-2")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='impressiveRadio']")).click();
		String ir = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		System.out.println(ir);
		driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
		String y = driver.findElement(By.xpath("//p[@class='mt-3']")).getText();
		System.out.println(y);
	}
	public void WebTable(String f,String n, String e,String a,String s,String d) throws InterruptedException {
		ScrlNclk();
		driver.findElement(By.id("item-3")).click();
		driver.findElement(By.id("addNewRecordButton")).click();
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(n);
		driver.findElement(By.id("userEmail")).sendKeys(e);
		driver.findElement(By.id("age")).sendKeys(a);
		driver.findElement(By.id("salary")).sendKeys(s);
		driver.findElement(By.id("department")).sendKeys(d);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("delete-record-4")).click();
	}
	public void Buttons() throws InterruptedException {
		ScrlNclk();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.id("item-4")).click();
		Thread.sleep(3000);
		Actions a = new Actions(driver); 
		WebElement e1 = driver.findElement(By.id("doubleClickBtn"));
		a.doubleClick(e1).perform(); 
		Thread.sleep(3000);
		WebElement e2 = driver.findElement(By.id("rightClickBtn"));
		a.contextClick(e2).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
	}
	public void Upload() throws InterruptedException {
		ScrlNclk();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		
		driver.findElement(By.id("item-7")).click();
		Thread.sleep(3000);
		String file ="C:\\Users\\Krishnachaithanya\\Downloads\\sampleFile.jpeg";
		driver.findElement(By.id("uploadFile")).sendKeys(file);
		driver.findElement(By.id("downloadButton")).click();
		Thread.sleep(3000);
	}
	

}
