package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elements.ElementsAlertsFrameEWindows;
import helpers.ComandosComuns;
import utils.Urls; // Importa a classe Urls

public class AlertsFrameEWindowsPage extends ElementsAlertsFrameEWindows {
	private WebDriver driver;
	private ComandosComuns cc;

	public AlertsFrameEWindowsPage(WebDriver driver) {
		this.driver = driver;
		this.cc = new ComandosComuns(driver);
		PageFactory.initElements(driver, this);
	}
	// Navega até a página de login.

	public void navegarParaPagina() {
		driver.get(Urls.PAGINA); // Usa a URL da classe Urls
	}
	
	public void clicarNoAlertsFrameWindows() {

		cc.clickDOM(cardAlertsFrameWindows);

	}
	
	public void clicarNoBtnBrowserWindows() {

		cc.clickDOM(btnBrowserWindows);

	}
	
	public void clicarNoBtnNewWindow() {

		cc.clickDOM(btnNewWindow);

	}
	
	public void validarMensagem(String mensagem) {

		cc.trocarParaNovaAba();
		cc.validarMensagem(txtSamplePage, mensagem);

	}
	
	public void fecharAba() {

		cc.fecharAbaAtualEVolarParaPrincipal();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
