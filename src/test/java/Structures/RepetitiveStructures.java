package Structures;

import org.testng.annotations.Test;

public class RepetitiveStructures {

    @Test
    public void testMethod(){
        showNumberFor();
        showNumbersWhile();
        showNumbersDoWhile();
    }

    public void showNumberFor(){
        System.out.println("For case");
        for(int i =0; i <= 10; i++){
            System.out.println("Current number is: " + i);
        }
    }
    public void showNumbersWhile(){
        System.out.println("While case");
        int i = 0;
        while (i <= 10){
            System.out.println("Current nr is: " + i);
            i++;
        }
    }
    public void showNumbersDoWhile(){
        System.out.println("Do While case");
        int i = 0;
        do {
            System.out.println("Current nr is: " + i);
            i++;
        } while (i <= 10);
    }
}
