package pomPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage<WebDriverUtility> {
	
	//Declaration
	@FindBy(id = "Name")
	private WebElement nameTF;
	@FindBy(id="House/Office Info")
	private WebElement houseInfoTF;
	@FindBy(id="Street Info")
	private WebElement streetInfoTF;
	@FindBy(id="Landmark")
	private WebElement landmarkTF;
	@FindBy(id="Country")
	private WebElement countryDropdown;
	@FindBy(id="State")
	private WebElement stateDropdown;
	@FindBy(id="City")
	private WebElement cityDropdown;
	@FindBy(id="Pincode")
	private WebElement pincodeTF;
	@FindBy(id="Phone Number")
	private WebElement phonenumberTF;
	@FindBy(xpath = "//button[text()='Add Adress']")
	private WebElement addAddressButton;

	//Initialization
	public void addAddressDetails(WebDriverUtility  web, String name,
			String houseInfo, String street, String landmark,
			String country, String state, String city, Object phoneNum, CharSequence pincode, Object phoneNumberTF) {
		nameTF.sendKeys(name);
		houseInfoTF.sendKeys(houseInfo);
		streetInfoTF.sendKeys(street);
		landmarkTF.sendKeys(landmark);
				
	}

}
