package basic;

import java.util.Stack;

public class Dfs2 {
    // DFS - 넓이 우선 탐색
    // 인접한 노드를 스택에 쌓아 가장 마지막에 들어온 노드부터 처리함
    // 재귀 함수와 스택 2가지 유형이 있음
    // 컴퓨터 실행 구조가 스택이여서 재귀 함수로 구현 많이함 - 구현도 간단함
    public static void main(String[] args){
        boolean[] visited = new boolean[9];
        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};

        recursiveDfs(1, graph, visited); // 1 -> 2 -> 6 -> 8 -> 3 -> 5 -> 4 -> 7 ->

        visited = new boolean[9];
        System.out.println(" ");

        stackDfs(1, graph, visited);     // 1 -> 8 -> 3 -> 5 -> 7 -> 4 -> 2 -> 6 ->
    }

    public static void stackDfs(int startNode, int[][] graph, boolean[] visited) {

        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();

        stack.push(startNode);
        visited[startNode] = true;

        while(!stack.isEmpty()){
            int node = stack.pop();
            sb.append(node).append(" -> ");

            for(int adjacentNode : graph[node]){
                if(!visited[adjacentNode]){
                    stack.push(adjacentNode);
                    visited[adjacentNode] = true;
                }
            }
        }
        System.out.println(sb);
    }

    public static void recursiveDfs(int startNode, int[][] graph, boolean[] visited) {

        System.out.print(startNode + " -> ");

        visited[startNode] = true;

        for(int node : graph[startNode]){
            if(!visited[node]){
                visited[node] =true;
                recursiveDfs(node,graph,visited);
            }
        }
    }
}
