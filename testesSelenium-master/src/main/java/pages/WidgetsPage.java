package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elements.ElementsForm;
import elements.ElementsWidgets;
import helpers.ComandosComuns;
import utils.Urls; // Importa a classe Urls

public class WidgetsPage extends ElementsWidgets {
	private WebDriver driver;
	private ComandosComuns cc;

	public WidgetsPage(WebDriver driver) {
			this.driver = driver;
			this.cc = new ComandosComuns(driver);
			PageFactory.initElements(driver, this);
		}
	// Navega até a página de login.

	public void navegarParaPagina() {
		driver.get(Urls.PAGINA); // Usa a URL da classe Urls
	}

	public void clicarNoCardWidgets() {

		cc.clickDOM(cardWidgets);

	}

}
