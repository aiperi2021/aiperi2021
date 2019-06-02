package polymorphism;

public class AnimalShop {

    public static void main(String[] args) {
        Animal a = new Dog();
        // Dog, Animal, Object
        // Casting
        Dog d = (Dog)a;
        d.bite();
        Huskey h = (Huskey)a;
        h.sit();

        Huskey hh = new Huskey();
        Animal aa = hh;
        // aa --> Animal --> Access to Animal class.
        // hh --> Huskey --> Access to Huskey class.
        Animal ad = (Animal)new Dog();
    }
}
