package StaticKeyword;

import org.testng.annotations.Test;

public class StaticTest {

    @Test
    public void metodaTest(){

        Elev noemi = new Elev("Kelemen","Noemi",26);
        System.out.println(noemi.toString());

        Elev ruben = new Elev("Ivan","Ruben",28);
        System.out.println(ruben.toString());



    }
}
