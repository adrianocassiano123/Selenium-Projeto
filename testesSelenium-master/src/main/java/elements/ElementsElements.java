package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsElements {
	
	// ===== CARD NA HOME =====
    @FindBy(xpath = "//h5[text()='Elements']")
    protected WebElement cardElements;

    // ===== MENU LATERAL =====
    @FindBy(xpath = "//span[text()='Web Tables']")
    protected WebElement webTables;

    // ===== BOTÃO ADD =====
    @FindBy(id = "addNewRecordButton")
    protected WebElement btnAdd;

    // ===== CAMPOS DO MODAL =====
    @FindBy(id = "firstName")
    protected WebElement inputNome;

    @FindBy(id = "lastName")
    protected WebElement inputUltimoNome;

    @FindBy(id = "userEmail")
    protected WebElement inputEmail;

    @FindBy(id = "age")
    protected WebElement inputIdade;

    @FindBy(id = "salary")
    protected WebElement inputSalario;

    @FindBy(id = "department")
    protected WebElement inputDepartmento;

    @FindBy(id = "submit")
    protected WebElement btnSubmit;

    // ===== CAMPOS DA TABELA (EXISTENTES) =====

    @FindBy(xpath = "(//span[@title='Edit'])[last()]")
    protected WebElement ultimoBtnEditar;

    @FindBy(xpath = "(//span[@title='Delete'])[last()]")
    protected WebElement ultimoBtnDeletar;

    @FindBy(xpath = "(//div[@class='rt-tr-group'])[last()]")
    protected WebElement ultimaLinhaTabela;

    
}

