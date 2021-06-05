package com.company.laboratory2;
import java.util.Arrays;


public class MergeSort
{
    public int[] Array;

    long TimeElapsed(int[] array)
    {
        long start = System.nanoTime();
        mergeSort(array);
        long end = System.nanoTime();
        return end - start;
    }

    void afisare(int[] array, long exeTime)
    {
        System.out.println("Merge sort:");
        System.out.println("Tabloul sortat este: " + Arrays.toString(array));
        System.out.println("Timpul de executie in nanosecunde este: " + exeTime);
    }

    private void mergeSort(int[] array)
    {
        int numElem = array.length;
        if(numElem < 2)
        {
            return;
        }
        int middle = numElem / 2;
        int[] left = new int[middle];
        for(int i = 0; i < middle; i++)
        {
            left[i] = array[i];
        }
        int[] right = new int[numElem - middle];
        for(int i = middle; i < numElem; i++)
        {
            right[i - middle] = array[i];
        }
        mergeSort(left);
        mergeSort(right);
        Merge(left, right, array);
        Array = array;
    }

    void Merge(int[] left, int[] right, int[] array)
    {
        int i = 0, j = 0, k = 0;
        while(i < left.length && j < right.length)
        {
            if(left[i] <= right[j])
            {
                array[k] = left[i];
                i++;
                k++;
            }
            else
            {
                array[k] = right[j];
                j++;
                k++;
            }
        }
        while(i < left.length)
        {
            array[k] = left[i];
            i++;
            k++;
        }
        while(j < right.length)
        {
            array[k] = right[j];
            j++;
            k++;
        }
    }

}
