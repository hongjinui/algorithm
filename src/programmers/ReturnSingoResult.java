package programmers;

import java.util.*;

public class ReturnSingoResult {

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] id_list = {"con", "ryan"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
//        String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 2;
        int[] result = solution(id_list, report, k);

        System.out.println("    ");
        for (int i : result) {
            System.out.print(" " + i);
        }
        System.out.println("    ");

    }


    public static int[] solution(String[] id_list, String[] report, int k) {

        Map<String, Set<String>> badUserMap = new LinkedHashMap<>();
        Map<String, Integer> userMap = new LinkedHashMap<>();

        for(String id : id_list){
            userMap.put(id,0);
        }

        for( String rpt : report ){
            String[] rptArr = rpt.split(" ");
            String user = rptArr[0];
            String badUser = rptArr[1];

            if( !badUserMap.containsKey(badUser) ){
                badUserMap.put(badUser, new HashSet<>());
                badUserMap.get(badUser).add(user);
            }else{
                badUserMap.get(badUser).add(user);
            }
        }

        for( Map.Entry<String,Set<String>> e : badUserMap.entrySet()){
            if(e.getValue().size() >= 2){
                Set<String> set = badUserMap.get(e.getKey());
                for( String user : set ){
                    userMap.put(user, userMap.get(user)+1);
                }
            }
        }

        int[] answer = new int[id_list.length];

        for( int i=0; i<id_list.length; i++ ){
            answer[i] = userMap.get(id_list[i]);
        }

        return answer;

    }
//    public static int[] solution(String[] id_list, String[] report, int k) {
//
//        Set<String> set = new HashSet<>();
//        Map<String, Integer> rptCntMap = new HashMap<>();
//        Map<String, Integer> map = new LinkedHashMap<>();
//
//        List<Integer> list = new ArrayList<>();
//
//        for (String user : id_list) {
//            map.put(user,0);
//        }
//
//        // 신고 중복 제거
//        for (String rpt : report) {
//            set.add(rpt);
//        }
//
//        // 신고 당한 사람 카운팅
//        for (String rpt : set) {
//            String[] rptArr = rpt.split(" ");
//            String user = rptArr[0];
//            String badUser = rptArr[1];
//
//            if (!rptCntMap.containsKey(badUser)) {
//                rptCntMap.put(badUser, 1);
//            } else {
//                rptCntMap.put(badUser, rptCntMap.get(badUser) + 1);
//            }
//        }
//
//        for (String rpt : set) {
//            String[] rptArr = rpt.split(" ");
//            String user = rptArr[0];
//            String badUser = rptArr[1];
//
//            if( rptCntMap.get(badUser) >= 2){
//                map.put(user, map.get(user)+1);
//            }
//        }
//        int[] answer = new int[id_list.length];
//
//        for(Integer cnt : map.values()){
//            list.add(cnt);
//        }
//
//        for(int i=0; i<answer.length; i++){
//            answer[i] = list.get(i);
//        }
//        return answer;
//    }
}
