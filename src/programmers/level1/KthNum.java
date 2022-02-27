package programmers.level1;

import java.util.*;

public class KthNum {

    public static void main(String[] args){

        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        int[] result = solution(array, commands);

        for (int i : result) {
            System.out.println(" " + i);
        }



    }

    public static int[] solution(int[] array, int[][] commands){

        int[] answer = new int[commands.length];
        int[] reArr = new int[array.length+1];
        int anwIndex = 0;

        // 편의상 1번째부터 다시 세팅
        for( int i=0; i<reArr.length; i++){
            if( i == 0) reArr[i] = 0;
            else reArr[i] = array[i-1];
        }

        for( int[] command :  commands) {

            int from = command[0];
            int to   = command[1];
            int k    = command[2];

            if( from == to) {
                answer[anwIndex++] = reArr[from];
                continue;
            }

            int[] tempArr = new int[to-from+1];
            int index = 0;

            for( int i=from; i<=to; i++ ){
                tempArr[index++] = reArr[i];
            }
            Arrays.sort(tempArr);
            answer[anwIndex++] = tempArr[k-1];
        }
        return answer;

    }

}
