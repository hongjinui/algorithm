package basic;

import java.util.Stack;

public class Dfs {
    // 재귀함수로 구현
    // 방문처리에 사용 할 배열선언
    static boolean[] visited = new boolean[9];
    // 그림예시 그래프의 연결상태를 2차원 배열로 표현
    static int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
    public static void main(String[] args){
        dfs(1);
    }
    public static void dfs(int start){
        // 시작 노드 방문 처리
        visited[start] = true;
        
        // 방문한 노드는 출력
        System.out.print(start + " -> ");
        
        // 방문 처리한 노드와 인접한 노드 중 방문 처리 하지 않은 노드 하나씩 방문 처리
        for(int node : graph[start]){
            if(!visited[node]){
                dfs(node);
            }
        }
    // 1 -> 2 -> 6 -> 8 -> 3 -> 5 -> 4 -> 7 ->
    }
}
/*
    // 스택
    public static void main(String[] args){
        // 방문처리에 사용 할 배열선언
        boolean[] visited = new boolean[9];
        // 그림예시 그래프의 연결상태를 2차원 배열로 표현
        // 인덱스가 각각의 노드번호가 될 수 있게 0번인덱스는 아무것도 없는 상태라고 생각하시면됩니다.
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

        System.out.println(dfs(1, graph,visited));
    }

    public static String dfs(int start, int[][] graph, boolean[] visited){

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        stack.push(start);
        visited[start] = true;

        while(!stack.isEmpty()){
            int nodeIndex = stack.pop();
            sb.append(nodeIndex).append(" -> ");


            for(int i=0;i<graph[nodeIndex].length;i++){
                int temp = graph[nodeIndex][i];
                System.out.println(temp);
                if(!visited[temp]){
                    stack.push(temp);
                    visited[temp]=true;
                }
            }
        }

        return sb.toString(); // 1 -> 8 -> 3 -> 5 -> 7 -> 4 -> 2 -> 6 ->

    }
}*/
