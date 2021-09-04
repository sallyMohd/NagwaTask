package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class searchResults extends PageBase {

	public searchResults(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="/html/body/div/div[1]/div/div/main/div[3]/ul/li[2]/div/a")
	WebElement clickresult ;
	
	 public void clickResult() {
			
			clickresult.click();
}
}