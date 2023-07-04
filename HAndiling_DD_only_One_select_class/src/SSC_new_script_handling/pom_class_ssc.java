package SSC_new_script_handling;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom_class_ssc {
	
	@FindBy(id = "signUpLink")
	private WebElement new_user;
	
	@FindBy(xpath = "//select[@id='TypeofID']")
	private WebElement id_type;                             //  scroll and handle DD

	@FindBy(xpath = "//select[@id='EducationBoard']")
	private WebElement edu_board;
	
	@FindBy(xpath = "//select[@id='ddlEducationBoard']")
	private WebElement re_edu_board;
	
	@FindBy(xpath = "//select[@id='Yearofpassing']")
	private WebElement yop;
	
	@FindBy(xpath = "//select[@id='ddlYearofpassing']")
	private WebElement re_yop;
	
	@FindBy(xpath = "//select[@id='Levelofeducationqualification']")
	private WebElement edu_level;
	
	@FindBy(xpath = "//select[@id='OriginState']")
	private WebElement state;
	
	@FindBy(id = "btnsubmit1")
	private WebElement save;
	
	@FindBy(xpath = "//label[contains(text(),'mandatory')]")
	private List<WebElement> all_mandatory;
	
	public pom_class_ssc(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement new_user() {
		return new_user;
	}
	public WebElement id_type() {
		return id_type;
	}
	public WebElement edu_board() {
		return edu_board;
	}
	public WebElement re_edu_board() {
		return re_edu_board;
	}
	public WebElement yop() {
		return yop;
	}
	public WebElement re_yop() {
		return re_yop;
	}
	public WebElement edu_level() {
		return edu_level;
	}
	public WebElement state() {
		return state;
	}
	public WebElement save() {
		return save;
	}
	public List<WebElement> all_mandatory() {
		return all_mandatory;
	}
}
