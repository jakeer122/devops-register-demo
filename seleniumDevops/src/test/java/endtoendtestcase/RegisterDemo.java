package endtoendtestcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegisterDemo {

	public WebDriver driver;

	String url ="https://nxtgenaiacademy.com/";
	String expTitle="Demo Site – Registration Form – NxtGen A.I Academy";
	String expFormTite="Register For Demo";
	String firstNameValue="jakeer";
	String lastNameValue="tatipati";
	String genderVaalue="male";
	String addressValue="main road kkd village";
	String aptValue="6-4";
	String cityValue="kurnool";
	String stateValue="andhra pradesh";
	String postalvalue="518422";
	String Countryvalue="India";
	String emailvalue="shaik@gmail.com";
	String dateOfDemoValue="11/10/2022";
	String hhValue ="10";
	String mmValue ="10";
	String mobileNumberValue="9440556522";
	String courseInput="TestNG";
	String courseInput1="Core Java";
	String queryInput="how much cost";
	String verificationCode="99";
	String actSucessCode= "Registration Form is Successfully Submitted";
	String add ="added";

	String qaAutomation="//*[@id=\"menu-item-4131\"]/a";
	String practice="//*[@id=\"menu-item-4157\"]/a/span/text()";
	String demo="//*[@id=\"menu-item-4134\"]/a/span";
	String lastName="vfb-7";
	String gender= "vfb-8-1";
	String streetAddress="vfb-13-address";
	String apt= "vfb-13-address-2";
	String city ="vfb-13-city";
	String state="vfb-13-state";
	String postal="vfb-13-zip";
	String countryDD="vfb-13-country";
	String email= "vfb-14";
	String dateOfDemo= "vfb-18";
	String timeHHDD="vfb-16-hour";
	String timeMMDD="vfb-16-min";
	String mobile ="vfb-19";
	String courseIntrested1="vfb-20-2";
	String courseIntrested2="vfb-20-3";
	String enterYourQuery="vfb-23";
	String twoDigitCode="vfb-3";
	String submitButton ="vfb-4";
	String sucessCode ="//div[@class='elementor-column elementor-col-50 elementor-top-column elementor-element elementor-element-7e205e7c']//div[@class='elementor-widget-container']//div[1]";
	String jak = "jakeer";


	//it will execte on alphabetical order now we change to priority
	
	@Test(priority=1 )
	public void launchApplication() {
		//set the system propertyy and create the object instance to crome driver
		System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		/*if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", ".\\drivers\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ".\\drivers\\geckodriver.exe");
			WebDriver driver =new FirefoxDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", ".\\drivers\\msedgedriver.exe");
			WebDriver driver =new EdgeDriver();
		}*/
		//launch the page 
		driver.get(url);
		//maximize the window 
		driver.manage().window().maximize();
		System.out.println("application launch suceessful");
		System.out.println();

		System.out.println("================================================");
	}

	@Test(priority=2)
	public void navigateRegisterPage() {
		Actions act=new Actions(driver);
		WebElement qaAutomationn=driver.findElement(By.xpath(qaAutomation));
		act.moveToElement(qaAutomationn).perform();
		WebElement practiceAutomation=driver.findElement(By.xpath("//*[@id=\"menu-item-4157\"]/a"));
		act.moveToElement(practiceAutomation).perform();
		WebElement demoSite =driver.findElement(By.xpath("//*[@id=\"menu-item-4134\"]/a/span"));
		act.moveToElement(demoSite).perform();
		demoSite.click();
		System.out.println("page Sucessfully navigate to register page ");
		System.out.println("===================================================");
	}

	@Test(priority=3)
	public void registerUser() {
		//vaidate the Title 
		String actTitle=driver.getTitle();

		if (actTitle.equals(expTitle)) { 
			System.out.println("both titles are same ");
			System.out.println("actual title is =" +actTitle ); } else {
				System.out.println("both titles are not same ");
				System.out.println("excepted title is ="+expTitle );
				System.out.println("actual title is =" +actTitle ); }


		//verify First name text box
		WebElement firstName=driver.findElement(By.id("vfb-5"));
		if(firstName.isDisplayed()) {
			System.out.println("first name text box displayed ");
			firstName.sendKeys(firstNameValue);
			//Thread.sleep(2000);
			System.out.println("first name is :"+firstNameValue);
		}
		else {
			System.out.println("first name text box not dsplayed ");
		}

		//validating the last name text box
		WebElement lastNameTxtBox=driver.findElement(By.id(lastName));
		if (lastNameTxtBox.isDisplayed()) {
			System.out.println("last name text box displayed");
			lastNameTxtBox.sendKeys(lastNameValue);
			//Thread.sleep(2000);
			System.out.println("last name value is :" +lastNameValue);
		}
		else {
			System.out.println("last name check box is naot dissplayesd");
		}

		//verify ,validate gender radio button
		WebElement genderRadiobutton  =driver.findElement(By.id("vfb-8-1"));
		if (genderRadiobutton.isSelected()) {
			System.out.println("radio button is not selected ");
		}
		else {
			genderRadiobutton.click();
			//Thread.sleep(2000);
			System.out.println("male radio button is selected ");
		}

		//verify and validate street adress 
		WebElement streetAddressBox=driver.findElement(By.id(streetAddress));
		if (streetAddressBox.isDisplayed()) {
			System.out.println("street address text box is displayed");
			streetAddressBox.sendKeys(addressValue);
			//Thread.sleep(2000);
			System.out.println("the address is :" + addressValue);
		}
		else {
			System.out.println("street address text box is not displayed ");
		}

		//verify ,validate ,apt number text box 
		WebElement aptBox=driver.findElement(By.id(apt));
		if (aptBox.isDisplayed()) {
			System.out.println("apt box is displayed");
			aptBox.sendKeys(aptValue);
			//Thread.sleep(2000);
			System.out.println("the pat address is : " +aptValue);
		}
		else {
			System.out.println("apt box is not displayed ");
		}

		//verify city text box 
		WebElement cityBox=driver.findElement(By.id(city));
		if (cityBox.isDisplayed()) {
			System.out.println("city text box is displayed ");
			cityBox.sendKeys(cityValue);
			//Thread.sleep(2000);
			System.out.println("the city name is : " +cityValue);
		}
		else {
			System.out.println("city tecx box not displayed ");
		}

		//verify ,validate state text box 
		WebElement stateBox=driver.findElement(By.id(state));
		if (stateBox.isDisplayed()) {
			System.out.println("State text box is displayed");
			stateBox.sendKeys(stateValue);
			//Thread.sleep(2000);
			System.out.println("the state name is :" +stateValue);
		}
		else {
			System.out.println("the state text ox is not displayed ");
		}

		//verify zip code 
		WebElement postalBox=driver.findElement(By.id(postal));
		if (postalBox.isDisplayed()) {
			System.out.println("zip code text box is displayed ");
			postalBox.sendKeys(postalvalue);
			//Thread.sleep(2000);
			System.out.println("the zip code is :" + postalvalue);
		}
		else {
			System.out.println("the zip code text box is not displayed ");
		}

		//verify ,validate country dropdown
		WebElement countryDropDown=driver.findElement(By.id(countryDD));
		if (countryDropDown.isDisplayed()) {
			System.out.println("country drop down is displayed ");
			String visibleText ="India";
			//crete object to select class for drop down
			Select dd =new Select(countryDropDown);
			dd.selectByValue(visibleText);
			//Thread.sleep(2000);
			System.out.println("the value is :" + visibleText);
		}
		else {
			System.out.println("country drop down is not displayed ");
		}

		//verify ,validate email text box
		WebElement emailBox=driver.findElement(By.id(email));
		if (emailBox.isDisplayed()) {
			System.out.println("email text box is displayed ");
			emailBox.sendKeys(emailvalue);
			//Thread.sleep(2000);
			System.out.println("the email is : " +emailvalue );
		}
		else {
			System.out.println("email text box is not displayed ");
		}

		//verify ,validate date of demo text box 
		WebElement dateOfDemoBox=driver.findElement(By.id(dateOfDemo));
		if (dateOfDemoBox.isDisplayed()) {
			System.out.println("date of demo text box is displayed ");
			dateOfDemoBox.sendKeys(dateOfDemoValue);
			//Thread.sleep(2000);
			System.out.println("the date is :" +dateOfDemoValue );
		}
		else {
			System.out.println("the date of demo text box is not displayed ");
		}

		//verify ,validate time ---> HH, MM DROP DOWNS 
		WebElement hhDD=driver.findElement(By.id(timeHHDD));
		if (hhDD.isDisplayed()) {
			System.out.println("hours dropdown is displayed ");
			//create object to hour dropdown 
			String  byValue  ="05";
			Select dd1 =new Select (hhDD);
			dd1.selectByValue(byValue);
			//Thread.sleep(2000);
			System.out.println("the hour value is :" +byValue );
		}
		else {
			System.out.println("the hour dd is not displayed ");
		}

		WebElement mmDD=driver.findElement(By.id(timeMMDD));
		if (mmDD.isDisplayed()) {
			System.out.println("mm dd is displayed ");
			String byMMValue = "15";
			Select dd2 =new Select (mmDD);
			dd2.selectByValue(byMMValue);
			//Thread.sleep(2000);
			System.out.println("the min  value is :" +byMMValue );
		}
		else {
			System.out.println("the min  dd is not displayed ");
		}

		//verify ,validate mobile number 
		WebElement mobleNum =driver.findElement(By.id(mobile));
		if (mobleNum.isDisplayed()) {
			System.out.println("mobie number text box is displayed ");
			mobleNum.sendKeys(mobileNumberValue);
			System.out.println("the mobile number is : " +mobileNumberValue);

		}
		else {
			System.out.println("mobile number is text box is not displayed ");
		}

		//verify course check box 
		WebElement courseBox=driver.findElement(By.id(courseIntrested1));
		if (courseBox.isEnabled()) {
			System.out.println("textng checkbox is enabled");
			courseBox.click();
			System.out.println("text NG checkbox is checked");
		}
		else {
			System.out.println("textng check box is not enabled ");

		}


		WebElement courseBox1=driver.findElement(By.id(courseIntrested2));
		if (courseBox1.isEnabled()) {
			System.out.println("coreJava checkbox is enabled");
			courseBox1.click();
			System.out.println("core java checkbox is checked");
		}
		else {
			System.out.println("Core Java check box is not enabled ");

		}

		//verify and validate 
		WebElement enterYourQueryBox=driver.findElement(By.id(enterYourQuery));
		if (enterYourQueryBox.isDisplayed()) {
			System.out.println("query textBox is displayed ");
			enterYourQueryBox.sendKeys(queryInput);
			System.out.println("tje query is : " +queryInput);
		}
		else {
			System.out.println("the query text box not dislayed ");
		}

		//validate code 
		WebElement code=driver.findElement(By.xpath("//label[normalize-space()='Example: 99']"));

		String codeTxt[] =code.getText().split(":");
		for (String jarr : codeTxt) {
			System.out.println(jarr);
		}
		System.out.println(codeTxt[1]);
		WebElement twoDigitCodeBox=driver.findElement(By.id(twoDigitCode));
		String codeValue =codeTxt[1].trim();
		twoDigitCodeBox.sendKeys(codeValue);
		System.out.println("the code is :" + codeValue);

		//verify ,validate submit button 
		WebElement submitbutton=driver.findElement(By.id(submitButton));
		if(submitbutton.isDisplayed()) {
			System.out.println("submit button is displayed ");
			submitbutton.click();
			System.out.println("submit butto clicked");
		}
		else {
			System.out.println("submit button is not displayed ");
		}
		System.out.println("registered");
		System.out.println("====================================================");
	}

	@Test(priority=4)
	public void validatemsg() {
		WebElement sucess=driver.findElement(By.xpath(sucessCode));
		String ExpSucessCode=sucess.getText();
		if (ExpSucessCode.contains(actSucessCode)) {
			System.out.println("sucess code is validated ");
			String sucesscode[]= sucess.getText().split(":");
			String registerId =sucesscode[1];
			System.out.println("the registration id is :"+ sucesscode[1] );

		}
		else {
			System.out.println("sucess code is not validated ");
		}
		System.out.println("sucess message is sucessfully validated  ");
		System.out.println("=============================================");
	}

	@Test(priority=5)
	public void closeApplication() {
		//close the application
		driver.quit();
		System.out.println("application closed sucessfully");
		System.out.println("==================================================");
	}
}
