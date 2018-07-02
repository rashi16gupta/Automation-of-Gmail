package rashi.GoogleMail;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mail {
WebDriver driver;

public WebElement getUsername()
{
 return this.driver.findElement(By.id("identifierId"));
}
 public WebElement getPassword()
 {
 return this.driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input"));
 }
 
 public void Compose()
 {
  driver.findElement(By.cssSelector("#\3a gg > div > div")).click();
  
  driver.findElement(By.cssSelector("#\3a rf")).sendKeys("csrashi143@gmail.com");
  driver.findElement(By.cssSelector("#\3a qx")).sendKeys("to verify the testautomation");
  driver.findElement(By.cssSelector("#\3a s0")).sendKeys("please verify that code is working or not");
  driver.findElement(By.cssSelector("#\3a qn")).click();

  
 }
 
 public void DeleteMail()
 {
  driver.findElement(By.cssSelector("#\3a gs > div > div.aio.UKr6le > span > a")).click();
  driver.findElement(By.cssSelector("#\\3a aj > span")).click();
  driver.findElement(By.cssSelector("#\\3a 5 > div.G-atb.D.E.aCh > div.iH.bzn > div > div:nth-child(2) > div.T-I.J-J5-Ji.nX.T-I-ax7.T-I-Js-Gs.W6eDmd > div > div")).click();
 }
 

public void Gmail_Login(String Username, String Password)
{
getUsername().clear();
getUsername().sendKeys(Username);
driver.findElement(By.id("identifierNext")).click();
driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
//getPassword().clear();
getPassword().sendKeys(Password);
driver.findElement(By.id("passwordNext")).click();

}

public void getNumberOfUnreadEmails(WebDriver driver) {
	String attrValue = driver.findElement(
			By.cssSelector("#\3a 4")).getAttribute("class");
	String unreadMessageValue = attrValue.substring(0, 8);
	System.out.println(unreadMessageValue);
//driver.findElement(By.cssSelector("#passwordNext > div.ZFr60d.CeoRYc")).click(); //next button

//driver.findElement(By.cssSelector("#passwordNext > div.ZFr60d.CeoRYc")).click();

//driver.findElement(By.xpath("//*[@id='passwordNext']/div[1]")).click();


{
WebElement table = driver.findElement(By.className("yW"));
List<WebElement> mail = table.findElements(By.tagName("tr"));

for (WebElement row : rows) {
	String classType = row.getAttribute("class");
	if (classType.equals("zA yO")) {
		row.click();
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		driver.findElement(By.xpath("#\3a 4m > td.yX.xY")).click();
		break;
	} 
	else if (classType.equals("zA zE")) {
		continue;
	}
}}
}
 public Mail(WebDriver driver)
 {
  this.driver= driver;
} 
}



