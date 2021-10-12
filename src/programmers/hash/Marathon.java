package programmers.hash;

import java.util.*;

public class Marathon {

    public static void main(String[] args){

//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};

//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = solution(participant,completion);

        System.out.println(answer);

    }

    public static String solution(String[] participant, String[] completion) {
        String answer = "";

        Arrays.sort(participant);
        Arrays.sort(completion);
        int i;
        for(i=0;i< completion.length;i++){
            if(!participant[i].equals(completion[i])) return participant[i];
        }
        return answer;
    }
}


