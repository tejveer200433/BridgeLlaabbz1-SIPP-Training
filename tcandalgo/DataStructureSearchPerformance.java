package tcandalgo;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.TreeSet;

public class DataStructureSearchPerformance {

    public static int arraySearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static boolean hashSetSearch(HashSet<Integer> set, int target) {
        return set.contains(target);
    }

    public static boolean treeSetSearch(TreeSet<Integer> set, int target) {
        return set.contains(target);
    }

    public static void main(String[] args) {
        int[] datasetSizes = {1000, 100000, 1000000};
        Random random = new Random();

        for (int N : datasetSizes) {
            int[] dataArray = new int[N];
            HashSet<Integer> dataHashSet = new HashSet<>();
            TreeSet<Integer> dataTreeSet = new TreeSet<>();

            for (int i = 0; i < N; i++) {
                int val = random.nextInt(N * 2);
                dataArray[i] = val;
                dataHashSet.add(val);
                dataTreeSet.add(val);
            }
            int target = dataArray[random.nextInt(N)]; // Target an existing element

            long startTime, endTime;

            System.out.println("Dataset Size (N): " + N);

            // Array Search
            startTime = System.nanoTime();
            arraySearch(dataArray, target);
            endTime = System.nanoTime();
            System.out.println("Array Search (O(N)): " + (endTime - startTime) / 1_000_000 + "ms");

            // HashSet Search
            startTime = System.nanoTime();
            hashSetSearch(dataHashSet, target);
            endTime = System.nanoTime();
            System.out.println("HashSet Search (O(1)): " + (endTime - startTime) / 1_000_000 + "ms");

            // TreeSet Search
            startTime = System.nanoTime();
            treeSetSearch(dataTreeSet, target);
            endTime = System.nanoTime();
            System.out.println("TreeSet Search (O(log N)): " + (endTime - startTime) / 1_000_000 + "ms");
            System.out.println("--------------------");
        }
    }
}
