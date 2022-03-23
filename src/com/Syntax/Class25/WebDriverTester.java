package com.Syntax.Class25;

public class WebDriverTester {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
       driver.openBrowser();
       driver.closeBrowser();
       driver.maximizeWindow();
       driver.findElement();

       WebDriver driver2=new FirefoxDriver();
       driver2.openBrowser();
       driver2.maximizeWindow();
       driver2.closeBrowser();
       driver2.closeBrowser();
    }


    }


