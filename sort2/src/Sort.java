import java.util.Arrays;

public class Sort {

    static int[] mergeArr = {7,6,5,8,3,5,9,1};
    public static void main(String[] args) {
        //1. 선택정렬 -> 가장 작은 것을 맨 앞으로 보낸다. N제곱
//        new Sort().selection_sort(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9});

        //2. 버블정렬 -> 옆에 있는 값과 비교하여 더 작은 값을 앞으로 보낸다. N제곱
//        new Sort().bubble_sort(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9});

        //3. 삽입정렬 -> 각 숫자를 적절한 위치에 삽입한다. N제곱
//        new Sort().insert_sort(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9});

        //4. 퀵정렬 -> 특정한 값을 기준으로 큰 숫자와 작은 숫자를 나눈다. N*logN
//        new Sort().quick_sort2(new int[]{1, 10, 5, 8, 7, 6, 4, 3, 2, 9}, 0, 9);

        //5. 병합정렬 -> 반으로 나누면서 나중에 합쳐서 정렬한다. N*logN (정렬할 데이터가 8개라면 3번만에 정렬가능 log28 = 3)
//        new Sort().mergeSort(mergeArr, 0, mergeArr.length - 1);

        //6. 힙정렬 -> 힙 트리 구조를 이용하는 정렬 방법이다. N
//        new Sort().heapSort(new int[]{7,6,5,8,3,5,9,1,6});

        //7. 계수정렬 -> 크기를 기준으로 갯수를 세어 정렬한다.
        new Sort().countingSort(new int[]{1,2,3,5,4,3,2,3,3,5,3,1,2,5,2,1,2,4,1,2,3,4,1,2});


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

    public void quick_sort2(int[] data, int start, int end) {

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

            quick_sort2(data, start, right - 1);
            quick_sort2(data, right + 1, end);

        }

    }

    public void merge_sort(int[] arr, int start, int middle, int end){

        int[] sorted = new int[arr.length];//정렬 배열
        int i = start;
        int j = middle + 1;
        int k = start;

        System.out.println("처음-> "+Arrays.toString(arr)+", start(i)-> "+i+", middle+1(j)-> "+j+", end-> "+end);
        System.out.println("처음 sorted-> "+Arrays.toString(sorted));

        //작은순서대로 배열에 삽입
        while (i <= middle && j <= end) {
            if (arr[i] <= arr[j]) {
                sorted[k] = arr[i];
                System.out.println("if@ while i-> "+arr[i] + " while j-> "+arr[j]);
                i++;
            } else {
                sorted[k] = arr[j];
                System.out.println("else@ while i-> "+arr[i] + " while j-> "+arr[j]);
                j++;
            }
            k++;
            System.out.println("in while-> "+Arrays.toString(sorted));
        }

        System.out.println("중간-> "+Arrays.toString(arr));
        System.out.println("중간 sorted-> "+Arrays.toString(sorted));

        //남은 데이터도 삽입
        if (i > middle) {
            for (int l = j; l <= end ; l++) {
                sorted[k] = arr[l];
                System.out.println("if@ -> "+arr[l]);
                k++;
            }
        } else {
            for (int l = i; l <= middle ; l++) {
                sorted[k] = arr[l];
                System.out.println("else@ -> "+arr[l]);
                k++;
            }
        }
        System.out.println("중간2 sorted-> "+Arrays.toString(sorted));

        //정렬된 배열 삽입
        for (int l = start; l <= end ; l++) {
            arr[l] = sorted[l];
        }
        System.out.println("마지막 arr-> "+Arrays.toString(arr));
        System.out.println("마지막 sorted-> "+Arrays.toString(sorted));

        System.out.println();
    }

    void mergeSort(int arr[], int m, int n){
        if (m < n) {
            int middle = (m + n) / 2;
            System.out.println("m-> "+m+", middle-> "+middle+" , n-> "+n);
            mergeSort(arr, m, middle); //왼쪽
            mergeSort(arr, middle+1, n);//오른쪽
            System.out.println("합치기 수행");
            merge_sort(arr, m, middle, n);
        }
    }


    void heapSort(int[] heap){
        System.out.println(Arrays.toString(heap));
        //전체 트리 구조를 최대힙 구조로 바꾸기
        for (int i = 1 ; i < heap.length; i++) {
            int index = i;

            while (index != 0) {
                int root = (index - 1) / 2;//부모 노드
                System.out.println("index-> "+index+" ,root-> "+root);
                System.out.println("교체전-> "+Arrays.toString(heap));
                if (heap[root] < heap[index]) {
                    int temp = heap[root];
                    heap[root] = heap[index];
                    heap[index] = temp;
                }
                System.out.println("교체후-> "+Arrays.toString(heap));
                index = root;
            }
        }

        System.out.println(Arrays.toString(heap));
        //크기를 줄여가며 반복적으로 힙을 구성
        for (int i = heap.length - 1; i >= 0 ; i--) {
            int temp = heap[0];
            heap[0] = heap[i];
            heap[i] = temp;

            int root = 0;
            int index = 1;

            System.out.println("i-> "+i);

            do {
                index = 2 * root + 1;
                System.out.println("index-> "+index);

                //자식들중에 더큰 값을 찾기
                if (heap[index] < heap[index+1] && index < i - 1){
                    index++;
                    System.out.println(index);
                }

                //루트보다 자식이 더 크다면 교환
                if (heap[root] < heap[index] && index < i) {
                    int temp1 = heap[root];
                    heap[root] = heap[index];
                    heap[index] = temp1;
                }
                root = index;
            } while (index < i);
        }

    }

    void countingSort(int[] arr){
        int[] countArr = new int[5];
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            countArr[arr[i] - 1]++;
        }

        System.out.println(Arrays.toString(countArr));
    }

}
