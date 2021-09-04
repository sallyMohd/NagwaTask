package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class landPage extends PageBase{

	public landPage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath ="/html/body/div/div/main/div[2]/ul/li[1]/a")
		WebElement engLanguage ;
		
		 public void clickOnEnglish() {
				
				engLanguage.click();
}
}