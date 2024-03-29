package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class SeTest {
private static WebDriver driver=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\User\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		driver = new FirefoxDriver();
		 
        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        //Launch the Online Store Website
 
        driver.get("http://www.store.demoqa.com");
 
        
        driver.findElement(By.xpath("/html/body/p/a")).click();
        // Find the element that's ID attribute is 'account'(My Account) 
 
        driver.findElement(By.xpath("/html/body/div[1]/header/div[1]/div/ul[2]/li[2]/a")).click();
 
        // Find the element that's ID attribute is 'log' (Username)
 
        // Enter Username on the element found by above desc.
 
        driver.findElement(By.id("username")).sendKeys("testuser_1"); 
     // Find the element that's ID attribute is 'pwd' (Password)
        
        // Enter Password on the element found by the above desc.
 
        driver.findElement(By.id("password")).sendKeys("Test@123");
 
        // Now submit the form. WebDriver will find the form for us from the element 
 
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/article/div/div/div[2]/div[1]/form/p[3]/button")).click();
 
        // Print a Log In message to the screen
 
        System.out.println("Login Successfully");
 
        // Find the element that's ID attribute is 'account_logout' (Log Out)
 
        //driver.findElement (By.xpath("")).click();
 
        // Print a Log In message to the screen
 
 //       System.out.println("LogOut Successfully");
 
        // Close the driver
 
        driver.quit();
	}

}
