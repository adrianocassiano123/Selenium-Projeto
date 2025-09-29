package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsForm {
	
	// Botão "Forms"
	@FindBy(xpath = "//div[contains(@class,'top-card') and .//h5[text()='Forms']]")
	protected WebElement botaoForms;
	
	@FindBy(xpath = "//span[text()='Practice Form']")
    protected WebElement praticeForm;
	
    
    @FindBy(id = "firstName")
    protected WebElement nome;

    @FindBy(id = "lastName")
    protected WebElement ultimoNome;

    
    @FindBy(id = "userEmail")
    protected WebElement email;

    
    @FindBy(css = "label[for='gender-radio-1']")
    protected WebElement radioGeneroMasculino;

    @FindBy(css = "label[for='gender-radio-2']")
    protected WebElement radioGeneroFeminino;

    @FindBy(css = "label[for='gender-radio-3']")
    protected WebElement radioGeneroOutro;

    
    @FindBy(id = "userNumber")
    protected WebElement celular;

    // Data de nascimento (abre o calendário)
    @FindBy(id = "dateOfBirthInput")
    protected WebElement dataNascimento;

    
    @FindBy(id = "subjectsInput")
    protected WebElement subjects;

    
    @FindBy(css = "label[for='hobbies-checkbox-1']")
    protected WebElement checkHobbyEsportes;

    @FindBy(css = "label[for='hobbies-checkbox-2']")
    protected WebElement checkHobbyLeitura;

    @FindBy(css = "label[for='hobbies-checkbox-3']")
    protected WebElement checkHobbyMusica;

    
    @FindBy(id = "uploadPicture")
    protected WebElement uploadArquivo;

    
    @FindBy(id = "currentAddress")
    protected WebElement endereco;

    
    @FindBy(id = "react-select-3-input")
    protected WebElement comboEstado;

    
    @FindBy(id = "react-select-4-input")
    protected WebElement comboCidade;
    
    
    @FindBy(id = "submit")
    protected WebElement botaoEnviar;
    
    
    @FindBy(id = "example-modal-sizes-title-lg")
    protected WebElement mensagemSucesso;

    
    @FindBy(xpath = "//*[@id=\"closeLargeModal\"]")
    protected WebElement botaoClose;

}


