package basic;

public class QuickSort2 {
    public static void main(String[] args){
        int[] arr = {1,10,5,3,9,6,8,7,3,2,4};

        quickSort(arr,0,arr.length-1);

        for (int n : arr){
            System.out.println(n);
        }
    }

    public static void quickSort(int[] arr, int start, int end) {

        System.out.println("quickSort start");
        if(start >= end) return;

//        StringBuilder sb = new StringBuilder();

//        int pivot = start;
        int left = start+1;
        int right = end;
        int temp;

        while(left <= right){
            while(arr[start] >= arr[left] && left < end){
                left++;
            }
            while(arr[start] <= arr[right] && right > start){
                right--;
            }
            if(left >= right){
                temp = arr[right];
                arr[right] = arr[start];
                arr[start] = temp;
            }else{
                temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }

        }

        quickSort(arr, start, right-1);
        quickSort(arr, right+1, end);
    }
}
