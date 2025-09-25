package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import elements.ElementsForm;
import helpers.ComandosComuns;
import utils.Urls; // Importa a classe Urls

public class FormPage extends ElementsForm {
	private WebDriver driver;
	private ComandosComuns cc;

	public FormPage(WebDriver driver) {
		this.driver = driver;
		this.cc = new ComandosComuns(driver);
		PageFactory.initElements(driver, this);
	}
	// Navega até a página de login.

	public void navegarParaPagina() {
		driver.get(Urls.PAGINA); // Usa a URL da classe Urls
	}

	public void clicarNoMenuForm() {

		cc.clickDOM(botaoForms);
		
	}

	public void clicarNoPraticeForm() {

		cc.clickDOM(praticeForm);
		
	}

	public void preencherNome(String nome_) {

		cc.sendKeys(nome, nome_);

	}
	
	public void preencherSobreNome(String sobrenome) {

		cc.sendKeys(ultimoNome, sobrenome);

	}
	
	public void preencherEmail(String email_) {

		cc.sendKeys(email, email_);

	}
	
	public void selecionarGenero(String gender) {
	    if (gender.equalsIgnoreCase("M")) {
	        cc.click(radioGeneroFeminino);
	    } else if (gender.equalsIgnoreCase("F")) {
	        cc.click(radioGeneroMasculino);
	    } else if (gender.equalsIgnoreCase("O")) {
	        cc.click(radioGeneroOutro);
	    } else {
	        System.out.println("Verifique o sexo");
	    }
	}

	public void preencherCelular(String numCelular) {

	cc.sendKeys(celular, numCelular);
	}
	
	public void preencherDataNascimento(String DtNascimento) {

	cc.sendKeys(dataNascimento, DtNascimento);
	}
	
	public void preencherSubject(String subj) {

		cc.sendKeys(subjects, subj);
	}
	
	
	public void preencherHobby(String hobby) {
	    if (hobby.equalsIgnoreCase("S")) {
	        cc.click(checkHobbyEsportes);
	    } else if (hobby.equalsIgnoreCase("R")) {
	        cc.click(checkHobbyLeitura);
	    } else if (hobby.equalsIgnoreCase("O")) {
	        cc.click(checkHobbyMusica);
	    } else {
	        System.out.println("Verifique o hobby");
	    }
	}
		
	public void escolherUpdate() {

		cc.click(uploadArquivo);
	}
	
	public void preencherEndereço(String end) {

		cc.sendKeys(endereco, end);
	}
	
	public void selecionarCidade(String cid) {
		
		cc.selecionarCombo(comboCidade, cid);
	}
	
	public void selecionarEstado(String est) {
		
		cc.selecionarCombo(comboEstado, est);
	}
	
	public void clicarSubmenter() {

		cc.click(botaoEnviar);
	}
	
	public void clicarFechar() {

		cc.click(botaoClose);
	}
	
	
}