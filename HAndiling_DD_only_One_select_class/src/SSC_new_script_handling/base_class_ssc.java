package SSC_new_script_handling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class base_class_ssc implements Frmae_work_constant_SSC {
	
	public static WebDriver driver;
	@BeforeClass
	public void openApp() {
		System.setProperty(EDGE_KEYS, EDGE_VALUE);
		driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(wait, TimeUnit.SECONDS);
		driver.get(URL_s);
	}
	@AfterClass
	public void closeApp() {
		driver.quit();
	}
}		
