package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import elements.ElementsInteractions;
import helpers.ComandosComuns;
import utils.Urls; // Importa a classe Urls

public class InteractionsPage extends ElementsInteractions {
	private WebDriver driver;
	private ComandosComuns cc;

	public InteractionsPage(WebDriver driver) {
		this.driver = driver;
		this.cc = new ComandosComuns(driver);
		PageFactory.initElements(driver, this);
	}

	public void navegarParaPagina() {
		driver.get(Urls.PAGINA); // Usa a URL da classe Urls
	}

	public void clicarNoMenuInteractions() {

		cc.clickDOM(cardInteractions);

	}

	public void clicarNoMenuSortable() {

		cc.clickDOM(menuSortable);

	}

	public void ordenarElementosLista(String ordem) {
		Actions actions = new Actions(driver);

		// Define a ordem desejada dependendo do parâmetro
		WebElement[] elementosDesejados;

		if (ordem.equalsIgnoreCase("decrescente")) {
			elementosDesejados = new WebElement[] { itemSixList, itemFiveList, itemFourList, itemThreeList, itemTwoList,
					itemOneList };
		} else {

			elementosDesejados = new WebElement[] { itemOneList, itemTwoList, itemThreeList, itemFourList, itemFiveList,
					itemSixList };
		}

		// Clica na aba List
		cc.clickDOM(abaList);
		cc.esperarEmSegundos(5);

		// Lista atual da tela
		List<WebElement> elementosAtuais = listaOrdenavel.findElements(By.cssSelector(".list-group-item"));

		for (int i = 0; i < elementosDesejados.length; i++) {
			WebElement elementoDesejado = elementosDesejados[i];
			WebElement elementoAtual = elementosAtuais.get(i);

			// Se já está na posição correta, pula
			if (elementoAtual.getText().equals(elementoDesejado.getText()))
				continue;

			// Scroll até o elemento correto
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", elementoDesejado);

			// Arrasta para a posição correta
			actions.clickAndHold(elementoDesejado).moveToElement(elementoAtual).release().perform();

			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			// Atualiza a lista atual
			elementosAtuais = listaOrdenavel.findElements(By.cssSelector(".list-group-item"));
		}
	}

	public void ordenarListas(boolean crescente) {
		Actions actions = new Actions(driver);

		WebElement[] elementosDesejados = crescente
				? new WebElement[] { itemSixList, itemFiveList, itemFourList, itemThreeList, itemTwoList, itemOneList }
				: new WebElement[] { itemOneList, itemTwoList, itemThreeList, itemFourList, itemFiveList, itemSixList };

		// Clica na aba List
		cc.clickDOM(abaList);
		cc.esperarEmSegundos(2);

		// Itera sobre os elementos desejados
		for (int i = 0; i < elementosDesejados.length; i++) {

			// Atualiza a lista atual da tela
			List<WebElement> elementosAtuais = listaOrdenavel.findElements(By.cssSelector(".list-group-item"));

			WebElement elementoDesejado = elementosDesejados[i];
			WebElement elementoAtual = elementosAtuais.get(i);

			// Se já está na posição correta, pula
			if (elementoAtual.getText().equals(elementoDesejado.getText()))
				continue;

			// Scroll até o elemento correto
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
					elementoDesejado);

			// Arrasta o elemento para a posição correta usando offset vertical
			actions.clickAndHold(elementoDesejado).moveToElement(elementoAtual, 0, 0).release().perform();

			// Pequena espera para atualização da UI
			cc.esperarEmSegundos(1);
		}
	}

	public void ClicarAbaGrid() {

		cc.click(abaGrid);

	}

	public void ordenarElementosGrid(boolean decrescente) {
		Actions actions = new Actions(driver);

		// Ordem desejada
		WebElement[] elementosDesejados = decrescente
				? new WebElement[] { itemNineGrid, itemEightGrid, itemSevenGrid, itemSixGrid, itemFiveGrid,
						itemFourGrid, itemThreeGrid, itemTwoGrid, itemOneGrid }
				: new WebElement[] { itemOneGrid, itemTwoGrid, itemThreeGrid, itemFourGrid, itemFiveGrid, itemSixGrid,
						itemSevenGrid, itemEightGrid, itemNineGrid };

		// Clica na aba Grid
		cc.clickDOM(abaGrid);
		cc.esperarEmSegundos(2);

		// Container da grade
		WebElement containerGrid = driver.findElement(By.id("demo-tabpane-grid"));

		for (int i = 0; i < elementosDesejados.length; i++) {
			// Atualiza os elementos atuais na grade
			List<WebElement> elementosAtuais = containerGrid.findElements(By.cssSelector(".list-group-item"));

			WebElement elementoDesejado = elementosDesejados[i];
			WebElement elementoAtual = elementosAtuais.get(i);

			// Se já está na posição correta, pula
			if (elementoAtual.getText().equals(elementoDesejado.getText()))
				continue;

			// Scroll até o elemento
			((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView({block: 'center'});",
					elementoDesejado);

			// Arrasta para a posição correta
			actions.clickAndHold(elementoDesejado).moveToElement(elementoAtual, 0, 0).release().perform();

			cc.esperarEmSegundos(1);
		}
	}

}
