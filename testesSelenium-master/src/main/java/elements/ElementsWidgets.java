package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsWidgets {
	
	@FindBy(xpath = "//h5[text()='Widgets']")
	protected WebElement cardWidgets;
	
	@FindBy(xpath = "//span[text()='Progress Bar']")
	protected WebElement menuProgressBar;
	
	@FindBy(id = "startStopButton")
    protected WebElement botaoStartStop;
	
    @FindBy(css = "div.progress-bar")
    protected WebElement barraDeProgresso;
	
    @FindBy(id = "resetButton")
    protected WebElement botaoReset;
	
}
