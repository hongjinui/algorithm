package programmers.level1;


/*
 *   -----------------------------------------------------------------------------------
 *   문제 제목 : 신규 아이디 추천
 *   출    처 : https://programmers.co.kr/learn/courses/30/lessons/72410
 *   문제 유형 : 자바 정규 표현식 문제
 *   -----------------------------------------------------------------------------------
 */
public class NewIDRecommend {

    public static void main(String[] args){

        String new_id = "123_.def";

        solution(new_id);

    }

    public static String solution(String new_id) {
        String answer = "";

        // 1단계, 2단계
        new_id = new_id.toLowerCase()
                .replaceAll("[^a-z0-9-_.]*", "")
                .replaceAll("\\.{2,}", ".")
                .replaceAll("^[.]|[.]$", "");

        if(new_id.equals("")) {
            new_id="a";
        }
        else if (new_id.length() >= 16){
            new_id = new_id.substring(0,15).replaceAll("[.]$", "");
        }

        while(new_id.length() <= 2){
            new_id += new_id.charAt(new_id.length()-1);
        }

        System.out.println('\"' +new_id +'\"');

        return "\""+answer + "\"";
    }

}
