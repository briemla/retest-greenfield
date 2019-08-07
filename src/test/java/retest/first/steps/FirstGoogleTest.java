package retest.first.steps;

import static org.junit.Assert.assertNotNull;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import de.retest.recheck.Recheck;
import de.retest.recheck.RecheckImpl;

public class FirstGoogleTest {

	private WebDriver driver;
	private Recheck re;

	@Before
	public void setUp() {
		re = new RecheckImpl();
		driver = new ChromeDriver();
		assert null != driver : "Chrome driver";
	}

	@Test
	public void google() throws Exception {
		re.startTest();

		driver.get("http://google.com");
		re.check(driver, "open");

		re.capTest();
		assertNotNull(driver);
	}

	@After
	public void tearDown() {
		re.cap();
	}
}
