package rashi.GoogleMail;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;


public class MailTest1 {
  WebDriver driver;
 Mail Obj;
 
  @Test(priority = 0)
  public void Test_gmail_login() {
   Obj.Gmail_Login("rashi_cs_2014@rkgitw.edu.in","Rashi143");
   }
  
  @Test(priority=1)
  public void Test_Compose()
  {
   Obj.Compose();
  }
 
  @Test(priority=2)
  public void Test_DeleteMail()
  {
   Obj.DeleteMail();
  }
  @Test(priority=3)
  public void getNumberOfUnreadEmails() {
	  Obj.getNumberOfUnreadEmails(driver);
	  
  }
  @BeforeClass
  public void testlaunchGmail() {
   
 System.setProperty("webdriver.chrome.driver","C:/rashi/chromedriver/chromedriver.exe");
  driver= new ChromeDriver();
  driver.get("https://mail.google.com"); 
  driver.manage().window().maximize();
 Obj = new Mail(driver);
 

  }
 

  @AfterClass
  public void closeGmail() throws InterruptedException {
   Thread.sleep(10000);

  // driver.quit();
  }

}