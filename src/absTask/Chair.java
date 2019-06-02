package absTask;

public abstract class Chair {

    String model;
    String color;
    double weight;

    public abstract void sit();
    public abstract void stepOnIt();

    public void changeColor(String color){
        System.out.println("Color is changing to: " + color);
        this.color = color;
    }
}
