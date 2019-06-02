package polymorphism;

import java.util.ArrayList;

public class Shop {

    public static void main(String[] args) {
//        Animal huskey = new Animal();
        // Trainable, Animal, Object, Dog, Huskey.

//        huskey.bring("Remote controller");
//        huskey.sit();
//        ((Dog)huskey).bite();
//        huskey.bite();
        ArrayList<Animal> animals = new ArrayList<>();
        Animal a1 = new Dog();
        Cat c = new Cat();
        Huskey h = new Huskey();
        animals.add(a1);
        animals.add(c);
        animals.add(h);
        for (Animal a: animals) {
            a.makeNoise();
        }
    }
}
