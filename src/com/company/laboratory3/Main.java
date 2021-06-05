package com.company.laboratory3;
import java.util.Scanner;

public class Main
{
    static int num_iterations1 = 0;
    static int num_iterations2 = 0;
    static int num_iterations3 = 0;

    static long fib1(int num)
    {
        num_iterations1++;

        if(num<2)
        {
            return num;
        }
        else
        {
            return fib1(num-1) + fib1(num-2);
        }
    }

    static long fib2(int num)
    {
        long i = 1;
        long j = 0;
        for(int k = 0; k < num; k++)
        {
            j = i + j;
            i = j - i;
            num_iterations2++;
        }
        return j;
    }

    static long fib3(int num)
    {
        long i, j, k, h, t;
        i = 1;
        j = 0;
        k = 0;
        h = 1;
        while(num > 0)
        {
            if(num % 2 != 0)
            {
                t = j * h;
                j = i * h + j * k + t;
                i = i * k + t;
            }
            t = h * h;
            h = 2 * k * h + t;
            k = k * k + t;
            num = num / 2;

            num_iterations3++;
        }
        return j;
    }

    public static void main(String args[])
    {
        int n;
        long rezult1, rezult2, rezult3;
        System.out.println("Dati numarul pozitiei numarului din sirul lui Fibonacci: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        sc.close();

        rezult1 = fib1(n);
        System.out.println("Metoda cu complexiate recursiva: ");
        System.out.println("Numarul de pe pozitia " + n + " din sirul lui Fibonacci este " + rezult1);
        System.out.println("Numarul de iteratii este: " + num_iterations1);
        System.out.println();

        rezult2 = fib2(n);
        System.out.println("Metoda cu complexiate liniara: ");
        System.out.println("Numarul de pe pozitia " + n + " din sirul lui Fibonacci este " + rezult2);
        System.out.println("Numarul de iteratii este: " + num_iterations2);
        System.out.println();

        rezult3 = fib3(n);
        System.out.println("Metoda cu complexiate logaritmica: ");
        System.out.println("Numarul de pe pozitia " + n + " din sirul lui Fibonacci este " + rezult3);
        System.out.println("Numarul de iteratii este: " + num_iterations3);
        System.out.println();
    }
}
