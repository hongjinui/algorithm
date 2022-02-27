package programmers.level1;

import java.util.Arrays;

public class PhoneNumList {

    public static void main(String[] args){

        String[] phone_book = {"119", "97674223", "1195524421"};
//        String[] phone_book = {"123","456","789"};
        Boolean answer = solution(phone_book);

        System.out.println(answer);

    }

    public static boolean solution(String[] phone_book) {
        boolean answer = true;

        Arrays.sort(phone_book);

        for(int i=0;i<phone_book.length;i++){
                if(!phone_book[i+1].contains(phone_book[i])) {
                    answer = false;
                    break;
                }
        }

        return answer;
    }

}
