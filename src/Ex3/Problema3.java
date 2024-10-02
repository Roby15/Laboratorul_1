package Ex3;

import java.util.Scanner;

public class Problema3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numarul:");
        int n = sc.nextInt();
        System.out.println("Divizori");
        for (int i = 2; i <=n/2; i++)
        {
            if(n % i == 0)
                System.out.println(i);
        }
    }
}
