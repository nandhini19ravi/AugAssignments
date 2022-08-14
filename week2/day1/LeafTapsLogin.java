package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

//import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafTapsLogin {
public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	EdgeDriver driv =new EdgeDriver();
	driv.get("http://leaftaps.com/opentaps");
	driv.manage().window().maximize();
	WebElement elementUserName = driv.findElement(By.id("username"));
	elementUserName.sendKeys("DemoSalesManager");
	WebElement elementPassword = driv.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	WebElement elementClick = driv.findElement(By.className("decorativeSubmit"));
	elementClick.click();
	WebElement elementLogin = driv.findElement(By.tagName("h2"));
	System.out.println(elementLogin.getText());
	WebElement elementCRMSFA = driv.findElement(By.linkText("CRM/SFA"));
	elementCRMSFA.click();
	WebElement elementLeads = driv.findElement(By.linkText("Leads"));
	elementLeads.click();
	WebElement elementCreateLead = driv.findElement(By.linkText("Create Lead"));
	elementCreateLead.click();
	driv.findElement(By.id("createLeadForm_companyName")).sendKeys("Accenture");
	driv.findElement(By.id("createLeadForm_firstName")).sendKeys("Nandhini");
	driv.findElement(By.id("createLeadForm_lastName")).sendKeys("Ravi");
	WebElement elementSourcedd = driv.findElement(By.id("createLeadForm_dataSourceId"));
	Select drop = new Select(elementSourcedd);
	drop.selectByIndex(2);
	WebElement elementIndustrydd = driv.findElement(By.id("createLeadForm_industryEnumId"));
	Select drop2 = new Select(elementIndustrydd);
	drop2.selectByValue("IND_SOFTWARE");
	
}

}
