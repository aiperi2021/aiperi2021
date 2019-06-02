package WednesdayRecap;

public class Student {

    String firstName; //belongs to the object of the class
    String lastName;
    static int studentCount; //belongs directly to the class itself  Student.studentCount
                // value =0;

    public Student(String firstName, String lName){

        this.firstName= firstName;
        lastName = lName;
        studentCount++;

        System.out.println("Added student: " + firstName + " " + lName);
        System.out.println("The number of students enrolled is: " + studentCount);


    }


}
