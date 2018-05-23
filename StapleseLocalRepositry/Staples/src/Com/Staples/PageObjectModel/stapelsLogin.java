package Com.Staples.PageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class stapelsLogin {
	
	@FindBy(how = How.NAME, using = "username")
	private WebElement UserName;
	public WebElement getUserName() {
		return UserName;
	}
	public WebElement getPassword() {
		return Password;
	}
	public WebElement getSubmit() {
		return Submit;
	}
	@FindBy(how = How.LINK_TEXT, using = "Logout")
	private WebElement diglogoutbutton;
	public WebElement getdigLogoutbutton() {
		return logoutbutton;
	}
	@FindBy(how = How.NAME, using = "password")
	private WebElement Password;
	@FindBy(how = How.CSS, using = "body > main > section > div > form > input.z_cta")
	private WebElement Submit;
	@FindBy(how = How.ID, using = "userNavLabel")
	private WebElement logoutbutton;
	@FindBy(how = How.CLASS_NAME, using = "alert-system alert-message alert alert-danger")
	private WebElement errorMessage;
	public WebElement getErrorMessage() {
		return errorMessage;
	}
	public WebElement getLogoutbutton() {
		return logoutbutton;
	}
	public WebElement getLogoutclick() {
		return logoutclick;
	}
	@FindBy(how = How.CSS, using = "#userNav-menuItems > a:nth-child(4)")
	private WebElement logoutclick;
	@FindBy(how = How.CLASS_NAME, using = "nav__user-name")
	private WebElement edslogoutclick;
	public WebElement getEdslogoutclick() {
		return edslogoutclick;
	}
	public WebElement getEdslogoutlinkclick() {
		return edslogoutlinkclick;
	}
	@FindBy(how = How.CLASS_NAME, using = "nav__action")
	private WebElement edslogoutlinkclick;
	@FindBy(how = How.CSS, using = "#welcome_text > a")
	private WebElement amhlogoutlinkclick;
	@FindBy(how = How.CSS, using = "#optionsbtn")
	private WebElement cornerlogoutclick;
	public WebElement getCornerlogoutclick() {
		return cornerlogoutclick;
	}
	public WebElement getCornerlogoutlinkclick() {
		return cornerlogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#settingsDd > li:nth-child(2) > a > span")
	private WebElement cornerlogoutlinkclick;
	public WebElement getBitlogoutclick() {
		return bitlogoutclick;
	}
	public WebElement getBitlogoutlinkclick() {
		return bitlogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#current-user > span > img")
	private WebElement bitlogoutclick;
	@FindBy(how = How.CSS, using = "#user-dropdown-menu > div > div.aui-dropdown2-section.user-logout-section > ul > li > a")
	private WebElement bitlogoutlinkclick;
	
	@FindBy(how = How.CSS, using = "#header-details-user-fullname > span > span > img")
	private WebElement jiralogoutclick;
	public WebElement getJiralogoutclick() {
		return jiralogoutclick;
	}
	public WebElement getJiralogoutlinkclick() {
		return jiralogoutlinkclick;
	}
	@FindBy(how = How.ID, using = "log_out")
	private WebElement jiralogoutlinkclick;
	public WebElement getPolarlogoutlinkclick() {
		return polarlogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#wrapper > div.row.header_section > nav > div > div.col-sm-4.user_info > span.col-sm-3.log_out_block.left_float > a")
	private WebElement polarlogoutlinkclick;
	@FindBy(how = How.ID, using = "logingOut")
	private WebElement camslogoutlinkclick;
	public WebElement getFsalogoutlinkclick() {
		return fsalogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#frmHome > nav > div.container > div > div:nth-child(3) > div:nth-child(1) > span")
	private WebElement fsalogoutlinkclick;
	@FindBy(how = How.CSS, using = "body > table.table-page-display > tbody > tr > td:nth-child(3) > a")
	private WebElement rttplogoutlinkclick;
	public WebElement getRttplogoutlinkclick() {
		return rttplogoutlinkclick;
	}
	public WebElement getCejlogoutlinkclick() {
		return cejlogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "body > table.table-page-display > tbody > tr > td:nth-child(3) > a")
	private WebElement cejlogoutlinkclick;
	@FindBy(how = How.CSS, using = "body > table.table-page-display > tbody > tr > td:nth-child(3) > a")
	private WebElement sigcaplogoutlinkclick;
	public WebElement getSigcaplogoutlinkclick() {
		return sigcaplogoutlinkclick;
	}
	public WebElement getCamslogoutlinkclick() {
		return camslogoutlinkclick;
	}
	public WebElement getCamslogoutbuttonclick() {
		return camslogoutbuttonclick;
	}
	@FindBy(how = How.CLASS_NAME, using = "btn btn critical_button")
	private WebElement camslogoutbuttonclick;
	@FindBy(how = How.CSS, using = "body > table > tbody > tr:nth-child(2) > td > center > table > tbody > tr > td:nth-child(3)")
	private WebElement spomslogoutlinkclick;
	public WebElement getSpomslogoutlinkclick() {
		return spomslogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#ppm_header_logout")
	private WebElement claritylogoutlinkclick;
	public WebElement getClaritylogoutlinkclick() {
		return claritylogoutlinkclick;
	}
	public WebElement getManguslogoutclick() {
		return manguslogoutclick;
	}
	public WebElement getManguslogoutlinkclick() {
		return manguslogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#navbar > ul > li.dropdown > a")
	private WebElement manguslogoutclick;
	@FindBy(how = How.CSS, using = "#navbar > ul > li.dropdown.open > ul > li > magnus-ng-auth-logout > a > span:nth-child(2)")
	private WebElement manguslogoutlinkclick;
	@FindBy(how = How.ID, using = "userName_span")
	private WebElement spearlogoutclick;
	public WebElement getSpearlogoutclick() {
		return spearlogoutclick;
	}
	public WebElement getSpearlogoutlinkclick() {
		return spearlogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#logout_btn > a")
	private WebElement spearlogoutlinkclick;
	public WebElement getRadarlogoutlinkclick() {
		return radarlogoutlinkclick;
	}
	@FindBy(how = How.ID, using = "logout")
	private WebElement radarlogoutlinkclick;
	public WebElement getAmhlogoutlinkclick() {
		return amhlogoutlinkclick;
	}
	@FindBy(how = How.ID, using = "menulogOff")
	private WebElement csrRewardslogoutclick;
	@FindBy(how = How.CLASS_NAME, using = "dropdown-toggle ng-binding")	
	//#bs-example-navbar-collapse-1 > ul.nav.navbar-nav.navbar-right.ng-scope > li > a
	private WebElement victorlogoutclick;
	@FindBy(how = How.CLASS_NAME, using = "underline")
	private WebElement Replenishlogoutclick;
	@FindBy(how = How.ID, using = "logout_pop")
	private WebElement solutionbuilderlogoutclick;
	public WebElement getSolutionbuilderlogoutclick() {
		return solutionbuilderlogoutclick;
	}
	public WebElement getSolutionbuilderlogoutpopupclick() {
		return solutionbuilderlogoutpopupclick;
	}
	@FindBy(how = How.CSS, using = "#customer-intent-promo > div.popup.logoutpop > div.popwin.logout-holder > button.btn.btn-s.btn-primary.btn-w100.scTrack.logout")
	private WebElement solutionbuilderlogoutpopupclick;
	public WebElement getReplenishlogoutclick() {
		return Replenishlogoutclick;
	}
	public WebElement getVictorlogoutclick() {
		return victorlogoutclick;
	}
	public WebElement getVictorlogoutlinkclick() {
		return victorlogoutlinkclick;
	}
	@FindBy(how = How.CSS, using = "#bs-example-navbar-collapse-1 > ul.nav.navbar-nav.navbar-right.ng-scope > li > ul > li:nth-child(2) > a")
	private WebElement victorlogoutlinkclick;
	@FindBy(how = How.CSS, using = "body > div:nth-child(12) > div.ui-dialog-buttonpane.ui-widget-content.ui-helper-clearfix > div > button:nth-child(1) > span")
	private WebElement csrRewardsalertclick;
	public WebElement getCsrRewardsalertclick() {
		return csrRewardsalertclick;
	}
	public WebElement getCsrRewardslogoutclick() {
		return csrRewardslogoutclick;
	}
	
}
