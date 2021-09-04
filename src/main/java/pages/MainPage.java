package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends PageBase{

	public MainPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath ="/html/body/header/div[1]/div/div[3]/button")
	WebElement searchbtn ;
	
	@FindBy(xpath ="/html/body/header/div[1]/div/div[3]/form/label/input")
	WebElement addsearch ;
	
	@FindBy(xpath ="/html/body/header/div[1]/div/div[3]/form/button")
	WebElement submitsearch ;
	 public void Search() {
			
			searchbtn.click();
			addsearch.sendKeys("addition");
			submitsearch.click();
}
}
