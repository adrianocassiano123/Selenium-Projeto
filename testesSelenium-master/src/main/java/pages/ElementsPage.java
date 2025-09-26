package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elements.ElementsElements;
import helpers.ComandosComuns;
import utils.Urls; // Importa a classe Urls

public class ElementsPage extends ElementsElements {
	
	private WebDriver driver;
	private ComandosComuns cc;

	public ElementsPage(WebDriver driver) {
			this.driver = driver;
			this.cc = new ComandosComuns(driver);
			PageFactory.initElements(driver, this);
		}
	// Navega até a página de login.

	public void navegarParaPagina() {
		driver.get(Urls.PAGINA); // Usa a URL da classe Urls
	}

	public void clicarNocardElements() {

		cc.clickDOM(cardElements);

	}
	
	public void clicarNoWebtables() {

		cc.clickDOM(webTables);

	}
	
	public void clicarNoBtnAdd() {
		cc.click(btnAdd);
	}
	
	public void preencherAlterarNome(String texto) {
		
		cc.sendKeys(inputNome, texto);		
	}
	
	public void preencherAlterarUltimoNome(String texto) {
		
		cc.sendKeys(inputUltimoNome, texto);		
	}
	
	public void preencherAlterarEmail(String texto) {
		
		cc.sendKeys(inputEmail, texto);		
	}
	
	public void preencherAlterarIdade(String texto) {
		
		cc.sendKeys(inputIdade, texto);		
	}
	
	public void preencherAlterarSalário(String texto) {
		
		cc.sendKeys(inputSalario, texto);		
	}
	
	public void preencherAlterarDepartamento(String texto) {
		
		cc.sendKeys(inputDepartmento, texto);		
	}
	
	public void clicarSubmit() {
		
		cc.click(btnSubmit);		
	}
	
	public void clicarBtnEditar() {
		
		cc.clicarComScroll(ultimoBtnEditar);		
	}
	
	public void clicarBtnDeletar() {
		
		cc.clicarEmTodos(btnDeletarList, By.xpath("//span[@title='Delete']"));
			
	}

}
