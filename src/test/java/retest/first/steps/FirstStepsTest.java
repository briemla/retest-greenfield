package retest.first.steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

import de.retest.recheck.RecheckImpl;

public class FirstStepsTest {

	private ChromeDriver driver;
	private RecheckImpl re;

    @Before
    public void setup() {
    	re = new RecheckImpl();
    	driver = new ChromeDriver();
    }

    @Test
    public void scratchpad() throws Exception {
        re.startTest();
        driver.get( "http://scratchpad.io/recheck-45678" );
        re.check( driver, "open" );
        re.capTest();
    }

    @After
    public void tearDown() {
    	driver.close();
    	re.cap();
    }

}
