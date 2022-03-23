package com.Syntax.Class25;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following unimplemented behaviour: openBrowser(), closeBrowser(),
     maximizeWindow(), findElement(). Create 2 classes that implements WebDriver interface: ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
  class ChromeDriver implements WebDriver{

      @Override
      public void openBrowser() {
          System.out.println("open chrome browser");

      }

      @Override
      public void closeBrowser() {
          System.out.println("close chrome browser");

      }

      @Override
      public void maximizeWindow() {
          System.out.println("open chrome browser window");

      }

      @Override
      public void findElement() {
          System.out.println("find element chrome");

      }
  }
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("open firefox browser");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close firefox browser");


    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize firefox browser window");

    }

    @Override
    public void findElement() {
        System.out.println("find element firefox");

    }
}