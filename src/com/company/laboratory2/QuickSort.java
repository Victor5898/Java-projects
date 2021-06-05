package com.company.laboratory2;
import java.util.Arrays;

public class QuickSort
{
    public int Array[];

    public long TimeElapsed(int[] tablou, int indexLeft, int indexRight)
    {
        long start = System.nanoTime();
        quickSort(tablou, indexLeft, indexRight);
        long end = System.nanoTime();
        return end - start;
    }

    public void output(int[] array, long exeTime)
    {
        System.out.println("Quick sort:");
        System.out.println("Tabloul sortat este: " + Arrays.toString(array));
        System.out.println("Timpul de executie in nanosecunde este: " + exeTime);
    }

    private void quickSort(int[] array, int indexLeft, int indexRight)
    {
        if(indexLeft >= indexRight)
        {
            return;
        }
        int pivotIndex = partition(array, indexLeft, indexRight);
        quickSort(array, indexLeft, pivotIndex - 1);
        quickSort(array, pivotIndex + 1, indexRight);
        Array = array;
    }

    public int partition(int[] array, int indexLeft, int indexRight)
    {

        int aux;
        int pivot = array[indexRight];
        int pivotIndex = indexLeft;
        for(int i = indexLeft; i < indexRight; i++)
        {
            if(pivot >= array[i])
            {
                aux = array[pivotIndex];
                array[pivotIndex] = array[i];
                array[i] = aux;
                pivotIndex++;
            }
        }
        aux = array[indexRight];
        array[indexRight] = array[pivotIndex];
        array[pivotIndex] = aux;
        return pivotIndex;
    }
}
