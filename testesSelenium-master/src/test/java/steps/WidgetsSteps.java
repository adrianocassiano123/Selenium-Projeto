package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import pages.WidgetsPage;
import utils.DriverManager;

public class WidgetsSteps {

	private WidgetsPage widgetsPage = new WidgetsPage(DriverManager.getDriver());

	@Dado("que estou no sistema")
	public void que_estou_no_sistema() {

		widgetsPage.navegarParaPagina();

	}
	
	
	@E("clico na opçao Widgets")
	public void clico_na_opçao_Widgets() {

		

	}

	@E("clico no submenu Progress Bar")
	public void clico_no_submenu_Progress_Bar() {

		
	}



	@Quando("inicio progresso parando antes de 25 porcento")
	public void paro_antes_de_25_porcento() {

		

	}
	
	@Então("valido que valor da progress Bar é menor ou igual a 25 por cento")
	public void valido_que_valor_da_progress_Bar_e_menor_ou_igual_a_25_por_cento() {

		

	}
	
	@Quando("clico novamente no botão start")
	public void clico_novamente_no_botao_start() {

		

	}
	
	@Então("ao chegar em 100 por cento clico no botão resetar")
	public void ao_chegar_em_100_por_cento_clico_no_botao_resetar() {

		

	}
	
	

}
