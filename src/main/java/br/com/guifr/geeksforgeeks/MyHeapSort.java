package br.com.guifr.geeksforgeeks;

public class MyHeapSort {

    private static int swaps = 0;
    public void sort(int arr[])
    {
        int N = arr.length;

        int firstIndex = N - 1;
        while(firstIndex >= 0){
            heapify(arr, N, firstIndex);
            firstIndex = firstIndex - 2;
        }


        int maxHeap = N -1;
        while(maxHeap >= 0){
            int temp = arr[0];
            arr[0] = arr[maxHeap];
            arr[maxHeap] = temp;

            heapify(arr, maxHeap, 0);

            maxHeap--;
        }


    }

    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(int arr[], int N, int i)
    {
        int largest = i; // Initialize largest as root
        int l = i + 1; // left = 2*i + 1
        int r = i + 2; // right = 2*i + 2

        // If left child is larger than root
        if (l < N && arr[l] > arr[largest])
            largest = l;

        // If right child is larger than largest so far
        if (r < N && arr[r] > arr[largest])
            largest = r;

        // If largest is not root
        if (largest != i) {
            swaps++;
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[])
    {
        int N = arr.length;

        for (int i = 0; i < N; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver's code
    public static void main(String args[])
    {
//        int arr[] = { 12, 11, 13, 5, 6, 7 };
//        int arr[] = { 4,10,3,5,1 };
//        int arr[] = { 1,2,3,4,5 };
//        int arr[] = { 1,2,4,5 };
        int arr[] = { 4,10,3,5,1,9,8 };
        int N = arr.length;

        // Function call
        MyHeapSort ob = new MyHeapSort();
        ob.sort(arr);

        System.out.println("Sorted array is");
        printArray(arr);
        System.out.println("Swaps: " + swaps);
    }
}
