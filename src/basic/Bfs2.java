package basic;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs2 {
    // BFS - 넓이 우선 탐색 알고리즘
    // 인접한 노드를 우선 처리하는 알고리즘
    // 맹목적인 탐색을 위한 알고리즘
    // 큐를 이용한 알고리즘
    // 방문 처리한 노드를 큐에 넣고 먼저 들어온 노드를 먼저 처리함
    public static void main(String[] args) {
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
        boolean[] visited = new boolean[9];
        System.out.println(bfs(1, graph, visited));
        //출력 내용 : 1 -> 2 -> 3 -> 8 -> 6 -> 5 -> 4 -> 7 ->
    }

    public static String bfs(int startNode, int[][] graph, boolean[] visited) {

        StringBuilder sb = new StringBuilder();
        // 큐는 링크드 리스트로
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(startNode);
        visited[startNode] = true;

        // 큐가 비어있지 않다면 - 인접한 노드이고 방문 처리도 한 노드
        while(!queue.isEmpty()){
            int node = queue.poll();

            sb.append(node).append(" -> ");

            // nodeIndex = 기준이 되는 노드, node = 인접노드
            for(int adjacentNode : graph[node]){
                if(!visited[adjacentNode]){
                    queue.offer(adjacentNode);
                    visited[adjacentNode] = true;
                }
            }
        }
        return sb.toString();
    }

}
