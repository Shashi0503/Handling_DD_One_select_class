package SSC_new_script_handling;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Test_script_for_SSC  extends base_class_ssc{
	
	@Test(priority = 1)
	public void dd_handling() throws InterruptedException {
		
		OBJ_creation.pom().new_user().click();
		Thread.sleep(2000);
		OBJ_creation.js().executeScript("arguments[0].scrollIntoView();", OBJ_creation.pom().id_type());
		Thread.sleep(2000);
		OBJ_creation.DD(OBJ_creation.pom().id_type(), "PAN Card");
		Thread.sleep(2000);
		OBJ_creation.js().executeScript("arguments[0].scrollIntoView();", OBJ_creation.pom().edu_board());
		Thread.sleep(2000);
		OBJ_creation.DD(OBJ_creation.pom().edu_board(), "Karnataka Secondary Education Examination Board");
		Thread.sleep(2000);
		OBJ_creation.DD(OBJ_creation.pom().re_edu_board(), "Karnataka Secondary Education Examination Board");
		Thread.sleep(2000);
		OBJ_creation.DD(OBJ_creation.pom().yop(), "2015");
		Thread.sleep(2000);
		OBJ_creation.DD(OBJ_creation.pom().re_yop(), "2015");
		Thread.sleep(2000);
		OBJ_creation.DD(OBJ_creation.pom().edu_level(), "Graduation");
		Thread.sleep(2000);
		OBJ_creation.js().executeScript("arguments[0].scrollIntoView();", OBJ_creation.pom().state());
		Thread.sleep(2000);
		OBJ_creation.DD(OBJ_creation.pom().state(), "Karnataka");
		Thread.sleep(2000);
		
	}
	
	@Test(priority = 2)
	public void all_manad() {
		
		OBJ_creation.pom().save().click();
		List<WebElement> man = OBJ_creation.pom().all_mandatory();
		for (WebElement m : man) {
			String text = m.getText();
			System.out.println(text);
		}
		
	}
}
