package LiveDemoIoT22;

import LiveDemoIoT22.Util.Mathematics;
import LiveDemoIoT22.Util.Printer;

public class Demoprogrammet {

    public void printer(String toPrint){
        System.out.println(toPrint);
    }

    public static void printer(String anotherString, int r){
        System.out.println(anotherString);
    }

    public static int adder(int a, int b){
        return a+b;
    }


    public static void main(String[] args) {
        Demoprogrammet dp = new Demoprogrammet();
        dp.printer( "hej");
        System.out.println(adder(4,5));


        Mathematics m = new Mathematics();
        int x = m.addToBaseline(4);
        System.out.println(x);

        Printer p = new Printer();
        Printer q = new Printer();

        p.print("Hej");

    }



}