import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

    public static void main(String[] args){

//        int[][] arr = {{1, 2}, {2, 4}, {2, 2}};
        int[][] arr = {{7,8},{1, 4},{4, 4},{8,10},{2, 6},{4, 7},{8,8}};
        int a = solution(arr);
//        System.out.println(a);
    }

    public static int solution(int [][] arr) {
        int answer = 0;

        // 2차 배열 정렬
        Arrays.sort(arr,((o1, o2) -> {
            if(o1[0]==o2[0]){
                return Integer.compare(o1[1],o2[1]);
            }else{
                return Integer.compare(o1[0],o2[0]);
            }
        }));

//        for(int i=0;i<arr.length;i++){
//            for(int j=0;j<2;j++){
//                System.out.print(arr[i][j]);
//            }
//            System.out.println(" ");
//        }

        // 첫 팀 시작
        int startTime= arr[0][0];

        for(int i=0;i<arr.length;i++){
            if( arr[i][0] ==  startTime){
                startTime = arr[i][1];
                answer++;
            }
            // 회의 시작 시간이 최대값
            if(startTime >= 20000000) {
                if(arr[arr.length-1][0] == 20000000 && arr[0][arr.length-1] == 20000000) answer++;
                break;

            }
        }

        return answer;
    }

}
