package Multitudes;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Person {

    @Test
    public void testMethod(){
        //presentColleaguesArray();
        presentColleaguesList();
    }

    public void presentColleaguesArray(){
        String[] colleagues = new String[5]; //5 stands for capacity not the index itself
        colleagues[0] = "Oana"; // always starts from 0
        colleagues[1] = "Alex";
        colleagues[2] = "Ruben";
        colleagues[3] = "Ioana";

        for(int i = 0; i < colleagues.length; i++){
            System.out.println(colleagues[i] + " is my colleague");
        }
    }

    //List
    public void presentColleaguesList(){
        List<String> colleagues = new ArrayList<>();
        colleagues.add("Alex");
        colleagues.add("Oana");
        colleagues.add("Ruben");
        //colleagues.add("Ioana");

        for(int i = 0; i < colleagues.size(); i++){
            System.out.println(colleagues.get(i) + " is my colleague");
        }

    }
}
