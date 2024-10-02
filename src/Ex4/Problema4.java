package Ex4;

import java.util.Random;

public class Problema4 {
    public static void main(String[] args) {

        Random rand = new Random();
        int a = rand.nextInt(31);
        int b = rand.nextInt(31);
        System.out.println("a="+a);
        System.out.println("b="+b);
        int ok=0,i=0;
        if(a>b)
            i=a;
        else if(a<b)
            i=b;
        while (ok==0||i==1)
        {
            if(a%i==0 && b%i==0)
            {
                System.out.println("Cmmdc:"+i);
                ok=1;
                break;
            }

            i-=1;
        }
        if(i==1) {
            System.out.println("Unul dintre numere e prim");
        }
    }
}
