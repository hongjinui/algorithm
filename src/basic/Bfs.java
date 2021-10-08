package basic;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    public static void main(String[] args) {
        // 그래프를 2차원 배열로 표현해줍니다.
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
        // 방문처리를 위한 boolean 배열 선언
        boolean[] visited = new boolean[9];
        System.out.println(bfs(1, graph, visited));
        //출력 내용 : 1 -> 2 -> 3 -> 8 -> 6 -> 5 -> 4 -> 7 ->
    }

    public static String bfs(int start, int[][] graph, boolean[] visited){

        StringBuilder sb = new StringBuilder();
        // 자바에서 큐는 링크드리스트로 구현함
        Queue<Integer> queue = new LinkedList<>();
        // 시작 노드 큐에 넣기
        queue.offer(start);
        // 시작 노드 방문 처리
        visited[start] = true;

        // 큐가 비어있지않다면 - 방문한 노드가 큐에 대기하고 있는 상태임
        while(!queue.isEmpty()){
            // 가장 먼저 들어온 노드를 큐에서 제거
            int nodIndex = queue.poll();
            sb.append(nodIndex).append(" -> ");

            // 제거된 노드의 인접 노드들 중 가장 인접한 노드를 찾아 방문 처리 및 큐에 넣음
            for(int i=0;i<graph[nodIndex].length;i++){
                int temp = graph[nodIndex][i];

                if(!visited[temp]){
                    queue.offer(temp);
                    visited[temp] = true;
                }
            }
        }
        return sb.toString();
    }
}