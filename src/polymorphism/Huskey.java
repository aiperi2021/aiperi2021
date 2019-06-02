package polymorphism;

public class Huskey extends Dog implements Trainable{

    @Override
    public void makeNoise(){
        System.out.println("Huskey is barking");
    }

    @Override
    public void eat(){
        System.out.println("Huskey is eating");
    }


    @Override
    public void sit() {
        System.out.println("Huskey is sitting");
    }

    @Override
    public void bring(String item) {
        System.out.println("Huskey is bringing " + item);
    }
}
