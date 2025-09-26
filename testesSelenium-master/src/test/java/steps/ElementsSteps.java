package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ElementsPage;
import utils.DriverManager;

public class ElementsSteps {
	


	
	private ElementsPage elementsPage = new ElementsPage(DriverManager.getDriver());

    @Dado("que estou no sistema..")
    public void que_estou_no_sistema() {
        
    	elementsPage.navegarParaPagina();
    	
    }

    @E("clico na opcao Elements")
    public void clico_na_opcao_Elements() throws Throwable {
    	
    	elementsPage.clicarNocardElements();       
    	
    }
    
    
    @E("clico no submenu Web Tables")
    public void clico_no_submenu_Web_Tables() throws Throwable {
       
    	elementsPage.clicarNoWebtables();
    }
    
    @E("clico no botão Add")
    public void clico_no_botao_Add() throws Throwable {
       
    	elementsPage.clicarNoBtnAdd();
    }


    @Quando("insiro dados no formulario")
    public void insiro_dados_no_formulario() throws Throwable {
    	
    	elementsPage.preencherAlterarNome("Adriano");
    	elementsPage.preencherAlterarUltimoNome("teste");
    	elementsPage.preencherAlterarEmail("teste@teste.com");
    	elementsPage.preencherAlterarIdade("07");
    	elementsPage.preencherAlterarSalário("9000");
    	elementsPage.preencherAlterarDepartamento("Financeiro");
    	
    }
    
    
         
    @E("clico no botão Submit")
    public void clico_no_botao_Submit() throws Throwable {
    	
    	elementsPage.clicarSubmit();
    	
    }
    

    
    @Então("dados são inseridos")
    public void dados_sao_inseridos() throws Throwable {
    	
    	
    }

    
    @E("clico no botão Alterar")
    public void clico_no_botao_Alterar() throws Throwable {
    	
    	elementsPage.clicarBtnEditar();
    }
 
    
    @E("altero dados do formulario")
    public void altero_dados_do_formulario() throws Throwable {
    	
    	elementsPage.preencherAlterarNome("Cassiano");
    	elementsPage.preencherAlterarUltimoNome("QAteste");
    	elementsPage.preencherAlterarEmail("AAAAAAAA@teste.com");
    	elementsPage.preencherAlterarIdade("09");
    	elementsPage.preencherAlterarSalário("15000");
    	elementsPage.preencherAlterarDepartamento("Jurídico");
    }
    
   
    @Então("dados são alterados")
    public void dados_sao_alterados() throws Throwable {
    	
    	
    }

    
    @Quando("clico no botão excluir")
    public void clico_no_botao_excluir() throws Throwable {
    	
    	elementsPage.clicarBtnDeletar();
    }
 
    
     
        
    @Então("os dados são excluídos")
    public void os_dados_sao_excluidos() throws Throwable {
    	
    	
    }

}
