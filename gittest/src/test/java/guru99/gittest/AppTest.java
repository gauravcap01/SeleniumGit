package guru99.gittest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
 
public class AppTest {
 
 public WebDriver driver;
 
  @Test
  public void openMyBlog() {
 driver.get("https://www.softwaretestingmaterial.com/");
  }
  
  @BeforeClass
  public void beforeClass() {
   
   System.setProperty("webdriver.gecko.driver", "C:\\Users\\gaura\\eclipse-workspace\\gittest\\drivers\\geckodriver-v0.21.0-win64\\geckodriver.exe");
   driver = new FirefoxDriver();
   
  }
 
  @AfterClass
  public void afterClass() {
   
	  //driver.quit();
  }
 
}