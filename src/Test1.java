public class Test1 {


    public static void main(String[] args){

        int n = 1;
        int m = 100;
        int a = solution(100,300);
        System.out.println(a);
    }

    public static int solution(int n, int m) {
        int answer = 0;
        String temp = "";
        Boolean result = true;

        //자연수 n부터 m까지
        for(int i=n;i<=m;i++){
            // temp 변수에 임시 저장
            temp = String.valueOf(i);

            // temp 길이의 반만큼
            for(int j=0;j<(temp.length()/2);j++){
                // 양쪽 끝에서부터 비교하여 다르면 false
                if( !(temp.charAt(j) == temp.charAt(temp.length()-1-j)) ){
                    result = false;
                }
            }

            // 양쪽 끝에서 비교하여 다른게 없었다면 result는 true
            if(result) answer++;
            // result 값 초기화
            result = true;
        }

        return answer;
    }
}
