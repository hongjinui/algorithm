package programmers.level2;

import java.util.Collections;
import java.util.PriorityQueue;

public class MoreSpicy {

    public static void main(String[] args){

//        int[] scoville = {1, 2, 3, 9, 10, 12};
        int[] scoville = {1, 2};
        int K = 7;

        int result = solution(scoville, K);

        System.out.println("result = " + result);
    }

    private static int solution(int[] scoville, int K){

        int answer = 0;

        // 우선 순위 큐 - 최소 힙
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // 큐에 넣는다.
        for(int foodScoville : scoville){
            pq.offer(foodScoville);
        }

        while( pq.size() > 2 ){

            int first = pq.poll();
            int second = pq.poll();

            if( first >= K && second >= K ) return answer;

            int mixed = first + second * 2;

            pq.offer(mixed);

            answer++;

        }

        return answer;

    }

}
