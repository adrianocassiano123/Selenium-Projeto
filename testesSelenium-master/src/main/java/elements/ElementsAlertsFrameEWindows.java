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
	
	}
