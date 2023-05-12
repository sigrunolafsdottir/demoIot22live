package LiveDemoIoT22.ThowsDemo;

import java.util.Scanner;

public class ThrowsLiveDemo {

    Scanner sc= new Scanner(System.in);

    public int divider(int x, int y) throws ArithmeticException{
        return x/y;
    }

    public ThrowsLiveDemo() throws DivideByZeroException {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (y == 0){
            throw new DivideByZeroException("y cannot be 0");
        }

 /*       try{
            int z = divider(x,y);
            System.out.println("Det blev "+z);
        }
        catch(ArithmeticException e){
            throw e;
            //e.printStackTrace();
        }
*/


    }


    public static void main(String[] args) throws DivideByZeroException {
        ThrowsLiveDemo t = new ThrowsLiveDemo();
    }

}
