package basic;// 퀵정렬 기본 개념 - 오름차순 기준

public class QuickSort {

    public static void main(String[] args){
        int[] arr = {1,10,5,9,6,8,7,3,2,4};
//        int[] arr = {9,5,8,1,3,2,7,6,4};

        quickSort(arr,0,arr.length-1);

        for (int n : arr){
            System.out.print(n);
        }
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start >= end) return;

        int partition = partition(arr, start, end);

        quickSort(arr, start, partition-1);
        quickSort(arr, partition, end);
    }

    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start+end)/2];
        while(start <= end){
            while(arr[start] < pivot) start++;
            while(arr[end] > pivot) end--;
            if(start <= end){
                swap(arr, start,end);
                start++;
                end--;
            }
        }
        return start;
    }

    public static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }
}
