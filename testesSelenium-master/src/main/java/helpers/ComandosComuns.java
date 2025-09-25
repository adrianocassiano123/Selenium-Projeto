package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;

import java.time.Duration;
import java.util.Set;

public class ComandosComuns {
	private WebDriver driver;
	private WebDriverWait wait;

	// Construtor que recebe o driver
	public ComandosComuns(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(0)); // Espera padrão de 3 segundos
	}

	// Método para clicar em um elemento
	public void click(WebElement elemento) {
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		element.click();

	}
	
	public void clicarComScroll(WebElement element) {
        try {
            // Rolando até o elemento
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

            // Aguarda o elemento estar clicável
            WebElement clickable = wait.until(ExpectedConditions.elementToBeClickable(element));

            // Tenta clicar normalmente
            clickable.click();

        } catch (ElementClickInterceptedException e) {
            // Se o clique for interceptado (ex: propaganda), força clique via JS
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
        }
    }

	// Método para clicar em um elemento visível e presente no DOM
	public void clickDOM(WebElement elemento) {

		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));

		// Scroll até o elemento, caso esteja fora da tela
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);

		element.click();
	}

	// Método para preencher um campo de texto
	public void sendKeys(WebElement element, String text) {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(2)); // Espera padrão de 2 segundos
		WebElement elementoVisivel = wait.until(ExpectedConditions.visibilityOf(element));
		elementoVisivel.clear();
		elementoVisivel.sendKeys(text);
	}

	// Método para verificar se tem determinado texto na URL
	public void verificarUrlContem(String texto) {
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(0)); // Espera padrão de 2 segundos
		String urlAtual = driver.getCurrentUrl();
		if (!urlAtual.contains(texto)) {
			throw new RuntimeException("A URL atual não contém o texto: " + texto);
		}
	}

	public boolean verificarUrlContemSemException(String texto) {
		String urlAtual = driver.getCurrentUrl();
		return urlAtual.contains(texto);
	}

	// Método para verificar se um elemento está visível
	public boolean isElementVisible(By locator) {
		try {
			return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)) != null;
		} catch (Exception e) {
			return false;
		}
	}

	// Método para obter o texto de um elemento
	public String getText(By locator) {
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
		return element.getText();
	}

	// Método para navegar para uma URL
	public void navigateTo(String url) {
		driver.get(url);
	}

	// Método para esperar um tempo fixo
	public void waitFixed(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Método para selecionar valor em combo React-Select (DemoQA)
	public void selecionarCombo(WebElement inputCombo, String valor) {
		try {
			// Garante que o input esteja visível
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputCombo);

			wait.until(ExpectedConditions.elementToBeClickable(inputCombo));

			// Digita o valor e confirma
			inputCombo.sendKeys(valor);
			inputCombo.sendKeys(Keys.ENTER);

			System.out.println("Valor selecionado no combo: " + valor);

		} catch (Exception e) {
			System.out.println("Erro ao selecionar valor no combo: " + e.getMessage());
		}
	}

	// Upload de arquivo
	public void uploadArquivo(WebElement inputUpload, String caminhoArquivo) {
		try {
			// Garante que o elemento esteja visível
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", inputUpload);

			// Envia o caminho absoluto do arquivo para o input[type="file"]
			inputUpload.sendKeys(caminhoArquivo);

			System.out.println("Arquivo anexado com sucesso: " + caminhoArquivo);
		} catch (Exception e) {
			System.out.println("Falha ao anexar o arquivo: " + e.getMessage());
		}
	}

	// Selecionar Data
	public void selecionarData(WebElement inputData, String dia, String mes, String ano) {
		try {
			// Abre o calendário clicando no input
			wait.until(ExpectedConditions.elementToBeClickable(inputData)).click();

			// Seleciona o mês
			WebElement selectMes = driver.findElement(By.className("react-datepicker__month-select"));
			new Select(selectMes).selectByVisibleText(mes);

			// Seleciona o ano
			WebElement selectAno = driver.findElement(By.className("react-datepicker__year-select"));
			new Select(selectAno).selectByVisibleText(ano);

			// Ajusta o dia (zero à esquerda se necessário)
			String diaFormatado = dia.length() == 1 ? "0" + dia : dia;

			// Localiza o dia no calendário
			WebElement diaElemento = driver.findElement(By.xpath(
					"//div[contains(@class,'react-datepicker__day') and not(contains(@class,'outside-month')) and text()='"
							+ diaFormatado + "']"));

			wait.until(ExpectedConditions.elementToBeClickable(diaElemento)).click();

			System.out.println("Data selecionada: " + diaFormatado + "/" + mes + "/" + ano);

		} catch (Exception e) {
			System.out.println("Erro ao selecionar data: " + e.getMessage());
		}
	}
	
	
	public void validarMensagem(WebElement elemento, String textoEsperado) {
        wait.until(ExpectedConditions.visibilityOf(elemento));
        assertEquals(textoEsperado, elemento.getText());
    }

	
	// Troca o foco para a última aba aberta
	public void trocarParaNovaAba() {
	    String janelaPrincipal = driver.getWindowHandle();
	    Set<String> todasJanelas = driver.getWindowHandles();

	    for (String janela : todasJanelas) {
	        if (!janela.equals(janelaPrincipal)) {
	            driver.switchTo().window(janela);
	            break; // já achou a nova aba
	        }
	    }
	}
	
	
	// Fecha a aba atual e volta para a principal
	public void fecharAbaAtualEVolarParaPrincipal() {
	    String janelaPrincipal = driver.getWindowHandles().iterator().next(); // primeira janela aberta
	    driver.close(); // fecha a aba atual
	    driver.switchTo().window(janelaPrincipal); // volta para a principal
	
}
	
}
