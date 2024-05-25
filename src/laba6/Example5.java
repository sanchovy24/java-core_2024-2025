package laba6;
public class Example5 {
    public static int findMax(int[] arr) {
        int numThreads = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[numThreads];
        int[] maxes = new int[numThreads];

        for (int i = 0; i < numThreads; i++) {
            final int threadIndex = i;
            threads[i] = new Thread(() -> {
                int chunkSize = (arr.length + numThreads - 1) / numThreads;
                int start = threadIndex * chunkSize;
                int end = Math.min((threadIndex + 1) * chunkSize, arr.length);
                maxes[threadIndex] = findMaxInRange(arr, start, end);
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

        int maxValue = Integer.MIN_VALUE;
        for (int partialMax : maxes) {
            maxValue = Math.max(maxValue, partialMax);
        }

        return maxValue;
    }

    private static int findMaxInRange(int[] arr, int start, int end) {
        int max = Integer.MIN_VALUE;
        for (int i = start; i < end; i++) {
            max = Math.max(max, arr[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 7, 3, 8, 4, 6};
        int maxValue = findMax(arr);
        System.out.println("Максимальное значение: " + maxValue);
    }
}
