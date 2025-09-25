package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.FormPage;
import utils.DriverManager;

public class FormsSteps {

	private FormPage formPage = new FormPage(DriverManager.getDriver());

    @Dado("que estou no sistema")
    public void que_estou_no_sistema() {
        
    	formPage.navegarParaPagina();
    	
    }

    @E("seleciono o menu Forms")
    public void seleciono_o_menu_Forms() throws Throwable {
       
    	formPage.clicarNoMenuForm();
    }

    @E("seleciono o submenu Practice Form")
    public void seleciono_o_submenu_Practice_Form() throws Throwable {
        formPage.clicarNoPraticeForm();
    }

    @Quando("preencho o formulario")
    public void preencho_o_formulario() {
    	
    	formPage.preencherNome("Accenture");
    	formPage.preencherSobreNome("Silva");
    	formPage.preencherEmail("teste@accenture.com");
    	formPage.selecionarGenero("M");
    	formPage.preencherCelular("810000000");
    	//formPage.preencherDataNascimento(null);
    	formPage.preencherSubject("testesssssssssssssssssssssss");
    	formPage.preencherHobby("S");
    	formPage.preencherEndereço("Rua de testes");
    	formPage.selecionarEstado("utt");
    	formPage.selecionarCidade("merr");
    	
        
    	
    }
    
    @E("envio o formulario")
    public void envio_o_formulario() {
        
    	formPage.clicarSubmenter();
    	
    }
    
    @Então("sistema exibe mensagem \"Thanks for submitting the form\"")
    public void sistema_exibe_mensagem() {
    	
    	formPage.clicarFechar();
       
    	
    }
    
}