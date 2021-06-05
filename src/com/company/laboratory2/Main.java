package com.company.laboratory2;

public class Main
{
    public static void main(String args[])
    {
        UnSortedArray unsorted = new UnSortedArray();
        int[] Array = new int[0];
        Array = unsorted.UnsortedArrayInput(Array);
        unsorted.UnsortedArrayOutput(Array);

        MergeSort mergsort = new MergeSort();
        long exeTime = mergsort.TimeElapsed(Array);
        mergsort.afisare(Array, exeTime);

        QuickSort quick = new QuickSort();
        exeTime = quick.TimeElapsed(Array, 0, unsorted.num - 1);
        quick.output(Array, exeTime);

        HeapSort heap = new HeapSort();
        exeTime = heap.TimeElapsed(Array);
        heap.output(Array, exeTime);
    }

}
