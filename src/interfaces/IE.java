package interfaces;

public class IE extends Browser{

    public static void someIEMethod(){
        System.out.println("test");
        Bookmark.statMethod();
    }

    @Override
    public void openBrowser() {
        System.out.println("IE is opening not too fast");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing IE ");
    }

    @Override
    public void goToUrl(String url) {
        System.out.println("Going to URL on IE: " + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("IE is opening new Tab: " + url);
    }
}
