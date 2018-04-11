package TempConvert.Steps;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import TempConvert.Google;
import TempConvert.TemperatureConverterPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConversionStepDef {
    private WebDriver driver;
    public Google googlePage;
    public TemperatureConverterPage temperatureConverterPage;
    
		@Given("^I want to  convert (\\d+)\\.(\\d+) degree Fahrenheit to Celsius$")
		public void i_want_to_convert_degree_Fahrenheit_to_Celsius(int arg1, int arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			System.setProperty("webdriver.gecko.driver", "C:\\\\Users\\nikita\\Desktop\\Uday\\tools\\selenium\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			//driver.get("http://www.packtpub.com/");
			
			driver.manage().window().maximize();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        googlePage = new Google(driver);
	        temperatureConverterPage = googlePage.goToTemperatureConversionPage();
			
		}

		@When("^I input the value of Fahrenheit as (\\d+)\\.(\\d+) in text field$")
		public void i_input_the_value_of_Fahrenheit_as_in_text_field(int arg1, int arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			temperatureConverterPage.inputFahrenheit(98);
		}

		@Then("^It should be converted to Celsius as (\\d+) degree$")
		public void it_should_be_converted_to_Celsius_as_degree(int arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
	        assertEquals(temperatureConverterPage.actualResult(), temperatureConverterPage.expectedResult());
	        //driver.quit();
	
		}
}
