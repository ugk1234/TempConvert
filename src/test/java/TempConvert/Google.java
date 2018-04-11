package TempConvert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Google {
    private WebDriver driver;
    private String baseURL;
    
	  public Google(WebDriver driver){
	        this.driver = driver;
	        //baseURL = "www.google.com/search?source=hp&ei=KKbNWsbYHMjUvATq1LXABg&q=temperature+conversion&oq=temprate+conv&gs_l=psy-ab.3.0.0i13k1l10.53144.59196.0.61042.13.12.0.1.1.0.220.1618.0j8j2.10.0....0...1c.1.64.psy-ab..2.11.1632...0j0i131k1j0i10k1.0.UZ1nEbr5CNU";
	        driver.get("https://www.w3schools.com/howto/howto_js_temperature_converter.asp"); //+ "?gws_rd=cr,ssl&ei=qZlNVpOUMNCauQS0iYmoCA&fg=1");
	        System.out.println("in google" + driver.getTitle());
	        if (!driver.getTitle().equals("How To Create a Temperature Converter With HTML and JavaScript")){
	            //throw new WrongPageException("Incorrect page for Google Home page");
	        }}
	  
	
		  
	        public TemperatureConverterPage goToTemperatureConversionPage(){
	            driver.findElement(By.id("inputFahrenheit")).clear();
	            //driver.findElement(By.id("lst-ib")).sendKeys("from fahrenheit to celsius");
	            //river.findElement(By.name("btnG")).click();
	            //WebDriverWait wait = new WebDriverWait(driver, 10);
	            //wait.until(ExpectedConditions.presenceOfElementLocated(By.id("resultStats")));
	            return new TemperatureConverterPage(driver);
	
}
}