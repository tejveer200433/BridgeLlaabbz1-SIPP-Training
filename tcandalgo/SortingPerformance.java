package tcandalgo;

import java.util.Arrays;
import java.util.Random;

public class SortingPerformance {

    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void mergeSort(int[] arr) {
        if (arr.length < 2) {
            return;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }

        mergeSort(left);
        mergeSort(right);

        merge(arr, left, right);
    }

    private static void merge(int[] arr, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        while (i < left.length) {
            arr[k++] = left[i++];
        }
        while (j < right.length) {
            arr[k++] = right[j++];
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 10000}; // 1,000,000 is too large for Bubble Sort test within reasonable time

        for (int N : datasetSizes) {
            int[] dataBubble = new int[N];
            int[] dataMerge = new int[N];
            int[] dataQuick = new int[N];
            Random random = new Random();

            for (int i = 0; i < N; i++) {
                int val = random.nextInt(N * 2);
                dataBubble[i] = val;
                dataMerge[i] = val;
                dataQuick[i] = val;
            }

            long startTime, endTime;

            System.out.println("Dataset Size (N): " + N);

            // Bubble Sort
            if (N <= 100000) { // Limit Bubble Sort for practical execution
                startTime = System.nanoTime();
                bubbleSort(dataBubble);
                endTime = System.nanoTime();
                System.out.println("Bubble Sort: " + (endTime - startTime) / 1_000_000 + "ms");
            } else {
                System.out.println("Bubble Sort: Unfeasible (>1hr)");
            }

            // Merge Sort
            startTime = System.nanoTime();
            mergeSort(dataMerge);
            endTime = System.nanoTime();
            System.out.println("Merge Sort: " + (endTime - startTime) / 1_000_000 + "ms");

            // Quick Sort
            startTime = System.nanoTime();
            quickSort(dataQuick, 0, dataQuick.length - 1);
            endTime = System.nanoTime();
            System.out.println("Quick Sort: " + (endTime - startTime) / 1_000_000 + "ms");
            System.out.println("--------------------");
        }
    }
}
