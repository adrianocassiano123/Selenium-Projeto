package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsAlertsFrameEWindows {
	
	
	@FindBy(xpath = "//h5[text()='Alerts, Frame & Windows']")
	protected WebElement cardAlertsFrameWindows;
	
	@FindBy(xpath = "//span[text()='Browser Windows']")
	protected WebElement btnBrowserWindows;
	
	@FindBy(id = "windowButton")
	protected WebElement btnNewWindow;
	
	@FindBy(id = "sampleHeading")
	protected WebElement txtSamplePage;
	
	
	
	
	
	
	//////////////////////////////////////////////////////////////////////////////
	
	// Elements
	@FindBy(xpath = "//h5[text()='Elements']")
	protected WebElement cardElements;

	// Forms
	@FindBy(xpath = "//h5[text()='Forms']")
	protected WebElement cardForms;

	

	// Widgets
	@FindBy(xpath = "//h5[text()='Widgets']")
	protected WebElement cardWidgets;

	// Interactions
	@FindBy(xpath = "//h5[text()='Interactions']")
	protected WebElement cardInteractions;

	// Book Store Application
	@FindBy(xpath = "//h5[text()='Book Store Application']")
	protected WebElement cardBookStore;

}
