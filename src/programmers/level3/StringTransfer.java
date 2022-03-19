package programmers.level3;

import java.util.Stack;

public class StringTransfer {

    public static void main(String[] args){

        String begin = "hit";
        String target = "cog";
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};

        int result = solution(begin, target, words);

        System.out.println("result = " + result);

    }

    private static int solution(String begin, String target, String[] words){
        int answer = 0;
        int cnt = 0;
        String[] beginArr = begin.split("");
        String[] targetArr = target.split("");

        // target 존재유무 확인
        boolean isExist = false;
        for( String word : words ){
            if( word.equals(target) ) {
                isExist = true;
                break;
            }
        }
        if(!isExist) return 0;

        // 각 알파벳 ture/false
        boolean[] checked = new boolean[begin.length()];

//        Stack stack = new Stack();
        for (String s : words) {
            String[] word = s.split("");     //

            for (int j = 0; j < checked.length; j++) {

                if (!checked[j] && word[j].equals(targetArr[j])) {
                    beginArr[j] = targetArr[j];
                    checked[j] = true;
                    cnt++;
                    break;
                }
            }
            String beginJoin = String.join("", beginArr);
            String targetJoin = String.join("", targetArr);
            if (beginJoin.equals(targetJoin)) answer = cnt;

        }

        return answer+1;
    }

//    private int recursiveFn(String begin, String target, String[] words,int depth, boolean[] checked){
//        int result = 0;
//
//        for( int i=0; i<checked.length; i++ ){
//            if( !checked[i] ){
//                if( words[depth].equlae(target[i]) ) {
//                    begin[i] = target[i];
//                    checked[i] = true;
//                    return 1;
//                }
//            }
//
//            result += recursiveFn(begin, target, words, depth+1, checked);
//
//        }
//
//        return result;
//
//    }
}
