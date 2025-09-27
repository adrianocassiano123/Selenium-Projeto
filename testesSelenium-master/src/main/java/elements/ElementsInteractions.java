package elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ElementsInteractions {
	
	
	// Interactions
	@FindBy(xpath = "//h5[text()='Interactions']")
	protected WebElement cardInteractions;
	
	@FindBy(xpath = "//div[@class='element-list collapse show']//span[text()='Sortable']")
	protected WebElement menuSortable;
		
		
    // Aba "List"
    @FindBy(id = "demo-tab-list")
    protected WebElement abaList;

    // Aba "Grid"
    @FindBy(id = "demo-tab-grid")
    protected WebElement abaGrid;
    

    // Itens da lista (List Tab)
    @FindBy(xpath = "//div[@id='demo-tabpane-list']//div[text()='One']")
    protected WebElement itemOneList;

    @FindBy(xpath = "//div[@id='demo-tabpane-list']//div[text()='Two']")
    protected WebElement itemTwoList;

    @FindBy(xpath = "//div[@id='demo-tabpane-list']//div[text()='Three']")
    protected WebElement itemThreeList;

    @FindBy(xpath = "//div[@id='demo-tabpane-list']//div[text()='Four']")
    protected WebElement itemFourList;

    @FindBy(xpath = "//div[@id='demo-tabpane-list']//div[text()='Five']")
    protected WebElement itemFiveList;

    @FindBy(xpath = "//div[@id='demo-tabpane-list']//div[text()='Six']")
    protected WebElement itemSixList;
    
    @FindBy(xpath = "//div[@id='demo-tabpane-list']")
    protected WebElement listaOrdenavel;

    
    // Itens da grade (Grid Tab)
    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='One']")
    protected WebElement itemOneGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Two']")
    protected WebElement itemTwoGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Three']")
    protected WebElement itemThreeGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Four']")
    protected WebElement itemFourGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Five']")
    protected WebElement itemFiveGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Six']")
    protected WebElement itemSixGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Seven']")
    protected WebElement itemSevenGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Eight']")
    protected WebElement itemEightGrid;

    @FindBy(xpath = "//div[@id='demo-tabpane-grid']//div[text()='Nine']")
    protected WebElement itemNineGrid;
}
