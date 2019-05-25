package interfaces;

public class Chrome extends Browser implements Bookmark, Translator {

    @Override
    public void defMethod(){
        System.out.println("Overridden default method in Chrome");
    }

    @Override
    public void openBrowser() {
        System.out.println("Chrome is opening");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Chrome is closing");
    }

    @Override
    public void goToUrl(String url) {
        System.out.println("Chrome is going to: " + url);
    }

    @Override
    public void openNewTab(String url) {
        System.out.println("Chrome is open new tab and going: " + url);
    }

    @Override
    public void addUrlToBookmark() {
        System.out.println("Adding current URL to the Bookmark in Chrome");
    }

    @Override
    public void addUrlToBookmark(String url) {
        System.out.println("Adding to Bookmark: " + url);
    }

    @Override
    public void removeUrlFromBookmark() {
        System.out.println("Removing current URL from the Bookmark in Chrome");
    }

    @Override
    public void translate() {
        System.out.println("Chrome is translating the content of web page");
    }
}
