package tests;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pages.MainPage;
import pages.landPage;
import pages.lessonPage;
import pages.searchResults;
import pages.workSheetPage;

public class countNumberofQuestions extends TestBase {
	landPage landobject;
	MainPage mainobject;
	searchResults searchobject;
	lessonPage lessonobject;
	workSheetPage workobject;

	@Test
	public void count()
	{

		landobject = new landPage(driver);
		landobject.clickOnEnglish();
		
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		mainobject = new MainPage(driver);
		mainobject.Search();
		
		searchobject = new searchResults(driver);
		searchobject.clickResult();
		
		lessonobject = new lessonPage(driver);
		lessonobject.openWorkSheet();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		workobject = new workSheetPage(driver);
		workobject.countQuestions();
	}
}