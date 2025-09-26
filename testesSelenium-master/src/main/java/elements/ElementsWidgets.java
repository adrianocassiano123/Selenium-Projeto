package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsWidgets {

	
	@FindBy(xpath = "//h5[text()='Widgets']")
	protected WebElement cardWidgets;
	
	@FindBy(id = "startStopButton")
    protected WebElement botaoStart; 

    @FindBy(css = "div.progress-bar")
    protected WebElement barraDeProgresso;
	
	
}
