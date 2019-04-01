package cn.itcast.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void openFF() {
        System.setProperty("webdriver.gecko.driver", "E:\\Grid\\geckodriver.exe");
        WebDriver wd = new FirefoxDriver();
        wd.get("http://www.baidu.com");
        System.out.println("火狐浏览器启动了");
    }

    @Test
    public void openChrome() {
        System.setProperty("webdriver.chrome.driver", "E:\\Grid\\chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("http://www.baidu.com");
        System.out.println("谷歌浏览器启动了");
    }

    @Test
    public void openIE() {
        System.setProperty("webdriver.ie.driver", "E:\\Grid\\IEDriverServer.exe");
        WebDriver wd = new InternetExplorerDriver();
        wd.get("http://www.baidu.com");
        System.out.println("IE浏览器启动了");
    }

    @Test
    public void openEdge() {
        System.setProperty("webdriver.edge.driver", "E:\\Grid\\MicrosoftWebDriver.exe");
        WebDriver wd = new EdgeDriver();
        wd.get("http://www.baidu.com");
        System.out.println("edge浏览器启动了");
    }

    @Test
    public void openPhantom() {
        System.setProperty("phantomjs.binary.path", "E:\\Grid\\phantomjs.exe");
        WebDriver wd = new PhantomJSDriver();
        wd.get("http://www.baidu.com");
        System.out.println("phantomjs浏览器启动了");
    }
}
