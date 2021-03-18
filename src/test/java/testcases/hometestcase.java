package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Home;
import pages.basicTest;

public class hometestcase extends basicTest{
	public Home home;

	public hometestcase(){
		super();
	}
	@BeforeTest
	public void setUp() throws InterruptedException {
		home=new Home();
	}
	@Test   (priority=1)       
//Item is getting sequence wise and then place order.
	public void placeOrder() throws InterruptedException {
		home.clickOnMenu();
		home.moveOnProductCategories();
		System.out.println("Total items In Menu Is: "+home.addBtn());
		for(int j=0; j<home.addBtn(); j++) {
			if(j<2) {
				home.addItem().get(j).click();
				Thread.sleep(3000);
			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.scrollatCart());
		home.clickOnCart();
		Thread.sleep(3000);
		home.clickOnCheckOut();
		Thread.sleep(3000);
		home.clickOnPlaceOrder();
		Thread.sleep(2000);
        System.out.println(home.OrderStatus());
		Thread.sleep(2000);
        System.out.println(home.printMssgAfterPlaceOrder());
		Thread.sleep(2000);
        System.out.println(home.printOrderNo());
	}
	@Test (priority=1)
	//add one item (any) and then place order.
	public void placeOrderwithSigleItem() throws InterruptedException {
		String itemName="Peteeza Furry Dog Leash 6 FT Thick Durable Nylon Rope - Comfortable Padded Handle - Highly Reflective Threads - Dog Leashes for Medium and Large Dogs. (Orange)";
		home.clickOnMenu();
		home.moveOnProductCategories();
		System.out.println("Total items In Menu Is: "+home.addBtn());
		for(int j=0; j<home.addBtn(); j++) {
			home.AllItem().get(j).click();
			Thread.sleep(3000);
			String FullItemName=home.fullItemName().getText();
			if(FullItemName.equalsIgnoreCase(itemName)) {
				home.clickOnAddOnProductPage().click();
				Thread.sleep(3000);
			}else {
				driver.navigate().back();
				Thread.sleep(3000);

			}
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.scrollatCart());
		home.clickOnCart();
		Thread.sleep(3000);
		home.clickOnCheckOut();
		Thread.sleep(3000);
		home.clickOnPlaceOrder();
		Thread.sleep(2000);
        System.out.println(home.OrderStatus());
		Thread.sleep(2000);
        System.out.println(home.printMssgAfterPlaceOrder());
		Thread.sleep(2000);
        System.out.println(home.printOrderNo());
        

		
	}
	@Test (priority=3)
	//add  mutiple item randomly or single then place order
	public void placeOrderwithmultipleItem() throws InterruptedException {
		home.clickOnMenu();
		home.moveOnProductCategories();
		String[] strAr = {"Peteeza Furry Dog Leash 6 FT Thick Durable Nylon Rope - Comfortable Padded Handle - Highly Reflective Threads - Dog Leashes for Medium and Large Dogs. (Orange)", "Peteeza Furry Dog Leash 6 FT Thick Durable Nylon Rope - Comfortable Padded Handle - Highly Reflective Threads - Dog Leashes for Medium and Large Dogs. (Purple)"};
		for (int i=0; i<strAr.length; i++)  
		{  
			System.out.println(strAr[i]); 
			Thread.sleep(3000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", home.AllCategegories());
			System.out.println(home.addBtn());
			Thread.sleep(3000);

			for(int j=0; j<home.addBtn(); j++) {
				System.out.println(home.AllItem().get(j).getText());
				Thread.sleep(1000);
                home.AllItem().get(j).click();
				Thread.sleep(2000);
				String FullItemName=home.fullItemName().getText();
				if(FullItemName.equals(strAr[i])){
					home.clickOnAddOnProductPage().click();
					Thread.sleep(1000);
					System.out.println("item added and its position is : "+j);
					home.clickOnMenu();
					home.moveOnProductCategories();	
					Thread.sleep(2000);
					//JavascriptExecutor js = (JavascriptExecutor) driver;
					//js.executeScript("arguments[0].scrollIntoView();", home.AllItem().get(j+1));
}		

				else {
					driver.navigate().back();
					System.out.println("page has been navigated.");
					Thread.sleep(2000);  }
			}
		}


		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", home.scrollatCart());
		home.clickOnCart();
		Thread.sleep(3000);
		home.clickOnCheckOut();
		Thread.sleep(3000);
		home.clickOnPlaceOrder();
		Thread.sleep(2000);
        System.out.println(home.OrderStatus());
		Thread.sleep(2000);
        System.out.println(home.printMssgAfterPlaceOrder());
		Thread.sleep(2000);
        System.out.println(home.printOrderNo());
        
	}
	//System.out.println(home.printMssgAfterPlaceOrder());
	//System.out.println(home.printOrderNo());



	@Test(enabled=false)
	public void handsFreeCategoryItemsOrder() throws InterruptedException {
		home.clickOnMenu();
		home.moveOnProductCategories();
		home.clickOnHandfreeDogleaseCategory();
		System.out.println("Total items in Hand-Free Dog Lease Category is: "+home.HandfreeDogleaseCategorySize());
		for(int i=0; i<home.HandfreeDogleaseCategorySize();i++) {
			String itemname=home.totalItemInHandfreeDogleaseCategory().get(i).getText();
			String itemprice=home.ItempricehandfreeDogleaseCategory().get(i).getText();
			System.out.println(itemname +" : "+ itemprice);
		}
		home.clickOnDogLeaseCategory();
		home.clickOnPetCarrierBagCategory();


	}



}