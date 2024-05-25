package laba6;
import java.util.Random;
public class Example6 {
    public static int sumArray(int[] arr) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numThreads];
        int[] sums = new int[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int chunkSize = (arr.length + numThreads - 1) / numThreads;
                int start = threadIndex * chunkSize;
                int end = Math.min((threadIndex + 1) * chunkSize, arr.length);
                sums[threadIndex] = sumInRange(arr, start, end);
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        int totalSum = 0;
        for (int partialSum : sums) {
            totalSum += partialSum;
        }

        return totalSum;
    }

    private static int sumInRange(int[] arr, int start, int end) {
        int sum = 0;
        for (int i = start; i < end; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 8, 4, 6};
        int totalSum = sumArray(arr);
        System.out.println("Сумма элементов массива: " + totalSum);


    }
}