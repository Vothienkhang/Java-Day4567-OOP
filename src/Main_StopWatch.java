import java.util.Random;

public class Main_StopWatch {
    public static void main(String[] args) {
        int size = 100000;
        int[] arr = new int[size];
        Random random = new Random();

        // Tạo mảng 100,000 số ngẫu nhiên
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(size);
        }

        StopWatch sw = new StopWatch();

        sw.start();
        selectionSort(arr);
        sw.stop();

        System.out.println("Elapsed time: " + sw.getElapsedTime() + " ms");
    }
        // Method Selection Sort
        public static void selectionSort(int[] arr) {
            for (int i = 0; i < arr.length - 1; i++) {
                int min = i;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[min]) {
                        min = j;
                    }
                }

                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
            }
        }
    }
