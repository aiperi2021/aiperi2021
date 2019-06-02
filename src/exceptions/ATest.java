package exceptions;

public class ATest {

    String global = "111";

    public int parse(String arg){
        int value = 0;
        try{
            String global = arg;
            value = Integer.parseInt(global);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getClass());
        }
        System.out.print(global+" "+value+" ");
        return value;
    }
    public static void main(String[] args) {
        ATest ct = new ATest();
        System.out.print(ct.parse("3a33"));
    }
}
