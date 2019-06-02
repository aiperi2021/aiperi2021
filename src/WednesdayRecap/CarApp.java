package WednesdayRecap;

public class CarApp {
    public static void main(String[] args) {

        Vehicle hatchback = new Vehicle();
        hatchback.year = 2015;
        hatchback.brand = "Subaru";
        hatchback.miles = 123455;
        hatchback.model = "Legacy";
        hatchback.price = 5000;

        Vehicle suv = new Vehicle();

        suv.year = 2010;
        suv.brand = "Ford";
        suv.miles = 100000;
        suv.model = "Explorer";
        suv.price = 8000;

        Vehicle sedan = new Vehicle();
        sedan.year = 2018;
        sedan.brand = "Toyota";
        sedan.miles = 10005;
        sedan.model = "Camry";
        sedan.price = 17000;

        Vehicle truck = new Vehicle();

        truck.year = 2005;
        truck.brand = "Dodge";
        truck.miles = 75000;
        truck.model = "RM15000";
        truck.price = 4000;

        System.out.println("All vehicles in the lot: ");
        //                             0      1       2       3
        Vehicle [] vehiclesArr = {hatchback, suv, sedan, truck};

        for(int i = 0; i<vehiclesArr.length; i++){

            System.out.println("-----------------");
            System.out.println("Brand\t: " + vehiclesArr[i].brand);
            System.out.println("Year\t: " + vehiclesArr[i].year);
            System.out.println("Miles\t: " + vehiclesArr[i].miles);
            System.out.println("Model\t: " + vehiclesArr[i].model);
            System.out.println("Price\t: "+  vehiclesArr[i].price);
        }



    }
}
