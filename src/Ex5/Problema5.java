package Ex5;

import java.util.Random;

public class Problema5 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a=rand.nextInt(21);
        System.out.println(a);
        int i=1,nr=0,ok=0,j=0;
        while(i<=a)
        {
            nr=i+j;

            if(nr==a)
            {
                System.out.println("Numarul apartine sirului lui Fibonacci");
                ok=1;
                break;
            }
            i=j;
            j=nr;

        }
        if(ok==0)
        {
            System.out.println("Numarul nu apartine sirului lui Fibonacci");
        }
    }
}
