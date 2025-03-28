package latihan3;

import java.util.Arrays;

public class SortingAlgorithms {

    // Fungsi untuk menampilkan array setiap iterasi
    public static void printArray(int[] arr, int step) {
        System.out.print("Iterasi " + step + ": ");
        System.out.println(Arrays.toString(arr));
    }

    // 1. ini untuk Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int step = 1;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    printArray(arr, step++);
                }
            }
        }
    }

    // 2. ini untuk Quick Sort
    public static void quickSort(int[] arr, int low, int high, int[] step) {
        if (low < high) {
            int pi = partition(arr, low, high, step);
            quickSort(arr, low, pi - 1, step);
            quickSort(arr, pi + 1, high, step);
        }
    }

    private static int partition(int[] arr, int low, int high, int[] step) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                printArray(arr, step[0]++);
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        printArray(arr, step[0]++);
        return i + 1;
    }

    // 3. Ini untuk Insertion Sort
    public static void insertionSort(int[] arr) {
        int step = 1;
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
                printArray(arr, step++);
            }
            arr[j + 1] = key;
            printArray(arr, step++);
        }
    }

    // 4. ini Untuk Selection Sort
    public static void selectionSort(int[] arr) {
        int step = 1;
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
            printArray(arr, step++);
        }
    }

    // 5. Ini untuk Merge Sort
    public static void mergeSort(int[] arr, int left, int right, int[] step) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid, step);
            mergeSort(arr, mid + 1, right, step);
            merge(arr, left, mid, right, step);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right, int[] step) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];

        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int i = 0; i < n2; i++) R[i] = arr[mid + 1 + i];

        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) arr[k++] = L[i++];
            else arr[k++] = R[j++];
        }

        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
        
        printArray(arr, step[0]++);
    }

    // Main function to run sorting algorithms
    public static void main(String[] args) {
        int[] data = {7, 1, 3, 5, 2};

        System.out.println("Bubble Sort:");
        bubbleSort(data.clone());

        System.out.println("\nQuick Sort:");
        int[] step = {1};
        quickSort(data.clone(), 0, data.length - 1, step);

        System.out.println("\nInsertion Sort:");
        insertionSort(data.clone());

        System.out.println("\nSelection Sort:");
        selectionSort(data.clone());

        System.out.println("\nMerge Sort:");
        step[0] = 1;
        mergeSort(data.clone(), 0, data.length - 1, step);
    }
}
