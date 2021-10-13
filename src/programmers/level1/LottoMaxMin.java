package programmers.level1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 로또의 최고 순위와 최저 순위
 *   출    처 : https://programmers.co.kr/learn/courses/30/lessons/77484
 *   문제 유형 : 경우의 수 구하는 유형 해시문제인가?
 *   -----------------------------------------------------------------------------------
 */
public class LottoMaxMin {



    public static void main(String[] args){

//        int[] lottos = {44, 1, 0, 0, 31, 25};
//        int[] win_nums = {31, 10, 45, 1, 6, 19};

//        int[] lottos = {0, 0, 0, 0, 0, 0};
//        int[] win_nums = {38, 19, 20, 40, 15, 25};

//        int[] lottos = {45, 4, 35, 20, 3, 9};
//        int[] win_nums = {20, 9, 3, 45, 4, 35};

        int[] lottos = {1,2,3,4,5,6};
        int[] win_nums = {7,8,9,10,11,12};

        int[] answer = solution(lottos, win_nums);

        for(int a : answer) System.out.print(a + ", ");

    }
    // 다른 정답자 코드
    public static int[] solution(int[] lottos, int[] win_nums){

        Map<Integer, Boolean> map = new HashMap<>();
        int zeroCount = 0;

        for(int lotto : lottos){
            if(lotto == 0 ){
                zeroCount++;
                continue;
            }
            map.put(lotto, true);
        }

        int sameCount = 0;
        for(int winNum : win_nums){
            if(map.containsKey(winNum)) sameCount++;
        }

        int maxRank = 7 - (zeroCount + sameCount);
        int minRank = 7 - sameCount;
        if(maxRank > 6) maxRank =6;
        if(minRank > 6) minRank =6;

        return new int[]{maxRank,minRank};


    }

//    내 코드
//    public static int[] solution(int[] lottos,int[] win_nums ){
//        int[] answer = new int[2];
//        int zeroCnt = 0;
//        int winNumCnt = 0;
//        Set<Integer> set = new HashSet<>();
//        for(int i=0;i<lottos.length;i++){
//            // lottos 배열에 0 개수
//            if(lottos[i] == 0) zeroCnt++;
//            // 당첨 번호 set에 넣기
//            set.add(win_nums[i]);
//        }
//
//        for(int j=0;j<lottos.length;j++){
//            // 찍은 번호와 당첨 번호 같은 수
//            if( lottos[j] != 0 && set.contains(lottos[j])) winNumCnt++;
//        }
//
//        if( winNumCnt==0 && zeroCnt==0){
//            answer[0]=6;
//            answer[1]=6;
//        }else if( winNumCnt ==0 && zeroCnt!=0){
//            answer[0]= 7 - zeroCnt;
//            answer[1]= 6;
//        }else{
//            answer[0]= 7 - winNumCnt - zeroCnt;
//            answer[1]= 7 - winNumCnt;
//        }
//        return answer;
//    }
}
