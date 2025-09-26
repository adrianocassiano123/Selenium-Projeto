package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.AlertsFrameEWindowsPage;
import pages.InteractionsPage;
import utils.DriverManager;

public class InteractionsSteps {

	
	private InteractionsPage interactionsPage = new InteractionsPage(DriverManager.getDriver());

    @Dado("que estou no sistema...")
    public void que_estou_no_sistema() {
        
    	interactionsPage.navegarParaPagina();
    	
    }
    
//    E clico na opcao Interactions

    @E("clico na opçao Interactions")
    public void clico_na_opcao_Interactions() {
       
    	interactionsPage.clicarNoMenuInteractions();
    	
    }
//    Quando clico no submenu Sortable
    
    @Quando("clico no submenu Sortable")
    public void clico_no_submenu_Sortable() {
       
    	interactionsPage.clicarNoMenuSortable();
    }
    	
//    Então ordeno os elementos Lista em ordem DECRESCENTE 
    	
    @Então("ordeno os elementos Lista em ordem DECRESCENTE")
    public void ordeno_os_elementos_Lista_em_ordem_DECRESCENTE() {
       
    	interactionsPage.ordenarElementosDecrescenteLista();
    	
    }
    	
//    E ordeno os elementos Lista em ordem CRESCENTE 
    
    @E("ordeno os elementos Lista em ordem CRESCENTE")
    public void ordeno_os_elementos_Lista_em_ordem_CRESCENTE() {
       
    	interactionsPage.ordenarElementosCrescenteLista();
    }
    	
//    Quando clico na aba Grid
    	
    @Quando("clico na aba Grid")
    public void clico_na_aba_Grid() {
       
    	interactionsPage.ClicarAbaGrid();
    
    }
    
    	
//    Então ordeno os elementos Grid em ordem DECRESCENTE 
    	
    @Então("ordeno os elementos Grid em ordem DECRESCENTE")
    public void ordeno_os_elementos_Grid_em_ordem_DECRESCENTE() {
       
    	interactionsPage.ordenarElementosDecrescenteGrid();
    	
    } 
    	
//    E ordeno os elementos em Grid ordem CRESCENTE 

    @E("ordeno os elementos em Grid ordem CRESCENTE")
    public void ordeno_os_elementos_Grid_em_ordem_CRESCENTE(){
        
    	interactionsPage.ordenarElementosCrescenteGrid();
    }

	
}
