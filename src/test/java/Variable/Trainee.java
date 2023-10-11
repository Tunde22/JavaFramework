package Variable;


import org.testng.annotations.Test;

public class Trainee {

    public String firstName;
    public String lastName;
    public int age;
    public double height;
    public float weight;
    public char sex;
    public boolean isGraduate;

    @Test
    public void showTrainee(){
        firstName = "Kelemen";
        lastName = "Noemi";
        age = 26;
        height = 1.66;
        //weight = (float)54.5;// considers it as a double
        weight = 54.5f;
        sex = 'F';//chars with single quotation mark
        isGraduate = true;

//        System.out.print("The Trainee's name is: ");
//        System.out.print(firstName + ' ');
//        System.out.print(lastName);
        System.out.println("The first name and last name of trainee is : " + firstName + ' ' + lastName);

    }
}
