package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class lessonPage extends PageBase {

	public lessonPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBy(xpath ="/html/body/div/div[1]/div/div/aside/div[1]/ul/li[7]/div/a")
	WebElement wsbtn ;
	 public void openWorkSheet() {
			
			wsbtn.click();
}
}