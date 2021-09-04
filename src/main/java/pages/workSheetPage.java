package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

public class workSheetPage extends PageBase {

	public workSheetPage(WebDriver driver) {
		super(driver);
		
	}
	@FindBys(@FindBy(className = "instance"))
	List<WebElement> countquest ;
	
	 public void countQuestions() {
		System.out.println(countquest.size());
		
 
		 
			
}

	
}