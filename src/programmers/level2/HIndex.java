package programmers.level2;

import java.util.Arrays;

// 솔직히 잘 모르겠다

public class HIndex {

    public static void main(String[] args){

//        int[] citations = {3, 0, 6, 1, 5};
//        int[] citations = {1,1,1,1,1};
        int[] citations = {0,0,0,0,0};

        int result = solution(citations);

        System.out.println(result);

    }

    public static int solution(int[] citations){

        int answer = 0;

        // 배열 오름차순 정렬
        Arrays.sort(citations);

        for( int i=citations.length-1; i>-1; i--){
            if( citations[i] <= answer) break;
            answer++;
        }
        return answer;
    }
}
