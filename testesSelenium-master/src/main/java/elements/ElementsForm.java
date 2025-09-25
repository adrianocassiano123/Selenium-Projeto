package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsForm {
	
	// Botão "Forms"
	@FindBy(xpath = "//div[contains(@class,'top-card') and .//h5[text()='Forms']]")
	protected WebElement botaoForms;
	
	@FindBy(xpath = "//span[text()='Practice Form']")
    protected WebElement praticeForm;
	
    // Nome
    @FindBy(id = "firstName")
    protected WebElement nome;

    @FindBy(id = "lastName")
    protected WebElement ultimoNome;

    // Email
    @FindBy(id = "userEmail")
    protected WebElement email;

    // Gênero (radio buttons)
    @FindBy(css = "label[for='gender-radio-1']")
    protected WebElement radioGeneroMasculino;

    @FindBy(css = "label[for='gender-radio-2']")
    protected WebElement radioGeneroFeminino;

    @FindBy(css = "label[for='gender-radio-3']")
    protected WebElement radioGeneroOutro;

    // Telefone
    @FindBy(id = "userNumber")
    protected WebElement celular;

    // Data de nascimento (abre o calendário)
    @FindBy(id = "dateOfBirthInput")
    protected WebElement dataNascimento;

    // Subjects (matérias)
    @FindBy(id = "subjectsInput")
    protected WebElement subjects;

    // Hobbies (checkboxes)
    @FindBy(css = "label[for='hobbies-checkbox-1']")
    protected WebElement checkHobbyEsportes;

    @FindBy(css = "label[for='hobbies-checkbox-2']")
    protected WebElement checkHobbyLeitura;

    @FindBy(css = "label[for='hobbies-checkbox-3']")
    protected WebElement checkHobbyMusica;

    // Upload de arquivo
    @FindBy(id = "uploadPicture")
    protected WebElement uploadArquivo;

    // Endereço atual
    @FindBy(id = "currentAddress")
    protected WebElement endereco;

    // Estado e Cidade
    @FindBy(id = "react-select-3-input")
    protected WebElement comboEstado;

    @FindBy(id = "react-select-4-input")
    protected WebElement comboCidade;

    // Botão de envio
    @FindBy(id = "submit")
    protected WebElement botaoEnviar;


    //Botão de envio
    @FindBy(xpath = "//*[@id=\"closeLargeModal\"]")
    protected WebElement botaoClose;

}


