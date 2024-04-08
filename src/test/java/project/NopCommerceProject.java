package project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NopCommerceProject {
	
WebDriver driver;
	
	
	@BeforeTest
	public void setup() {
		
		 driver = new ChromeDriver(); // open the browser
		 
		driver.get("https://demo.nopcommerce.com/register"); // passing the URL
		
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void register() throws InterruptedException
	{
		WebElement radio = driver.findElement(By.id("gender-male"));
		radio.click();
		
		driver.findElement(By.id("FirstName")).sendKeys("john");
		driver.findElement(By.id("LastName")).sendKeys("cena");
		
		WebElement day = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		day.click();
		Select s1 = new Select(day);
		s1.selectByIndex(9);
		
		WebElement month = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		month.click();
		Select s2 = new Select(month);
		
		s2.selectByIndex(1);
		
		WebElement year = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
		year.click();
		Select s3 = new Select(year);
		s3.selectByVisibleText("2020");
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("gomef84867@hisotyr.com");
		
		driver.findElement(By.id("Company")).sendKeys("Masai");
		driver.findElement(By.id("Password")).sendKeys("123456");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
//		WebElement register_button = driver.findElement(By.xpath("//button[@name='register-button']"));
//		register_button.click();
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//*[contains(text(),'Continue')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(text(),'Books ')]")).click();
		
		
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 WebElement btn = driver.findElement(By.xpath("(//button[@class='button-2 product-box-add-to-cart-button'])[2]"));
		 btn.click();
		 //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.findElement(By.xpath("ico-cart")).click();	 
			
		// select check box
		
		WebElement checkbox = driver.findElement(By.id("termsofservice"));
		checkbox.click();
		
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		
		WebElement check_guest = driver.findElement(By.xpath("//button[@class ='button-1 checkout-as-guest-button']"));
		
		check_guest.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		
		//checkout page
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_FirstName']")).sendKeys("john");
		driver.findElement(By.xpath("//input[@id='BillingNewAddress_LastName']")).sendKeys("cena");
		
		driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("gomef84867@hisotyr.com");
		
		driver.findElement(By.id("BillingNewAddress_Company")).sendKeys("masai");
		
		WebElement country = driver.findElement(By.xpath("//select[@id='BillingNewAddress_CountryId']"));
		country.click();
		Select count = new Select(country);
		count.selectByIndex(1);
		
		WebElement state = driver.findElement(By.id("BillingNewAddress_StateProvinceId"));
		state.click();
		Select se = new Select(state);
		se.selectByValue("52");
		
		WebElement city = driver.findElement(By.id("BillingNewAddress_City"));
		city.sendKeys("Alaska");
		
		WebElement address1 = driver.findElement(By.id("BillingNewAddress_Address1"));
		address1.sendKeys("Alaska123");
		WebElement address2 = driver.findElement(By.id("BillingNewAddress_Address2"));
		address2.sendKeys("Alaska123");
		
		//zip code
		 driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("452020");
		 
		 driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("1234567890");
		 driver.findElement(By.id("BillingNewAddress_FaxNumber")).sendKeys("1234567890");
		 
		WebElement save_button = driver.findElement(By.xpath("//button[@name='save']"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 save_button.click();
		 
		 
		 //continue 1 click
		//button[@class='button-1 shipping-method-next-step-button']
		 WebElement continue1 = driver.findElement(By.xpath("//button[@class='button-1 shipping-method-next-step-button']"));
		 continue1.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		 
		 //continue 2 click
		 WebElement continue2 = driver.findElement(By.xpath("//button[@class='button-1 payment-method-next-step-button']"));
		 continue2.click();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 
		 //continue3
		 WebElement continue3 = driver.findElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
		 continue3.click();
		 
		//confirm button
		//button[@class='button-1 confirm-order-next-step-button']
		 WebElement confirmButton = driver.findElement(By.xpath("//button[@class='button-1 confirm-order-next-step-button']"));
		 confirmButton.click();
		 
		String message = driver.findElement(By.xpath("//*[contains(text(), 'Your order has been successfully processed!')]")).getText();
		System.out.println("Show Message: " + message);
	}
	
	

}
