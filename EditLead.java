package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
        WebElement usernameElement = driver.findElement(By.id("username"));
        usernameElement.sendKeys("Demosalesmanager");
        
        WebElement passwordElement = driver.findElement(By.id("password"));
        passwordElement.sendKeys("crmsfa");
        
        WebElement loginElement = driver.findElement(By.className("decorativeSubmit"));
        loginElement.click();
        
        WebElement crmsfaElement = driver.findElement(By.linkText("CRM/SFA"));
        crmsfaElement.click();
        
        WebElement createLeadElement = driver.findElement(By.linkText("Create Lead"));
        createLeadElement.click();
       
        WebElement companyNameElement = driver.findElement(By.id("createLeadForm_companyName"));
        companyNameElement.sendKeys("Amazon");
        
        WebElement firstNameElement = driver.findElement(By.id("createLeadForm_firstName"));
        firstNameElement.sendKeys("Varadha");
        
        WebElement secondNameElement = driver.findElement(By.id("createLeadForm_lastName"));
        secondNameElement.sendKeys("Rajan");
        
        WebElement firstNameLocalElement = driver.findElement(By.id("createLeadForm_firstNameLocal"));
        firstNameLocalElement.sendKeys("Varadhaa");
        
        WebElement stateElement = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select dd = new Select(stateElement);
        dd.selectByIndex(1);
        
        WebElement createElement = driver.findElement(By.className("smallSubmit"));
        createElement.click();
        
        WebElement editElement = driver.findElement(By.linkText("Edit"));
        editElement.click();
        
        WebElement importantNoteElement = driver.findElement(By.id("updateLeadForm_importantNote"));
        importantNoteElement.sendKeys("Very Important Note");
        
        importantNoteElement.clear();
        
        System.out.println(driver.getTitle());
	}

	}
