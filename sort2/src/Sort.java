import java.util.Arrays;

public class Sort {

    public static void main(String[] args) {
        //1. 선택정렬 -> 가장 작은 것을 맨 앞으로 보낸다. N제곱
//        new Sort().selection_sort(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9});

        //2. 버블정렬 -> 옆에 있는 값과 비교하여 더 작은 값을 앞으로 보낸다. N제곱
//        new Sort().bubble_sort(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9});

        //3. 삽입정렬 -> 각 숫자를 적절한 위치에 삽입한다. N제곱
//        new Sort().insert_sort(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9});

        //4. 퀵정렬 -> 특정한 값을 기준으로 큰 숫자와 작은 숫자를 나눈다. N*logN
        new Sort().quick_sort2(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9}, 0, 9);
    }

    public void selection_sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        //오름차순
/*        int temp;
        int minIndex = 0;
        int min;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (min > arr[j]) {
                    min = arr[j];
                    minIndex = j;
                }
            }
            temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }*/

        int temp;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void bubble_sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        //오름차순
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public void insert_sort(int[] arr) {
        System.out.println(Arrays.toString(arr));
        //오름차순
/*        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int j = i;
            while (arr[j] > arr[j+1]){
                temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                j--;
            }
        }
        */
        int temp;
        int j;
        for (int i = 1; i < arr.length; i++) {
            temp = arr[i];
            for (j = i-1; j >= 0 && arr[j] > temp; j--) {
                arr[j+1] = arr[j];
            }
            arr[j+1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

/*    public void quick_sort(int[] arr, int start, int end){
        System.out.println(Arrays.toString(arr));

        if (start >= end){ //원소가 1개인 경우
            return;
        }

        int key = start;//키는 첫번째 원소 (피벗)
        int i = start + 1;
        int j = end;
        int temp;

        while (i <= j){ //엇갈릴 때까지 반복
            while (arr[i] <= arr[key]){//키 값보다 큰값을 만날 때까지
                i++;
            }
            while (arr[j] >= arr[key] && j > start){//키 값보다 작은 값을 만날 때까지
                j--;
            }

            if (i > j) {//현재 엇갈린 상태면 키 값과 교체
                temp = arr[j];
                arr[j] = arr[key];
                arr[key] = temp;
            } else{
                temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        quick_sort(arr, start, j-1);
        quick_sort(arr, j+1, end);


        System.out.println(Arrays.toString(arr));
    }*/

    public static void quick_sort2(int[] data, int start, int end) {

        if (start >= end) {
            // 원소가 1개인 경우
            return;
        }

        int pivot = start;
        int left = pivot + 1;
        int right = end;
        int temp;

        while (left < right) {
            while (left <= end && data[left] < data[pivot]) {
                left++;
            }
            while (right >= pivot && data[pivot] < data[right]) {
                right--;
            }

            if (left < right) {
                temp = data[left];
                data[left] = data[right];
                data[right] = temp;
            } else {
                temp = data[pivot];
                data[pivot] = data[right];
                data[right] = temp;
            }

            System.out.println(Arrays.toString(data));
            quick_sort2(data, start, right - 1);
            quick_sort2(data, right + 1, end);

        }

    }



}
