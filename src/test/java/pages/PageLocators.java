package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class PageLocators {
	
	AndroidDriver<MobileElement>driver;
	public PageLocators(AndroidDriver<MobileElement>driver) {
		this.driver = driver;
	}
    By SearchMenuGo = By.xpath("//android.widget.TextView[@text='Search for products']");
    By SearchButtonInput = By.xpath("//android.widget.EditText[@text='Search for Products, Brands and More']");
    By SearchButton = By.xpath("//android.widget.TextView[@text='mobiles']");
    By FirstSearchResult = By.xpath("//android.widget.TextView[@text='SAMSUNG Galaxy F04 (Opal Green, 64 GB)']");
    By AddToCartButton = By.xpath("//android.widget.TextView[@text='Add to cart']");
    By MyCart = By.xpath("//android.widget.TextView[@text='My Cart']");
    By GoToCartButton = By.xpath("//android.widget.TextView[@text='Go to cart']");
    
    public WebElement GetSearchMenuGo() {return driver.findElement(SearchMenuGo);}
    public WebElement GetSearchButtonInput() {return driver.findElement(SearchButtonInput);}
    public WebElement GetSearchButton() {return driver.findElement(SearchButton);}
    public WebElement GetFirstSearchResult() {return driver.findElement(FirstSearchResult);}
    public WebElement GetAddToCartButton() {return driver.findElement(AddToCartButton);}
    public WebElement GetMyCart() {return driver.findElement(MyCart);}
    public WebElement GetGoToCartButton() {return driver.findElement(GoToCartButton);}

}
