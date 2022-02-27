package programmers.level1;

import java.util.*;

public class Marathon {

    public static void main(String[] args) {

//        String[] participant = {"leo", "kiki", "eden"};
//        String[] completion = {"eden", "kiki"};

//        String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
//        String[] completion = {"josipa", "filipa", "marina", "nikola"};

        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        String answer = solution(participant, completion);

        System.out.println(answer);

    }

    public static String solution(String[] participant, String[] completion) {
//        String answer = "";
//
//        Arrays.sort(participant);
//        Arrays.sort(completion);
//        int i;
//        for(i=0;i< completion.length;i++){
//            if(!participant[i].equals(completion[i])) return participant[i];
//        }
//        return answer;
        Map<String, Integer> map = new HashMap<>();
        String answer = "";

        for (String participantName : participant) {

            if (map.get(participantName) == null) {
                map.put(participantName, 1);
            } else {
                map.put(participantName, map.get(participantName) + 1);
            }
        }

        for( String completeName : completion ){
            if( map.get(completeName) != null ){
                map.put(completeName, map.get(completeName)-1);
            }
        }

        for( String key : map.keySet() ){
//            System.out.println(map.get(key));
            if (map.get(key) != 0 ) {
                answer = key;
                break;
            }
        }

        return answer;
    }
}


