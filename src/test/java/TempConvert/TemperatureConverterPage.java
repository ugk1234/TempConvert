package TempConvert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TemperatureConverterPage {
	private WebDriver driver;
    public TemperatureConverterPage(WebDriver driver){
        this.driver = driver;
        System.out.println("in Temp control Page" + driver.getTitle());
        //if (!driver.getTitle().equals("from fahrenheit to celsius - Google Search")){
        //    throw new WrongPageException("Incorrect page for Temperature Conversion page");
        //}
        }

        public void inputFahrenheit(double valueOfFahrenheit){
            String s = Double.toString(valueOfFahrenheit);
            driver.findElement(By.id("inputFahrenheit")).clear();
            driver.findElement(By.id("inputFahrenheit")).sendKeys(s);
            System.out.println("in FH ***" + valueOfFahrenheit);
        }
        
        public String actualResult(){
            driver.findElement(By.id("inputCelsius"));
            
            String valueOfCelsius =  driver.findElement(By.id("inputCelsius")).getAttribute("value");
            System.out.println("in Actual result ****" + valueOfCelsius);
            return valueOfCelsius;
        }
        
        public String expectedResult(){
            return "37.01";
        }
    }
   
