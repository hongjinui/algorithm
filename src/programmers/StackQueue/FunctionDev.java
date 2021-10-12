package programmers.StackQueue;

import java.util.*;

public class FunctionDev {

    public static void main(String[] args){

        int[] progresses = {93, 30, 55};
        int[] speeds     = {1, 30, 5};

//        int[] progresses = {95, 90, 99, 99, 80, 99};
//        int[] speeds     = {1, 1, 1, 1, 1, 1};
        int[] answer = solution(progresses,speeds);
//        for (int a : answer) System.out.print(a + ",");
    }

    public static int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};

        Queue<Integer> queue1 = new LinkedList<>();
        Queue<Integer> queue2 = new LinkedList<>();

        for(int i=0;i<progresses.length;i++){
            queue1.offer(progresses[i]);
            queue2.offer(speeds[i]);
        }

        

        return answer;

    }
}
