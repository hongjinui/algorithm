package basic;// 퀵정렬 기본 개념 - 오름차순 기준

public class QuickSort {

    public static void main(String[] args){
        int[] arr = {1,10,5,3,9,6,8,7,3,2,4};

        quickSort(arr,0,arr.length-1);

        for (int n : arr){
            System.out.println(n);
        }
    }

    public static void quickSort(int[] arr,int start,int end){
        System.out.println("quickSort start");

        if(start >= end) return;

        // 배열의 가장 첫 번째 원소 피봇 선언
        int pivot = start;
        // pivot 다음 첫 번쨰 원소, pivot 보다 큰 수를 찾는 커서
        int left = start+1;
        // 배열의 끝, pivot 보다 작은 수를 찾는 커서
        int right = end;
        // 임시 값
        int temp;

        // left 인덱스보다 right 인덱스가 크거나 같을 때까지 루프
        while(left <= right){
            // pivot 값이 left 값보다 크거나 같고, left 인덱스가 end 보다 작을 때
            // left 인덱스 +1 해서 pivot 보다 큰 수를 다시 찾는다.
            while(arr[pivot] >= arr[left] && left < end){
                left++;
            }
            // pivot 값이 right 값보다 작거나 같고, right 인덱스가 start 보다 클 때
            // right 인덱스를 -1해서 pivot 보다 작을 수를 다시 찾는다.
            while(arr[pivot] <= arr[right] && right > start){
                right--;
            }
            // left 인덱스가 right 인덱스보다 크거나 같을 때 - 엇갈렸을 때
            // pivot 값과 right 값을 바꾼다.
            if(left >= right){
                temp = arr[pivot];
                arr[pivot] = arr[right];
                arr[right] = temp;
            }else {
            // left 인덱스가 right 인덱스보다 작을 때 - 엇갈리지 않았을 때
            // left 값과 right 값을 바꾼다.
                temp = arr[right];
                arr[right] = arr[left];
                arr[left] = temp;
            }
        }

        // while을 빠져나와 right 인덱스( pivot 값이 정렬됨)를 기준으로 재귀
        quickSort(arr, start, right-1);
        quickSort(arr, right+1, arr.length-1);


    }
}
