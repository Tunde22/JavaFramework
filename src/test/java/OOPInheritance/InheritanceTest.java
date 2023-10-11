package OOPInheritance;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class InheritanceTest {

    @Test
    public void testMethod(){
        List<String> asusOptions = new ArrayList<>();
        asusOptions.add("dunga led");
        asusOptions.add("tastatura internationala");
        asusOptions.add("camera web");
        Asus g14 = new Asus("Oled", "dreptunghiulara", "G144",999.99,asusOptions);

        g14.infoAsus();

        Lenovo thinkpad = new Lenovo("Oled", "dreptunghiulara", "Thinkpad",9979.99,"HDMI");
        thinkpad.infoLenovo();
    }




}
