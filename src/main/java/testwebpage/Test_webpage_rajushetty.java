package testwebpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_webpage_rajushetty {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		//driver.manage().window().maximize();
		String url="https://rahulshettyacademy.com/locatorspractice/";
		//driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.get(url);
		Thread.sleep(5000);
		String username="shubham";
		driver.findElement(By.id("inputUsername")).sendKeys(username);
		 driver.findElement(By.name("inputPassword")).sendKeys("password");
		 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		 Thread.sleep(3000);
		 
		 WebElement warning = driver.findElement(By.xpath("//p[@class=\"error\"]"));
		 String warningText=warning.getText();
		 System.out.println(warningText);
		 
		 
		 driver.findElement(By.xpath("//a[text()=\"Forgot your password?\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class=\"reset-pwd-btn\"]")).click();
			Thread.sleep(2000);
			
			WebElement passwordinfo = driver.findElement(By.xpath("//p[@class=\"infoMsg\"]"));
			String passwordinfotext = passwordinfo.getText();
			System.out.println(passwordinfotext);
			
			String[] passwordbreak = passwordinfotext.split("'");
			System.out.println(passwordbreak[1]);
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//button[@class=\"go-to-login-btn\"]")).click();
			Thread.sleep(2000);
			
			driver.findElement(By.id("inputUsername")).sendKeys(username);
			 driver.findElement(By.name("inputPassword")).sendKeys(passwordbreak[1]);
			 driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
			 Thread.sleep(2000);
			  WebElement hellotext = driver.findElement(By.tagName("h2"));
			  String hello =hellotext.getText();
			  System.out.println(hello);
			 String[] helloarray = hello.split(" ");
			 System.out.println(helloarray[1]);
			 String[] actualNameArray = helloarray[1].split(",");
			 System.out.println(actualNameArray[0]);
			 
			 System.out.println(actualNameArray[0].equals(username));
			 
			 driver.findElement(By.xpath("//button[@class=\"logout-btn\"]")).click();
			 System.out.println("Test completed successfully");

	}

	}



