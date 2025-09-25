package helpers;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class ComandosComuns {
    private WebDriver driver;
    private WebDriverWait wait;

    // Construtor que recebe o driver
    public ComandosComuns(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // Espera padrão de 3 segundos
    }

    // Método para clicar em um elemento
    public void click(WebElement elemento) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
        element.click();
        
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
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Espera padrão de 10 segundos
        WebElement elementoVisivel = wait.until(ExpectedConditions.visibilityOf(element));
        elementoVisivel.clear();
        elementoVisivel.sendKeys(text);
    }
    
   
    // Método para verificar se tem determinado texto na URL
    public void verificarUrlContem(String texto) {
    	this.wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // Espera padrão de 10 segundos
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

	// Método para esperar um tempo fixo (não recomendado, mas útil em alguns casos)
	public void waitFixed(long milliseconds) {
		try {
			Thread.sleep(milliseconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// Método para selecionar valor de combo React
	public void selecionarCombo(WebElement comboContainer, String valor) {
	    // Garante que o container esteja visível
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comboContainer);

	    // Clica no container (div visível do select)
	    click(comboContainer);

	    // Agora pega o input que é renderizado dentro do React-Select
	    WebElement input = comboContainer.findElement(By.tagName("input"));
	    wait.until(ExpectedConditions.elementToBeClickable(input));

	    // Digita o valor e confirma
	    input.sendKeys(valor);
	    input.sendKeys(Keys.ENTER);
	}
	
}
