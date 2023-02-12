package pages;
import java.io.IOException;
import java.net.URL;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class LaunchApplication {
	public static AndroidDriver<MobileElement>driver;
		@BeforeTest
		public static WebDriver Driver() throws IOException {
				DesiredCapabilities cap = new DesiredCapabilities();
				cap.setCapability(MobileCapabilityType.DEVICE_NAME,"emulator-5554");
				cap.setCapability("plateformName","ANDROID");
				cap.setCapability("ignoreHiddenApiPolicyError", true);
				cap.setCapability("appPackage","com.flipkart.android");
				cap.setCapability("appActivity","com.flipkart.android.SplashActivity");
				cap.setCapability("noReset",true);
			    driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), cap);	
				return driver;	
			}
		@AfterTest
		public void TearDown() {
			driver.quit();
		}
		}


