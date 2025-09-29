package pages;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import elements.ElementsElements;
import helpers.ComandosComuns;
import io.cucumber.datatable.DataTable;
import utils.Urls; // Importa a classe Urls

public class ElementsPage extends ElementsElements {

	private WebDriver driver;
	private ComandosComuns cc;

	public ElementsPage(WebDriver driver) {
		this.driver = driver;
		this.cc = new ComandosComuns(driver);
		PageFactory.initElements(driver, this);
	}

	public void navegarParaPagina() {
		driver.get(Urls.PAGINA); // Usa a URL da classe Urls
	}

	public void clicarNocardElements() {

		cc.clickDOM(cardElements);

	}

	public void clicarNoWebtables() {

		cc.clickDOM(webTables);

	}

	public void clicarNoBtnAdd() {
		cc.click(btnAdd);
	}

	public void preencherAlterarNome(String texto) {

		cc.sendKeys(inputNome, texto);
	}

	public void preencherAlterarUltimoNome(String texto) {

		cc.sendKeys(inputUltimoNome, texto);
	}

	public void preencherAlterarEmail(String texto) {

		cc.sendKeys(inputEmail, texto);
	}

	public void preencherAlterarIdade(String texto) {

		cc.sendKeys(inputIdade, texto);
	}

	public void preencherAlterarSalário(String texto) {

		cc.sendKeys(inputSalario, texto);
	}

	public void preencherAlterarDepartamento(String texto) {

		cc.sendKeys(inputDepartmento, texto);
	}

	public void clicarSubmit() {

		cc.click(btnSubmit);
	}

	public void clicarBtnEditar() {

		cc.clicarComScroll(ultimoBtnEditar);
	}

	public void clicarBtnDeletar() {

		// cc.clicarEmTodos(btnDeletarList, By.xpath("//span[@title='Delete']"));
		cc.clicarComScroll(ultimoBtnDeletar);

	}

	// Criar registros de forma dinâmica
	public void criarRegistrosDinamicos(int quantidade) {
		for (int i = 1; i <= quantidade; i++) {
			btnAdd.click();
			inputNome.sendKeys("Nome" + i);
			inputUltimoNome.sendKeys("Sobrenome" + i);
			inputEmail.sendKeys("teste" + i + "@email.com");
			inputIdade.sendKeys(String.valueOf(20 + i));
			inputSalario.sendKeys(String.valueOf(1000 * i));
			inputDepartmento.sendKeys("Depto" + i);
			btnSubmit.click();
		}
	}

	// Deletar todos os registros criados
	public void deletarTodosRegistros() {
		while (!btnDeletarList.isEmpty()) {
			btnDeletarList.get(0).click();
		}
	}

	// Criar registros a partir do DataTable
	public void criar12Registros(DataTable dataTable) {
		List<Map<String, String>> registros = dataTable.asMaps(String.class, String.class);

		for (Map<String, String> registro : registros) {
			cc.clicarComScroll(btnAdd);

			cc.sendKeys(inputNome, registro.get("nome"));
			cc.sendKeys(inputUltimoNome, registro.get("sobrenome"));
			cc.sendKeys(inputEmail, registro.get("email"));
			cc.sendKeys(inputIdade, registro.get("idade"));
			cc.sendKeys(inputSalario, registro.get("salario"));
			cc.sendKeys(inputDepartmento, registro.get("departamento"));

			cc.click(btnSubmit);
			cc.esperarEmSegundos(1); // pausa rápida para garantir criação
		}
	}

	// Método simples que exclui apenas as 12 últimas registros
    public void deletarUltimosRegistros(int quantidade) {
        // Pega todos os botões de delete
        List<WebElement> botoesDelete = driver.findElements(By.xpath("//span[@title='Delete']"));
        
        System.out.println("Total de registros: " + botoesDelete.size());
        System.out.println("Deletando os últimos " + quantidade + " registros...");
        
        // Deleta do último para o primeiro
        for (int i = 0; i < quantidade; i++) {
            if (!botoesDelete.isEmpty()) {
                
                WebElement ultimoBotao = botoesDelete.get(botoesDelete.size() - 1);
                cc.clicarComScroll(ultimoBotao);
                cc.esperarEmSegundos(1);
                
                botoesDelete = driver.findElements(By.xpath("//span[@title='Delete']"));
            }
        }
        
        System.out.println("Deleção concluída. Registros restantes: " + 
            driver.findElements(By.xpath("//span[@title='Delete']")).size());
    }
}

