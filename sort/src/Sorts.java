import java.util.Arrays;

public class Sorts {

    private static int[] input = {5, 6, 2, 8, 7, 23, 4, 1};

    public static void main(String[] args) {
        /*선택정렬
        System.out.println(Arrays.toString(input));
        selectionSort(input);
        System.out.println(Arrays.toString(input));*/

        System.out.println();

        /*버블정렬
        System.out.println("버블정렬-> "+Arrays.toString(input));
        bubbleSort(input);
        System.out.println("버블정렬-> "+Arrays.toString(input));*/

        System.out.println();

        /*삽입정렬
        System.out.println("삽입정렬-> "+Arrays.toString(input));
        insertionSort(input);
        System.out.println("삽입정렬-> "+Arrays.toString(input));*/

        //퀵 정렬
        System.out.println("퀵 정렬-> " + Arrays.toString(input));
        quickSort(input, 0, input.length - 1);
        System.out.println("퀵 정렬-> " + Arrays.toString(input));
    }

    private static void selectionSort(int[] input) {
        int max;
        int tmp;
        int length = input.length;

        for (int i = length - 1; i >= 0; i--) {

            max = i;

            for (int j = i - 1; j >= 0; j--) {
                if (input[j] > input[max]) {
                    max = j;
                }
            }
            tmp = input[i];
            input[i] = input[max];
            input[max] = tmp;
        }
    }

    private static void bubbleSort(int[] input) {
        int tmp;
        int length = input.length;
        for (int i = length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (input[j] > input[j + 1]) {
                    tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
        }
    }

    private static void insertionSort(int[] input) {
        int tmp;
        int length = input.length;

        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (input[j - 1] > input[j]) {
                    tmp = input[j - 1];
                    input[j - 1] = input[j];
                    input[j] = tmp;
                }
            }
        }
    }

    private static void quickSort(int[] input, int l, int r) {
        int left = l;
        int right = r;
        int pivot = input[(l + r) / 2];

        do {
            while (input[left] < pivot) left++;
            while (input[right] > pivot) right--;
            if (left <= right) {
                int temp = input[left];
                input[left] = input[right];
                input[right] = temp;
                left++;
                right--;
            }
        } while (left <= right);

        if (l < right) quickSort(input, l, right);
        if (r > left) quickSort(input, left, r);
    }


}
