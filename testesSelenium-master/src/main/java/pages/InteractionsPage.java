package pages;

	import org.openqa.selenium.WebDriver;
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
		// Navega até a página de login.

		public void navegarParaPagina() {
			driver.get(Urls.PAGINA); // Usa a URL da classe Urls
		}

		public void clicarNoMenuInteractions() {

			cc.clickDOM(cardInteractions);

		}
		
		public void clicarNoMenuSortable() {

			cc.clickDOM(menuSortable);

		}
		
		public void ordenarElementosDecrescenteLista() {

			

		}
		
		public void ordenarElementosCrescenteLista() {

			

		}
		
		
        public void ClicarAbaGrid() {

			cc.click(abaGrid);

		}
		
		
		public void ordenarElementosDecrescenteGrid() {

			

		}
		
		public void ordenarElementosCrescenteGrid() {

			

		}
		
	
}
