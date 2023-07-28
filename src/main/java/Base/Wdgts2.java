package Base;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Wdgts2 extends Tstbse {
	public void DatePick() throws InterruptedException {
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scrollBy(0,500)", "");
		driver.findElement(By.xpath("//h5[text()='Widgets']")).click();
		js.executeScript("scrollBy(0,1500)", "");
		driver.findElement(By.xpath("//span[text()='Date Picker']")).click();
		driver.findElement(By.id("datePickerMonthYearInput")).click();
		Thread.sleep(3000);
		WebElement yr = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		Select se1 = new Select(yr);
		se1.selectByValue("1999");
		Thread.sleep(3000);
		WebElement m = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
		Select se2 = new Select(m);
		se2.selectByValue("8");
		Thread.sleep(3000);
		driver.findElement(By.id("datePickerMonthYearInput")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@class='react-datepicker-ignore-onclickoutside']")).sendKeys("September 20, 1999 5:10 PM");
		Thread.sleep(3000);
		String s1 = driver.findElement(By.id("datePickerMonthYearInput")).getText();
		System.out.println(s1);
		
		String s2 = driver.findElement(By.xpath("//input[@class='react-datepicker-ignore-onclickoutside']")).getText();
		System.out.println(s2);
		
	}

}
