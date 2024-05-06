package Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class BaseClass {

	@Parameters("bName")
	@BeforeClass
	public void launchApplication(String bName) {
		WebDriver webDriver;
		if(bName.equals("Chrome")) {
			System.out.println("CHROME");
		}else {
			System.out.println("DEFAULT BROWSER");
		}
	}
	
	@Test
	public void test() {
		System.out.println("TEST METHID");
	}
	
}
