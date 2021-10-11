package baekjoon.greedy;


/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 스네이크버드
 *   정답 비율 : 69%
 *   출    처 : https://www.acmicpc.net/problem/16435
 *   -----------------------------------------------------------------------------------
 */

import java.io.*;
import java.util.StringTokenizer;

public class Q16435 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 입력 받은 과일 수
        int n = Integer.parseInt(st.nextToken());
        //과일 개수만큼 들어가는 배열
        int[] arr = new int[n];

        // 스네이크버듸 초기 길이
        int l = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()){
            // 과일 높이
            arr[i++] = Integer.parseInt(st.nextToken());
        }

        quickSort(arr,0,arr.length-1);

        for(int h : arr){
            if(l >= h) l++;
        }

        System.out.println(l);
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
