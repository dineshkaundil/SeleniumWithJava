package seleniumeasyAppScripting;

import java.util.concurrent.TimeUnit;

import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumeasyAppScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.seleniumeasy.com/test/");
		driver.findElement(By.id("btn_basic_example")).click();
		//driver.findElement(By.xpath[".//*[@id='basic']/div/a[1][contains(text(),'Simple Form')]").click();
		 
		
	//To get text from paragraph <p>
	 //Option 1:
		//String gtext=  driver.findElement(By.xpath("//h3/span[contains(text(),'Basic')]/../../p[1]")).getText();
  	 //Option 2:
		String gtext=  driver.findElement(By.xpath("//h3/span[contains(text(),'Basic')]/../../p[1]")).getAttribute("textContent");
		System.out.println(gtext);
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		//driver.findElement(By.xpath("//div[@class='list-group']/a[text()='Simple Form Demo'  and @class='list-group-item']")).click();
			
		WebDriverWait wait1 = new WebDriverWait(driver, 10);
		By linkid=By.xpath("//div[@class='list-group']/a[text()='Simple Form Demo'  and @class='list-group-item']");
		WebElement element = wait1.until(ExpectedConditions.elementToBeClickable(linkid)) ;
		element.click();
		
	// Basic First Form Demo.html 
	//--------------------------------------
		WebDriverWait wait2 = new WebDriverWait(driver, 10);
		By usermessage=By.xpath(".//*[@id='user-message' and @class='form-control']");
		WebElement element1=wait2.until(ExpectedConditions.elementToBeClickable(usermessage));
		element1.click();
		element1.sendKeys("Hello I am testing here.");
		
		//Reusing 'usermessage' By type variable
		usermessage=By.xpath(".//*[@id='get-input']/button[@class='btn btn-default']");
		driver.findElement(usermessage).click();
		
		
		//driver.findElement(By.xpath(".//*[@id='user-message' and @class='form-control']")).click();
		//driver.findElement(By.xpath(".//*[@id='user-message' and @class='form-control']")).sendKeys("Hello I am testing");
		//driver.findElement(By.xpath(".//*[@id='get-input']/button[@class='btn btn-default']")).click();
		
		By getText=By.xpath(".//*[@id='display']");
		String message=driver.findElement(getText).getText();
		System.out.println(message);
		
		WebDriverWait elWaitValue1=new WebDriverWait(driver,10);
		By value1=By.xpath(".//*[@id='sum1']");
		By value2=By.xpath(".//*[@id='sum2']");
		//WebELement elementValue1=elWaitValue1.until(ExpectedConditions.elementToBeClickable(value1));
		WebElement elementValue1=elWaitValue1.until(ExpectedConditions.elementToBeClickable(value1));
		WebElement elementValue2=elWaitValue1.until(ExpectedConditions.elementToBeClickable(value2));
		
		Integer iValue1=50;
		Integer iValue2=45;
		
		elementValue1.sendKeys(String.valueOf(iValue1));
		elementValue2.sendKeys(String.valueOf(iValue2));
		usermessage=By.xpath(".//*[@id='gettotal']/button");
		
		driver.findElement(usermessage).click();
		getText=By.xpath(".//*[@id='displayvalue']");
		message=driver.findElement(getText).getText();
		System.out.println(message);
		
		//driver.navigate().refresh();
		

		try{
			Thread.sleep(1000);
			}catch (InterruptedException ex){};

			//Checkbox
			//usermessage=By.xpath(".//*[@class='tree-branch' and @style='display: list-item;'][1]/*/li[2]/a[contains(text(),'Checkbox')]");
				
				driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'Input Forms')]")).click();
				
				usermessage=By.xpath("//ul[@class='dropdown-menu']/li/a[contains(text(),'Checkbox Demo')]");
				driver.findElement(usermessage).click();
				
				driver.findElement(By.id("isAgeSelected")).click();
				message=driver.findElement(By.id("txtAge")).getText();
				System.out.println(message);
				
				
				driver.findElement(By.id("check1")).click();
				message=driver.findElement(By.id("check1")).getAttribute("value");
				
				if (message.equals("Uncheck All"))
				{
					System.out.println(message);
				}
				else
				{
					System.out.println(message + " Incorrect");
				}
				

				
				driver.findElement(By.xpath("//div[2]/label")).click();
				driver.findElement(By.xpath("//div[3]/label")).click();
				message=driver.findElement(By.id("check1")).getAttribute("value");
				
				if (message.equals("Check All"))
				
					System.out.println("Pass got: " + message);
				else
					System.out.println("Failed to get "+ message);
				
				
				try{
					Thread.sleep(3000);
					}catch (InterruptedException ex){};
					
				
				
		//Radio Button
					driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'Input Forms')]")).click();
					
					usermessage=By.xpath("//ul[@class='dropdown-menu']/li/a[contains(text(),'Radio Buttons')]");
					driver.findElement(usermessage).click();
					
					driver.findElement(By.xpath("//div[1]/div/label/input[@value='Female']")).click();
					driver.findElement(By.xpath("//button[@id='buttoncheck']")).click();
					
					message=driver.findElement(By.className("radiobutton")).getText();
					
						
					System.out.println("Message: "+ message);
					
					
					driver.findElement(By.xpath("//div[2]/div/label/input[@value='Male']")).click();
					driver.findElement(By.xpath("//div/label/input[@value='5 - 15']")).click();
					driver.findElement(By.xpath("//div/button[@class='btn btn-default']")).click();
					message=driver.findElement(By.className("groupradiobutton")).getText();
					
					System.out.println("Message: "+ message);
					
					
		//Drop Down- List
					driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'Input Forms')]")).click();
					
					usermessage=By.xpath("//ul[@class='dropdown-menu']/li/a[contains(text(),'Select Dropdown')]");
					driver.findElement(usermessage).click();
					
					Select oSelectList=new Select(driver.findElement(By.id("select-demo"))); 
					oSelectList.selectByValue("Tuesday");
					message=driver.findElement(By.className("selected-value")).getText();
					System.out.println(message);
					
					
					Select oSelectList2=new Select(driver.findElement(By.id("multi-select")));
					oSelectList2.selectByVisibleText("New York");
					oSelectList2.selectByVisibleText("California");
					oSelectList2.selectByVisibleText("Florida");
					
				 
					driver.findElement(By.xpath("//button[@id='printMe']")).click();
					message=driver.findElement(By.className("getall-selected")).getText();
					System.out.println(message);
					//p[@class='getall-selected']
					driver.findElement(By.xpath("//button[@id='printAll']")).click();
					message=driver.findElement(By.className("getall-selected")).getText();
					System.out.println(message);
					
					oSelectList2.deselectAll();
					
					
		//Input Form
					driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'Input Forms')]")).click();
					usermessage=By.xpath("//ul[@class='dropdown-menu']/li/a[contains(text(),'Input Form')]");
					driver.findElement(usermessage).click();
					driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
					
					Integer count = driver.findElements(By.xpath("//div/small[@data-bv-result='INVALID']")).size();
					
					if (count==9) 
						System.out.println("Number of Error:" + count);
					else
						System.out.println("Invalid number of Error Messages");
					
					driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("Dinesh");
					driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("TestLast");
					driver.findElement(By.xpath("//input[@name='email']")).sendKeys("dineshtest@mail.com");
					driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
					//driver.findElement(By.xpath("//input[@name='address']")).sendKeys("House No. 111");
					driver.findElement(By.xpath("//input[@name='address']")).sendKeys("Hou");
					driver.findElement(By.xpath("//input[@name='city']")).sendKeys("TestCity");
					//Select oSelectList=new Select(driver.findElement(By.xpath("//option[contains(text(),'Montana')]"))); 
					driver.findElement(By.xpath("//option[contains(text(),'Montana')]")).click();
					//driver.findElement(By.xpath("//input[@name='state']")).sendKeys("TestState");
					//driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("23422");
					driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.travel.com");
					driver.findElement(By.xpath("//input[@name='hosting' and @value='yes']")).click();
					String LongText="Hey I have filled the given form.";
					driver.findElement(By.xpath("//textarea[@name='comment']")).sendKeys(LongText);
					
					try{
						Thread.sleep(1000);
						}catch (InterruptedException ex){};
					
					if (driver.findElement(By.xpath("//button[@class='btn btn-default']")).isEnabled())
					{
					driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
					}
					else
					{
						
						for (int i=0; i< driver.findElements(By.xpath("//div/small[@data-bv-result='INVALID']")).size();  i++)
						{
							String result=driver.findElements(By.xpath("//div/small[@data-bv-result='INVALID']")).get(i).getText();
							System.out.println("ERROR: " + result);
						}
						
						driver.findElement(By.xpath("//input[@name='address']")).sendKeys("House No. 111");
						driver.findElement(By.xpath("//input[@name='zip']")).sendKeys("23422");
						driver.findElement(By.xpath("//button[@class='btn btn-default']")).click();
					}
					
		//Ajax Form
					driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li/a[contains(text(),'Input Forms')]")).click();
					usermessage=By.xpath("//ul[@class='dropdown-menu']/li/a[contains(text(),'Ajax Form')]");
					driver.findElement(usermessage).click();
					driver.findElement(By.id("title")).sendKeys("Testing Text");
					driver.findElement(By.id("description")).sendKeys("Hello there, I am entering text here");

					driver.findElement(By.id("btn-submit")).click();
					String getResult=driver.findElement(By.id("submit-control")).getText();
					System.out.println(getResult);
					try{
						Thread.sleep(2000);
						}catch (InterruptedException ex){};
					
					getResult=driver.findElement(By.id("submit-control")).getText();
					System.out.println(getResult);
		
//Table Validation
		 
			driver.navigate().to("http://toolsqa.com/automation-practice-table");
				String sloc="Taiwan";
				
				for (int i=1;i<=4;i++)
				{
					String sValue=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[1]")).getText();
					
					
					if (sValue.equalsIgnoreCase(sloc))
						System.out.println("Hey I found: " + sloc);
					else
						System.out.println(sValue);
					
				}
		
			try{
				Thread.sleep(5000);
				}catch (InterruptedException ex){};
			
		
				
		driver.quit();
	}

}
