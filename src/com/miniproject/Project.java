 package com.miniproject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Project {
public static void main(String[] args) throws AWTException, InterruptedException, IOException {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
	driver.get("https://magento.softwaretestingboard.com/");
	String window_1 = driver.getWindowHandle();
	WebElement creatacc = driver.findElement(By.xpath("(//a[text()='Create an Account'])[1]"));
	creatacc.click();
	WebElement firstname = driver.findElement(By.xpath("//input[@id='firstname']"));
	firstname.sendKeys("Gowtham");
	WebElement lastname = driver.findElement(By.xpath("//input[@id='lastname']"));
	lastname.sendKeys("Mohan");
	WebElement email = driver.findElement(By.xpath("//input[@id='email_address']"));
	email.sendKeys("gowtham12345789@gmail.com");
	WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
	password.sendKeys("Gowtham@123456");
	WebElement confirmpassword = driver.findElement(By.xpath("//input[@id='password-confirmation']"));
	confirmpassword.sendKeys("Gowtham@123456");
	WebElement creatacc2 = driver.findElement(By.xpath("(//*[contains(text(),'Create')])[5]"));
	creatacc2.click();
	Actions ma = new Actions(driver);
	
	WebElement men = driver.findElement(By.xpath("//*[text()='Men']"));
	ma.moveToElement(men).perform();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));	
	WebElement tops = driver.findElement(By.xpath("//a[@id='ui-id-17']"));
	wait.until(ExpectedConditions.visibilityOf(tops));
	ma.moveToElement(tops).perform();
	WebElement  Hoodies = driver.findElement(By.xpath("(//*[contains(text(),'Hoodies')])[2]"));
	ma.moveToElement(Hoodies).perform();
	JavascriptExecutor js = (JavascriptExecutor)driver;
    js.executeScript("arguments[0].click();", Hoodies);
    WebElement dd = driver.findElement(By.xpath("(//select[@id='sorter'])[1]"));
    Select sc = new Select(dd);
    sc.selectByValue("price");  
    WebElement material = driver.findElement(By.xpath("//div[text()='Material']"));
    js.executeScript("arguments[0].click();", material);
    WebElement hamp = driver.findElement(By.xpath("//a[contains(text(),'Hemp')]"));
    js.executeScript("arguments[0].click();", hamp);
    WebElement product = driver.findElement(By.xpath("//a[contains(text(),'Hero')]"));
    ma.contextClick(product).perform();
    Robot r = new Robot();
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_DOWN);
    r.keyPress(KeyEvent.VK_ENTER); 
    Thread.sleep(5000);
    Set<String> windowHandles = driver.getWindowHandles();
    for (String string : windowHandles) {
		if(!window_1.equals(string)) {
			driver.switchTo().window(string);
			break;
		}
	}
//    List<String>allwindows = new ArrayList<>(windowHandles);
//    driver.switchTo().window(allwindows.get(1));
    WebElement size = driver.findElement(By.xpath("(//div[text()='M'])[1]"));
    size.click();
    WebElement colour = driver.findElement(By.xpath("(//div[@class='swatch-option color'])[3]"));
    colour.click();
    WebElement qty = driver.findElement(By.xpath("//input[@id='qty']"));
    qty.clear();
    qty.sendKeys("4");
    driver.switchTo().window(window_1);
	WebElement clear = driver.findElement(By.xpath("//*[contains(text(),'Clear')]"));
	js.executeScript("arguments[0].click();", clear);
	WebElement size2 = driver.findElement(By.xpath("//div[text()='Size']"));
	size2.click();
	WebElement sizeL = driver.findElement(By.xpath("(//div[@class='swatch-option text '])[4]"));
	sizeL.click();
	WebElement colour1 = driver.findElement(By.xpath("//div[text()='Color']"));
	colour1.click();
	WebElement red = driver.findElement(By.xpath("(//div[@option-label='Red'])[8]"));
	red.click();
	WebElement findElement = driver.findElement(By.xpath("//a[contains(text(),'Oslo')]"));
	ma.moveToElement(findElement);
    WebElement addtocart = driver.findElement(By.xpath("(//*[text()='Add to Cart'])[1]"));
    js.executeScript("arguments[0].click();", addtocart);    
    WebElement carticon = driver.findElement(By.xpath("//a[@class='action showcart']"));
    js.executeScript("arguments[0].click();", carticon);
    WebElement viewtocart = driver.findElement(By.xpath("//*[text()='View and Edit Cart']"));
    js.executeScript("arguments[0].click();", viewtocart);
    Thread.sleep(5000);
    WebElement inputbox = driver.findElement(By.xpath("//input[@data-role='cart-item-qty']"));
    inputbox.clear();
    inputbox.sendKeys("2");
    WebElement updateshopping = driver.findElement(By.xpath("//*[text()='Update Shopping Cart']"));
    updateshopping.click();
    Thread.sleep(5000);
    WebElement procedtocheckout = driver.findElement(By.xpath("(//*[text()='Proceed to Checkout'])[2]"));
    js.executeScript("arguments[0].click();", procedtocheckout);
      Thread.sleep(5000);
    WebElement email2 = driver.findElement(By.xpath("(//input[@type='email'])[2]"));
    if(email2.isDisplayed()) {
    	email2.sendKeys("gowtham12345697@gmail.com");
    }
    WebElement firstname1 = driver.findElement(By.xpath("//input[@name='firstname']"));
    firstname1.sendKeys("Gowtham");
    WebElement lastname2 = driver.findElement(By.xpath("//input[@name='lastname']"));
    lastname2.sendKeys("Mohan");
    WebElement phonenumber = driver.findElement(By.xpath("//input[@name='telephone']"));
    phonenumber.sendKeys("7708651323");
    WebElement country = driver.findElement(By.xpath("(//select[@class='select'])[2]"));
    Select sc2 = new Select(country);
    sc2.selectByVisibleText("India");
    WebElement state = driver.findElement(By.xpath("(//select[@class='select'])[1]"));
    Select sc3 = new Select(state);
    sc3.selectByVisibleText("Tamil Nadu");
    Thread.sleep(3000);
    WebElement city = driver.findElement(By.xpath("(//input[@class='input-text'])[10]"));
    city.sendKeys("Ambur"); 
    WebElement pincode = driver.findElement(By.xpath("(//input[@class='input-text'])[12]"));
    pincode.sendKeys("635802");
    WebElement street = driver.findElement(By.xpath("(//input[@class='input-text'])[7]"));
    Thread.sleep(3000);
    street.sendKeys("Ambur");
    Thread.sleep(3000);
    WebElement nextbtn = driver.findElement(By.xpath("//*[text()='Next']"));
    js.executeScript("arguments[0].click();", nextbtn);
    WebElement findElement2 = driver.findElement(By.xpath("//*[text()='Place Order']"));
    js.executeScript("arguments[0].click();", findElement2);
    Thread.sleep(3000);
    TakesScreenshot ts = (TakesScreenshot)driver;
   File source = ts.getScreenshotAs(OutputType.FILE);
   File desc = new File("./ScreenShort/img1.png");
   FileHandler.copy(source, desc);
   Thread.sleep(3000);
   driver.quit();
}

}
