package interfaces;

public interface Bookmark {

    void addUrlToBookmark();

    void addUrlToBookmark(String url);

    public abstract void removeUrlFromBookmark();

     public default void defMethod(){
        System.out.println("This is default method from Bookmark");
    }

    public static void statMethod(){
        System.out.print("static method in Interface");
    }




}
