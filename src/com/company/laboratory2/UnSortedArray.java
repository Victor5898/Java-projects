package com.company.laboratory2;
import java.util.Scanner;

public class UnSortedArray
{
    static int num;
    int[] UnsortedArrayInput(int[] Array)
    {
        char Case;
        Scanner sc = new Scanner(System.in);
        num = readNum(sc);
        int incr  = 0;
        Array = new int[num];
        System.out.println("Dati cazul pentru care se aleg valorile din array: r - random, f - cel mai favorabil, d - cel mai defavorabil");
        Case = sc.next().charAt(0);
        sc.close();
        System.out.println("Dati valorile din array: ");
        switch(Case)
        {
            case 'r':

                for(int i = 0; i < num; i++)
                {
                    Array[i] = (int)(Math.random() * ((num - 0) + 1)) + 0;
                }
                break;
            case 'f':
                for(int i = 0; i < num; i++)
                {
                    Array[i] = i;
                }
                break;
            case 'd':
                for(int i = num - 1; i >= 0; i--)
                {
                    Array[incr] = i;
                    incr++;
                }
                break;
        }
        return Array;
    }

    int readNum(Scanner sc)
    {
        int num;
        System.out.print("Dati numarul de elemente din array-ul nesortat: ");
        num = sc.nextInt();
        return num;
    }

    void UnsortedArrayOutput(int[] Array)
    {
        System.out.print("Se afiseaza array-ul nesortat: ");
        for(int i : Array)
        {
            System.out.print(i + " ");
        }
        System.out.println();
    }

}
