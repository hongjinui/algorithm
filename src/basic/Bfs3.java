package basic;

import java.util.*;
public class Bfs3 {

    public static void main(String[] args) {
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
        boolean[] visited = new boolean[graph.length];
        System.out.println(bfs(1, graph, visited));
        //출력 내용 : 1 -> 2 -> 3 -> 8 -> 6 -> 5 -> 4 -> 7 ->
    }

    private static String bfs(int startNode, int[][] graph, boolean[] visited){

        Queue<Integer> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();

        queue.offer(startNode);
        visited[startNode] = true;

        while(!queue.isEmpty()){

            int node = queue.poll();

            sb.append(node).append(" -> ");

            // injupNode 인줍노드
            for( int injupNode : graph[node]){
                if(!visited[injupNode]){
                    queue.offer(injupNode);
                    visited[injupNode] = true;
                }
            }
        }
        return sb.toString();
    }
}
