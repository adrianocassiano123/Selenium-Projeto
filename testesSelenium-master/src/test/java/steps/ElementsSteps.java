package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.ElementsPage;
import utils.DriverManager;

public class ElementsSteps {
	
	private ElementsPage elementsPage = new ElementsPage(DriverManager.getDriver());

    @Dado("que estou no sistema")
    public void que_estou_no_sistema() {
        
    	elementsPage.navegarParaPagina();
    	
    }

    @E("seleciono o menu Forms")
    public void seleciono_o_menu_Forms() throws Throwable {
       
    	
    }
	

}
