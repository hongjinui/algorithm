package programmers.level1;

import java.util.*;

public class MathGiverAnswer {

    public static void main(String[] args){

        int[] answers = {1,2,3,4,5};

        int[] result = solution(answers);

        for (int i : result) {
            System.out.println(i);
        }

    }

    public static int[] solution(int[] answers){


        // 수포자1 정답 패턴
        int[] mathGiver1AnswerPattern = {1,2,3,4,5};
        // 수포자2 정답 패턴
        int[] mathGiver2AnswerPattern = {2,1,2,3,2,4,2,5};
        // 수포자3 정답 패턴
        int[] mathGiver3AnswerPattern = {3,3,1,1,2,2,4,4,5,5};

        int mathGiver1AnswerCnt = 0;
        int mathGiver2AnswerCnt = 0;
        int mathGiver3AnswerCnt = 0;
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        // map.put(1,0);
        // map.put(2,0);
        // map.put(3,0);

        // 채점
        for( int i=0; i<answers.length; i++ ){
            int mathGiver1Answer = mathGiver1AnswerPattern[i%5];
            int mathGiver2Answer = mathGiver2AnswerPattern[i%8];
            int mathGiver3Answer = mathGiver3AnswerPattern[i%10];

            if( answers[i] == mathGiver1Answer ) mathGiver1AnswerCnt++;
            if( answers[i] == mathGiver2Answer ) mathGiver2AnswerCnt++;
            if( answers[i] == mathGiver3Answer ) mathGiver3AnswerCnt++;

            // if( answers[i] == mathGiver1Answer ) map.put(1, map.get(1)+1);
            // if( answers[i] == mathGiver2Answer ) map.put(2, map.get(2)+1);
            // if( answers[i] == mathGiver3Answer ) map.put(3, map.get(3)+1);
        }

        // 최대 수 구하기
        // int max = 1;
        // if( map.get(max) < map.get(2) ) max = 2;
        // if( map.get(max) < map.get(3) ) max = 3;
        int max = mathGiver1AnswerCnt;
        if( max < mathGiver2AnswerCnt ) max = mathGiver2AnswerCnt;
        if( max < mathGiver3AnswerCnt ) max = mathGiver3AnswerCnt;

        //
        List<Integer> list = new ArrayList<>();
        if( max == mathGiver1AnswerCnt) list.add(1);
        if( max == mathGiver2AnswerCnt) list.add(2);
        if( max == mathGiver3AnswerCnt) list.add(3);


        int[] answer = new int[list.size()];

        for( int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }

        return answer;

    }

}
