package com.moodle.test;

import com.opera.core.systems.OperaDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

//import org.openqa.selenium.android.AndroidDriver;
//import org.openqa.selenium.iphone.IPhoneDriver;
/**
 * This is the manager class for all drivers.
 * @author Tim Barker 
 * @see <a href="http://www.gnu.org/copyleft/gpl.html">License: GNU GPL v3 or later</a>
 */
public class SeleniumManager {
    //Make each Webdrivers driver accessable by all methods
    RemoteWebDriver driver = null;
    HtmlUnitDriver htmldriver = null;
    FirefoxDriver firefoxdriver = null;
    InternetExplorerDriver iedriver = null;
    ChromeDriver chromedriver = null;
    OperaDriver operadriver = null;
  //  IPhoneDriver iphonedriver = null;
    //AndroidDriver androiddriver = null;
/**
 * Run tests using the RemoteWebdriver.
 * Start Remotes, instantiating driver, desired capabilities are passed via variables from the test cases.
 * @param baseURL The base URL of the Selenium Server Grid hub.
// * @param browserType The browser type that the test will run in. See the Selenium API for details.
 * @throws MalformedURLException Catches an exception caused by a malformed URL. All URL's are malformed so this much be caught.
 */
//Remote WebDriver
    public void startRemotes(String baseURL) throws MalformedURLException {
        DesiredCapabilities capability = new DesiredCapabilities();
//        capability.setBrowserName("firefox");
//        capability.setJavascriptEnabled(true);
        capability.setCapability("browser", "FIREFOX_30_WINDOWS_8_64");
        capability.setCapability("apikey", "c717c5b3-a307-461e-84ea-1232d44cde89");
        capability.setCapability("email", "test@testfabrik.com");
        capability.setCapability("record", true);
        capability.setCapability("extract", true);
        driver = new RemoteWebDriver(new URL(baseURL),capability);

    }
/**
 * Constructor for the RemoteWebDriver.
 * @return Instantiates the driver instance in the test.
 */
    public RemoteWebDriver getRemoteDriver() {
        return driver;
    }
/**
 * Run tests using the HTML Unit driver.
 * @throws MalformedURLException Catches an exception caused by a malformed URL. All URL's are malformed so this much be caught.
 */
//HTMLUnit driver
    public void startHTMLUnit() throws MalformedURLException {
        htmldriver = new HtmlUnitDriver();
    }
/**
 * Constructor for the HTML Unit driver.
 * @return Instantiates the driver instance in the test.
 */
    public HtmlUnitDriver getHTMLUnitDriver() {
        return htmldriver;
    }
/**
 * Run tests using the Firefox driver.
 * @throws MalformedURLException Catches an exception caused by a malformed URL. All URL's are malformed so this much be caught. 
 */
//Firefox Driver
    public void startFirefoxDriver() throws MalformedURLException {
        FirefoxProfile profile = new FirefoxProfile();
        profile.setEnableNativeEvents(true);
        firefoxdriver = new FirefoxDriver(profile);
    }
/**
 * Constructor for the Firefox driver.
 * @return Instantiates the driver instance in the test.
 */
    public FirefoxDriver getFirefoxDriver() {
        return firefoxdriver;
    }
//Internet Explorer Driver
/**
 * Run tests using the Internet Explorer driver.
 * @throws MalformedURLException Catches an exception caused by a malformed URL. All URL's are malformed so this much be caught.
 */
    public void startIEDriver() throws MalformedURLException {
        iedriver = new InternetExplorerDriver();
    }
/**
 * Constructor for the IE driver.
 * @return Instantiates the driver instance in the test.
 */ 
    public InternetExplorerDriver getIEDriver() {
        return iedriver;
    }
//Google Chrome Driver
/**
 * Run test using the Chrome driver.
 * @throws MalformedURLException Catches an exception caused by a malformed URL. All URL's are malformed so this much be caught.
 */
    public void startChromeDriver(String chromeDriverLocation) throws MalformedURLException {
        System.setProperty("webdriver.chrome.driver", chromeDriverLocation);
        chromedriver = new ChromeDriver();
    }
/**
 * Constructor for the Chrome driver.
 * @return Instantiates the driver instance in the test.
 */ 
    public ChromeDriver getChromeDriver() {
        return chromedriver;
    }       
/**
 * Runs tests using the Opera driver.
 * @throws MalformedURLException Catches an exception caused by a malformed URL. All URL's are malformed so this much be caught.
 */
//Opera Driver
    public void startOperaDriver() throws MalformedURLException {
        operadriver = new OperaDriver();
    }
/**
 * Constructor for the Opera driver.
 * @return Instantiates the driver instance in the test.
 */ 
    public OperaDriver getOperaDriver() {
        return operadriver;
    }       
//IPhone Driver
/**
 * Runs tests using the IPhone driver.
 * @throws Exception
 */

//     public void startIPhoneDriver() throws Exception {
//         iphonedriver = new IPhoneDriver();
//     }
// /**
 // * Constructor for the IPhone driver.
 // * @return Instantiates the driver instance in the test.
 // */ 
 //    public IPhoneDriver getIPhoneDriver() {
 //        return iphonedriver;
 //    }
/**
 * Runs tests using the Android driver
 * @throws MalformedURLException Catches an exception caused by a malformed URL. All URL's are malformed so this much be caught.
 */
//Android Driver
//     public void startAndroidDriver() throws MalformedURLException {
//         androiddriver = new AndroidDriver();
//     }
// /**
//  * Constructor for the Android driver.
//  * @return Instantiates the driver instance in the test.
//  */ 
//     public AndroidDriver getAndroidDriver() {
//         return androiddriver;
//     }
/**
 * Close RemoteWebDriver and end test
 */
    public void teardown() {
        driver.quit();
    }
/**
 * Close HTMLUnitDriver and end test
 */
    public void teardownHTMLUnit() {
        htmldriver.quit();
    }
/**
 * Close FirefoxDriver and end test
 */
    public void teardownFirefox() {
        firefoxdriver.quit();
    }
/**
 * Close ChromeDriver and end test
 */
    public void teardownChrome() {
        chromedriver.quit();
    }
/**
 * Close IEDriver and end test
 */
    public void teardownIE() {
        iedriver.quit();
    }
/**
 * Close OperaDriver and end test
 */
    public void teardownOpera() {
        operadriver.quit();
    }
/**
 * Close IPhoneDriver and end test
 */
    // public void teardownIPhone() {
    //     iphonedriver.quit();
    // }
/**
 * Close AndroidDriver and end test
 */
    // public void teardownAndroid() {
    //     androiddriver.quit();
    // }
}
