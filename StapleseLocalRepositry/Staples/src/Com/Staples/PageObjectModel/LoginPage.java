package Com.Staples.PageObjectModel;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {

	@FindBy(how = How.CSS, using = "#gbw > div > div > div.gb_ke.gb_R.gb_Eg.gb_vg > div:nth-child(1) > a")
	private WebElement LinkClik;
	public WebElement getLinkClik() {
		return LinkClik;
	}
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getUserNameNext() {
		return UserNameNext;
	}
	public WebElement getPasswordNext() {
		return PasswordNext;
	}
	public WebElement getSignOutclick() {
		return SignOutclick;
	}
	public WebElement getSignOut() {
		return SignOut;
	}
	@FindBy(how = How.XPATH, using = "//*[@id='identifierId']")
	private WebElement UserName;
	@FindBy(how = How.NAME, using = "password")
	private WebElement Password;
	@FindBy(how = How.CSS, using = "#identifierNext > content > span")
	private WebElement UserNameNext;
	@FindBy(how = How.CSS, using = "#passwordNext > content > span")
	private WebElement PasswordNext;
	@FindBy(how = How.CSS, using = "#gb > div.gb_Ff.gb_Eg > div.gb_kb.gb_Eg.gb_R.gb_Dg.gb_T > div.gb_Ac.gb_Eg.gb_R > div.gb_hb.gb_5c.gb_Eg.gb_R > div.gb_Mc.gb_jb.gb_Eg.gb_R > a > span")
	private WebElement SignOutclick;
	@FindBy(how = How.ID, using = "gb_71")
	private WebElement SignOut;

}
