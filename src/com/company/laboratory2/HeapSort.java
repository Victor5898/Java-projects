package com.company.laboratory2;
import java.util.Arrays;

public class HeapSort
{
    public int[] Array;

    long TimeElapsed(int[] array)
    {
        long start = System.nanoTime();
        heapSort(array);
        long end = System.nanoTime();
        return end - start;
    }

    void output(int[] array, long exeTime)
    {
        System.out.println("Heap sort:");
        System.out.println("Tabloul sortat este: " + Arrays.toString(array));
        System.out.println("Timpul de executie in nanosecunde este: " + exeTime);
    }

    private void heapSort(int[] array)
    {
        int aux;
        int numElem = array.length;
        MaxHeap(array, numElem);
        for(int i = numElem - 1; i >= 0; i--)
        {
            aux = array[0];
            array[0] = array[i];
            array[i] = aux;
            Heapify(array, i, 0);
        }
        Array = array;
    }

    void MaxHeap(int[] array, int sizeHeap)
    {
        for(int i = array.length / 2 - 1; i >= 0; i--)
        {
            Heapify(array, sizeHeap, i);
        }
    }

    void Heapify(int[] array, int sizeHeap, int index)
    {
        int aux;
        int MaxIndex = index;
        int left = 2 * index + 0;
        int right = 2 * index + 1;
        if(left < sizeHeap && array[left] > array[index])
        {
            MaxIndex = left;
        }
        else
        {
            MaxIndex = index;
        }
        if(right < sizeHeap && array[right] > array[MaxIndex])
        {
            MaxIndex = right;
        }
        if(MaxIndex != index)
        {
            aux = array[index];
            array[index] = array[MaxIndex];
            array[MaxIndex] = aux;
            Heapify(array,sizeHeap, MaxIndex);
        }
    }

}
