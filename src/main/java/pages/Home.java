package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home extends basicTest{
	public Home() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//*[@id=\"root\"]/div/header/div[1]/div/div/div/div/div[2]/nav/ul/li[3]/a")
	WebElement contact;
	@FindBy(xpath="//i[@class=\"ion-ios-search lifont12\"]")
	WebElement search;
	@FindBy(xpath="//a[@class=\"btn-close active\"]/i")
	WebElement cross;
	@FindBy(xpath="//div[@class=\"main-menu_area d-none d-lg-block\"]/nav/ul/li[2]/a")
	WebElement shop;
	@FindBy(xpath="//div[@class=\"main-menu_area d-none d-lg-block\"]/nav/ul/li[2]/ul/li/ul/li/a")
	WebElement menu;
	@FindBy(xpath="//h5[contains(text(),'Product Categories')]")
	WebElement productCategories;
	@FindBy(xpath="//div[@title=\"Add To cart\"]")
	List<WebElement> addbtn;
	@FindBy(xpath="//div[@class=\"qty-btn_area\"]/a")
	WebElement addOnProductPage;
	@FindBy(xpath="//h3[@class=\"product-name\"]")
	List<WebElement> allItem;
	@FindBy(xpath="//div[@class=\"sp-heading\"]/h5")
	WebElement fullItemName;
	@FindBy(xpath="//img[@title=\"Shopping Cart\"]")
	WebElement cart;
	@FindBy(xpath="//header/div[@id='miniCart']/div[1]/div[6]/a[1]")
	WebElement checkout;
	@FindBy(xpath="//input[@type='button']")
	WebElement placeorder;
	
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div[2]/div/div[2]/div/div/p[2]")
	WebElement orderNumber;
	@FindBy(xpath="//*[@id=\"root\"]/div/main/div[2]/div/div[2]/div/h3")
	WebElement orderStatus;
	@FindBy(xpath="//*[@id='root']/div/main/div[2]/div/div[2]/div/div/p[1]")
	WebElement mssgafterplaceorder;
	
	@FindBy(xpath="//a[contains(text(),'Hands-Free Dog Leash')]")
	WebElement handfreeDogleaseCategory;
	@FindBy(xpath="//div[@class=\"sidebar-categories_menu\"]/ul/li[3]/a")
	WebElement dogLeaseCategory;
	@FindBy(xpath="//div[@class=\"sidebar-categories_menu\"]/ul/li[4]/a")
	WebElement petCarrierBagCategory;
	@FindBy(xpath="//div[@filterby=\"Hands-FreeDogLeash\"]/div/div/div[2]/div/h3/a")
	List<WebElement> totalItemInHandfreeDogleaseCategory;
	@FindBy(xpath="//div[@filterby=\"Hands-FreeDogLeash\"]/div/div/div[2]/div/div/span")
	List<WebElement> itempricehandfreeDogleaseCategory;
	@FindBy(xpath="//a[contains(text(),'All')]")
	WebElement AllCategegories;
			
	



public void clickOnContact() {
	contact.click();
	}
public void clickOnSearch() {
	search.click();
	}
public void clickOnCross() throws InterruptedException {
	cross.click();
	Thread.sleep(3000);
	}
public WebElement shopElement() {
	 WebElement element =shop;
	return element;
}

public void clickOnMenu() throws InterruptedException {
//      WebElement Ht=driver.findElement(By.tagName("html"));
//     Ht.sendKeys(Keys.chord(Keys.CONTROL,Keys.SUBTRACT));
//	Thread.sleep(3000);
//	Ht.sendKeys(Keys.chord(Keys.CONTROL, "0"));

  
    Actions action = new Actions(driver);
	action.moveToElement(shop).moveToElement(menu).click().build().perform();
	menu.click();
	Thread.sleep(5000);
}
public void moveOnProductCategories() {
	Actions action=new Actions(driver);
	action.moveToElement(productCategories).build().perform();
}
public int addBtn() {
	return addbtn.size();
	}
public List<WebElement> addItem() {
List<WebElement> btn=addbtn;
return btn;	
}
public void clickOnCart() {
	cart.click();
	
}
public WebElement scrollatCart() {
	WebElement element= cart;
	return element;
	
}
public void clickOnCheckOut() {
	checkout.click();
}
public void clickOnPlaceOrder() {
	placeorder.click();
}
//public WebElement placeOrderelement() {
//	WebElement element=placeorder;
//	return element;
//}
public String OrderStatus() {
	return orderStatus.getText();
}
public String printOrderNo() {
	return orderNumber.getText();
	
}
public String printMssgAfterPlaceOrder() {
return mssgafterplaceorder.getText();
}

public void clickOnHandfreeDogleaseCategory() throws InterruptedException {
	handfreeDogleaseCategory.click();
	Thread.sleep(2000);
}
public void clickOnDogLeaseCategory() throws InterruptedException {
	dogLeaseCategory.click();
	Thread.sleep(2000);
}
public void clickOnPetCarrierBagCategory() {
	petCarrierBagCategory.click();
}
public List<WebElement> totalItemInHandfreeDogleaseCategory() {
	List<WebElement> element=totalItemInHandfreeDogleaseCategory;
	return element;
}
public int HandfreeDogleaseCategorySize() {
	return totalItemInHandfreeDogleaseCategory.size();
	}
public List<WebElement> ItempricehandfreeDogleaseCategory() {
	List<WebElement> element=itempricehandfreeDogleaseCategory;
	return element;
}
public List<WebElement> AllItem() {
	List<WebElement> element=allItem;
	return element;
}
public WebElement fullItemName() {
WebElement element=fullItemName;
return element;
}
public WebElement clickOnAddOnProductPage() {
	WebElement element=addOnProductPage;
	return element;
}
public WebElement AllCategegories() {
	WebElement element=AllCategegories;
	return element;
}







}