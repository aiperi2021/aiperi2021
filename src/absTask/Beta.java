package absTask;

public class Beta extends Baap {
    public int h = 44;

    public int getH() {
        System.out.println("Beta " + h);
        return h;
    }

    public static int m(){
        System.out.println("Hello");
        return 10;
    }

    public static void main(String[] args) {

        Baap b = new Beta();
//        String s = b.h + " " + b.getH();
        // 4 44
//        System.out.println(s);
        Beta bb = (Beta) b;
        System.out.println(bb.h + " " + bb.getH());
        // 44 44
    }
}
