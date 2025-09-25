package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.AlertsFrameEWindowsPage;
import utils.DriverManager;

public class AlertsFrameEWindowsSteps {
	
	private AlertsFrameEWindowsPage alertsFramePage = new AlertsFrameEWindowsPage(DriverManager.getDriver());

    @Dado("que estou no sistema.")
    public void que_estou_no_sistema() {
        
    	alertsFramePage.navegarParaPagina();
    	
    }

    @E("clico no menu Alerts Frame e Windows")
    public void clico_no_menu_Alerts_Frame_e_Windows() {
       
    	alertsFramePage.clicarNoAlertsFrameWindows();
    }

    @E("clico no submenu Browser Windows")
    public void clico_no_submenu_Browser_Windows(){
        
    	alertsFramePage.clicarNoBtnBrowserWindows();
    }

    @Quando("clico no botao new Window")
    public void clico_no_botao_new_Window() {
    	
    	alertsFramePage.clicarNoBtnNewWindow();
        
    	
    }
    
        	
    
    @Então("valido mensagem na nova janela")
    public void sistema_exibe_mensagem() {
    	
    	alertsFramePage.validarMensagem("This is a sample page");
    	
    }
    	
    
    @E("fecho a nova Janela")
    public void envio_o_formulario() {
    	
    	alertsFramePage.fecharAba();
    	}
    	
}
