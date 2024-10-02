package Ex1;

import java.util.Scanner;

public class Problema1 {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Lungime:");
        int lun=scanner.nextInt();
        System.out.print("Latime:");
        int lati=scanner.nextInt();
        int A=lun*lati;
        int P=2*lun+2*lati;

        System.out.println("Perimetru:"+P);
        System.out.println("Aria:"+A);
    }
}
