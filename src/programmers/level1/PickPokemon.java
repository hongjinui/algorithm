package programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class PickPokemon {

    public static void main(String[] args){

        int[] nums ={3,1,2,3};
//        int[] nums ={3,3,3,2,2,4};
//        int[] nums ={3,3,3,2,2,4};

        int result = solution(nums);

    }

    public static int solution(int[] nums){

        Set<Integer> set = new HashSet<>();
        int answer = 0;

        // 포케몬 중복 없이 걸러내기
        for( int num : nums){
            set.add(num);
        }

        // 포케몬 최대 종류 수
        int maxType = nums.length/2;

        if( set.size() > maxType ) answer = maxType;
        else answer = set.size();

        return answer;

    }
}
