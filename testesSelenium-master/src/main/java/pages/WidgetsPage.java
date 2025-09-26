package pages;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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

	public void clicarNoSubMenuProgressBar() {

		cc.clickDOM(menuProgressBar);

	}

	public void clicarNoBotaoStart() {

		cc.click(botaoStartStop);

	}

	public void pararAntes(int percentual) {

		Random random = new Random();
		int valorParada = random.nextInt(percentual); // valor aleatório menor que o parâmetro

		clicarNoBotaoStart(); // inicia a barra

		while (true) {
			int valorAtual = Integer.parseInt(barraDeProgresso.getAttribute("aria-valuenow"));

			if (valorAtual >= valorParada) {
				clicarNoBotaoStart();
				break;
			}

			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public void validarPercentual(int percentual) {

		int valorAtual = Integer.parseInt(barraDeProgresso.getAttribute("aria-valuenow"));

		if (valorAtual >= percentual) {
			throw new AssertionError("Erro: valor da barra " + valorAtual
					+ "% é maior ou igual ao percentual máximo permitido " + percentual + "%");
		}

		System.out.println("Validação OK: valor da barra " + valorAtual + "% está abaixo de " + percentual + "%");
	}

	public void validarCem() {
		int valorAtual;

		// Espera a barra chegar a 100%
		while (true) {
			valorAtual = Integer.parseInt(barraDeProgresso.getAttribute("aria-valuenow"));
			if (valorAtual >= 100) {
				break;
			}

			try {
				Thread.sleep(50); // espera a barra atualizar
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		// Validação usando assert
		if (valorAtual != 100) {
			throw new AssertionError("Erro: a barra não chegou a 100%, valor atual: " + valorAtual + "%");
		}

		System.out.println("Validação OK: barra chegou a 100%");
	}

	public void resetarBarra() {
		clicarNoBotaoStart(); // clica para parar/reiniciar a barra
		System.out.println("Botão clicado para resetar a barra.");
	}
	
	
	public void validarReset() {
	    int valorDepoisDoReset = Integer.parseInt(barraDeProgresso.getAttribute("aria-valuenow"));

	    if (valorDepoisDoReset != 0) {
	        throw new AssertionError(
	            "Erro: a barra não resetou, valor atual: " + valorDepoisDoReset + "%"
	        );
	    }

	    System.out.println("Reset OK: barra voltou para " + valorDepoisDoReset + "%");
	}

}
