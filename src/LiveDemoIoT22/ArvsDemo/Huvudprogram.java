package LiveDemoIoT22.ArvsDemo;

import java.util.ArrayList;
import java.util.List;

public class Huvudprogram {

    public Huvudprogram(){

        Fisk f1 = new Fisk("blubb", "gul", 1, "fiskmat", 100);
        Fisk f2 = new Fisk("blubb", "vit", 4, "fiskmat", 100);

        //Djur d = new Djur("gdfsgfsh", "brun", 19, "människor");

        Katt misse = new Katt("mjao", "vit", 4, "kattmat");

        Djur d1 = new Katt("mjao", "grå", 6, "fisk");

        System.out.println(f1.getFärg());

        List<Djur> allaDjur = List.of(f1, f2, misse, d1);

        for(Djur djur : allaDjur){
            System.out.println(djur.toString());
        }





    }


    public static void main(String[] args) {
        Huvudprogram hp = new Huvudprogram();
    }
}
