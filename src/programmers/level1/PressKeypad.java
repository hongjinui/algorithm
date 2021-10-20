package programmers.level1;

import java.util.HashMap;
import java.util.Map;

/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : [카카오 인턴] 키패드 누르기
 *   출    처 : https://programmers.co.kr/learn/courses/30/lessons/67256
 *   문제 유형 :
 *   -----------------------------------------------------------------------------------
 */
public class PressKeypad {

    public static void main(String[] args){

//        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
//        String hand = "right";
        int[] numbers = {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2};
        String hand = "left";
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
//        String hand = "right";

        String answer = solution(numbers,hand);

        System.out.println(answer);
    }

    public static String solution(int[] numbers, String hand) {
        StringBuilder answer = new StringBuilder();
        String r = "3,2";
        String l = "3,0";

        Map<Integer,String> map = new HashMap<>();

        int n = 1;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                map.put(n,i+","+j);
//                System.out.print(map.get(n) + " ");
                n++;
            }
//            System.out.println(" ");
        }
        map.put(0, "3,1");

        for(int num : numbers){

            // 키패드가 1,4,7 -> L
            if(num == 1 || num == 4 || num == 7){
                answer.append("L");
                l = map.get(num);
            // 키패드가 3,6,9 -> R
            }else if (num == 3 || num == 6 || num == 9){
                answer.append("R");
                r = map.get(num);
            }else{
            // 키패드가 2,5,8,0 -> 가까운 손
                String nearHand = chkNearHand(num,r,l,map);

                if(nearHand.equals("right")){
                    answer.append("R");
                    r = map.get(num);
                }else if (nearHand.equals("left")){
                    answer.append("L");
                    l = map.get(num);
                }else{
                    // 거리가 같다면 주 사용 손으로
                    if(hand.equals("right")){
                        answer.append("R");
                        r = map.get(num);
                    }else{
                        answer.append("L");
                        l = map.get(num);
                    }
                }
            }
        }

        return answer.toString();
    }

    private static String chkNearHand(int num, String r, String l,Map<Integer,String> map) {

        String nearHand = "";

        String numC = map.get(num);

        int rd = compareDistance(numC,r);
        int ld = compareDistance(numC,l);

        if( rd > ld ) nearHand = "left";
        else if( rd < ld ) nearHand = "right";
        else nearHand = "same";
        return nearHand;
    }

    // 두 점 사이의 거리 구하는 공식 -> x축 이동량 + y축 이동량으로 계산
    private static int compareDistance(String numC, String handC) {

//        double d = 0;
        int x = numC.charAt(0);
        int x1 = handC.charAt(0);
        int y = numC.charAt(numC.length()-1);
        int y1 = handC.charAt(handC.length()-1);
        int xd, yd;

        yd = (x-x1 >= 0) ?  x-x1 : Math.abs(x-x1);
        xd = (y-y1 >= 0) ?  y-y1 : Math.abs(y-y1);
//        d = Math.sqrt(yd+xd);

        return yd+xd;

    }
}
