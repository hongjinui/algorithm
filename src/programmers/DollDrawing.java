package programmers;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class DollDrawing {

    public static void main(String[] args){

        int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
        int[] moves = {1,5,3,5,1,2,1,4};

        solution(board,moves);

    }

    public static int solution(int[][] board, int[] moves) {

        Map<Integer, Stack<Integer>> map = new HashMap<>();
        Stack<Integer> baguni = new Stack<>();
        int answer = 0;

        for(int i=1; i<=board.length; i++){
            // 라인별로 스택 생성
            map.put(i, new Stack<Integer>());
        }


        // N개 만큼 스택이 생김
//        for(int i=0; i<board.length; i++){
//            for(int j=0; j<board[i].length; j++){
//                if( board[i][j] != 0 ){
////                    map.put(j+1, map.get(j+1).add(board[i][j]));
//                    map.get(j+1).add(board[i][j]);
//                }
//            }
//        }

        // N개 만큼 스택이 생김
        for(int i=board.length-1; i>0; i--){
            for(int j=0; j<board[i].length; j++){
                if( board[i][j] != 0 ){
                    map.get(j+1).add(board[i][j]);
                }
            }
        }

        // 크래인으로 인형 뽑자
        for(int move : moves){
            Stack tempStack = map.get(move);
            int tempStackdoll = 0;
            int baguniDoll = 0;

            if(!tempStack.isEmpty()) tempStackdoll = (int)tempStack.pop();
            if( !baguni.isEmpty() ) baguniDoll = baguni.peek();

            if( tempStackdoll != 0 && (tempStackdoll == baguniDoll) ){
                baguni.pop();
                answer = answer + 2;
            }else if(tempStackdoll != 0 && (tempStackdoll != baguniDoll) ) {
                baguni.add(tempStackdoll);
            }


//            if( !tempStack.isEmpty() ){
//                tempStackdoll = (int)tempStack.pop();
//            }
//            if( !baguni.isEmpty()){
//                int baguniDoll = baguni.peek();
//                if( baguniDoll ==  tempStackdoll){
//                    baguni.pop();
//                    answer = answer + 2;
//                }else{
//                    if( tempStackdoll != 0){
//                        baguni.add(tempStackdoll);
//                    }
//                }
//            }else{
//                if( tempStackdoll != 0 ){
//                    baguni.add(tempStackdoll);
//                }
//            }

        }

        System.out.println(answer);

        return answer;
    }

}
