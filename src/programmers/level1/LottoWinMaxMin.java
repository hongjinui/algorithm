package programmers.level1;

import java.util.*;

public class LottoWinMaxMin {

    public static void main(String[] args){

        int[] lottos = {44, 1, 0, 0, 31, 25};
        int[] win_num  = {31, 10, 45, 1, 6, 19};

        int[] result = solution(lottos, win_num);

        for (int i : result) {
            System.out.print(" " + i);
        }

    }

    public static int[] solution(int[] lottos, int[] win_nums) {

        Map<Integer, Boolean> hashMap = new HashMap<>();

        int zeroCount = 0;
        for( int lotto : lottos ){
            if( lotto == 0 ){
                zeroCount++;
                continue;
            }
            hashMap.put(lotto, true);
        }

        int winCount = 0;
        for( int winNum : win_nums ){
            if( hashMap.containsKey(winNum) ){
                winCount++;
            }
        }

        int maxRank = 7 - ( zeroCount + winCount );
        int minRank = 7 - ( winCount );
        if(maxRank > 6) maxRank = 6;
        if(minRank > 6) minRank = 6;

        return new int[]{maxRank, minRank};

    }
}
