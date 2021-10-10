package baekjoon.greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 이장님 초대
 *   정답 비율 : 65%
 *   -----------------------------------------------------------------------------------
 */
public class Q9237 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 묘목 수
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        // 묘목 수 만큼 크기의 배열 생성
        int[] arr = new int[n];

        int i = 0;
        // 묘목 자라나는 일 배열
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            arr[i++] = Integer.parseInt(st.nextToken());
        }
        // 퀵 정렬 - 내림차순
        quickSort(arr,0,arr.length-1);

        int maxValue = 0;

        for(int j=0;j<arr.length;j++){
            // 나무 심기가 1일 걸리기 때문에 +1
            if(maxValue < arr[j]+j+1) maxValue = arr[j]+j+1;
        }
        // 첫날 나무 구입한 날 + 1
        System.out.println(maxValue+1);
    }

    private static void quickSort(int[] arr, int start, int end) {
        if(start >= end) return;

        int partition = partition(arr,start,end);

        quickSort(arr, start, partition-1);
        quickSort(arr, partition, end);
    }

    private static int partition(int[] arr, int start, int end) {

        int pivot = arr[(start+end)/2];

        while(start <= end){
            while(arr[start] > pivot) start++;
            while(arr[end] < pivot) end--;
            if(start <= end){
                swap(arr,start,end);
                start++;
                end--;
            }
        }
        return start;
    }

    private static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

}
