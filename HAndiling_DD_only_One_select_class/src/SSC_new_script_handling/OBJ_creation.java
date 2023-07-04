package SSC_new_script_handling;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class OBJ_creation extends base_class_ssc{
	
	//pom class object
	public static pom_class_ssc pom() {
		pom_class_ssc pom=new pom_class_ssc(driver);
		return pom;
	}
	
	// DropDown Object
	public static void DD(WebElement ele,String value) {
		Select sel=new Select(ele);
		List<WebElement> opts = sel.getOptions();
		for (WebElement op : opts) {
			if (op.getText().equals(value)) {
				op.click();
				break;
			}
		}
	}
	
	//javaScript Objectth
	public static JavascriptExecutor js() {
		JavascriptExecutor js=(JavascriptExecutor)driver;
		return js;
	}
}
