package Polymorfism;

import org.testng.annotations.Test;

public class PolymorfismTest {

    @Test
    public void metodaTest(){
        Caine labrador = new Caine("Muki","labrador",8);
        labrador.faceSunet();

        Pisica european = new Pisica("Lilu","european",10);
        european.faceSunet();
        european.mananca();
        european.mananca("Chocolate");
        european.mananca(5);

    }
}
