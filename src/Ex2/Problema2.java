package Ex2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problema2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src/Ex2/in.txt"));
        int i=0,nr,max=0,min=0,S=0;
        while (sc.hasNextLine()) {
            nr=sc.nextInt();
            if(max<nr)
                max=nr;
            if(i==0)
                min=nr;
            if(min>nr)
                min=nr;
            S+=nr;
            i+=1;
        }
        float Ma=(float) S/i;
        System.out.println("Media aritmetica:"+Ma);
        System.out.println("Suma:"+S);
        System.out.println("Maximul:"+max);
        System.out.println("Minimul:"+min);
    }
}
