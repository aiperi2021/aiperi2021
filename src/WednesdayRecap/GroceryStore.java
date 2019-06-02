package WednesdayRecap;

public class GroceryStore {
    public static void main(String[] args) {

        Apple apple1 = new Apple(5, "big", "red", "sweet");
        Apple apple2 = new Apple(3, "medium", "yellow", "normal");
        Apple apple3 = new Apple(1, "small", "green", "like lemon");


        Apple [] applesArr = {apple1, apple2, apple3};

        System.out.println("Your apple specs are: ");

        for(int i=0; i<applesArr.length; i++){

            System.out.println("---------------------");
            System.out.println("Apple #" + (i+1));
            System.out.println("Weight\t :" + applesArr[i].weight);
            System.out.println("Size\t :" + applesArr[i].size);
            System.out.println("Color\t :" + applesArr[i].color);
            System.out.println("Taste\t :" + applesArr[i].taste);

        }




    }
}
