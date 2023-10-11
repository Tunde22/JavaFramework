package Objects;

import org.testng.annotations.Test;

public class MasinaFabricaTest {

    @Test
    public void metodaTest(){
        MasinaFabrica audiA3 = new MasinaFabrica("Audi","A3",
                2023,"electrica","mov");
        audiA3.prezentareMasina();

        MasinaFabrica bmwSeria1 = new MasinaFabrica("BMW","Seria1",
                2023,"benzina","negru");
        bmwSeria1.prezentareMasina();

        MasinaFabrica volvoV40 = new MasinaFabrica("Volvo","V40",2024,
                "Hybrid","alb",20000);

    }
}
