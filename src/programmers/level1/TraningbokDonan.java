package programmers.level1;

import java.util.*;

public class TraningbokDonan {

    public static void main(String[] args){

        int n = 5;
        int[] lost = {2,4};
        int[] reserve = {3,5};

        int result = solution(n,lost, reserve);



    }


    public static int solution(int n, int[] lost, int[] reserve){

        int answer = 0;
        Map<Integer, Boolean> students = new HashMap<>();
        Set<Integer> lostSet = new HashSet<>();

        // 학생
        for( int i=1; i<=n; i++ ){
            students.put(i, true);
        }

        // 체육복 도난 당한 학생 false로 변경
        for( int j=0; j<lost.length; j++ ){
            students.put(lost[j],false);
            lostSet.add(lost[j]);
        }

        // 여벌있는 학생이 다른 학생에게 빌려주기
        for( int k=0; k<reserve.length; k++ ){

            // 도난당했지만 여벌있는 학생
            if( lostSet.contains(reserve[k]) ) {
                students.put(reserve[k],true);
                continue;
            }

            int front = reserve[k]-1;
            int back = reserve[k]+1;

            // 앞에 학생이 있고 체육복이 없으면
            if( front > 0 && !students.get(front) ){
                students.put(front, true);
                // 뒤에 학생이 있고 체육복이 없으면
            }else if ( back < n && !students.get(back) ){
                students.put(back, true);
            }
        }

        int studentsCnt = 0;
        for(int i=1; i<=n; i++){
            if( students.get(i) ) studentsCnt++;
        }

        answer = studentsCnt;

        return answer;

    }
}
