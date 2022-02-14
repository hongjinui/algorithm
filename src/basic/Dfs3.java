package basic;

import java.util.Stack;

public class Dfs3 {

    public static void main(String[] args){

        int[][] graph = {{}, {2,3,8}, {1,6,8}, {1,5}, {5,7}, {3,4,7}, {2}, {4,5}, {1,2}};
        boolean[] visited = new boolean[graph.length];

        System.out.println(stackDfs(1, graph, visited));

        visited = new boolean[graph.length];

        recursiveDfs(1, graph, visited);

    }

    private static String stackDfs(int startNode, int[][] graph, boolean[] visited){

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        stack.push(startNode);
        visited[startNode] = true;

        while(!stack.isEmpty()){

            int node = stack.pop();
            sb.append(node).append(" -> ");

            for(int injupNode : graph[node]){
                if(!visited[injupNode]){
                    stack.push(injupNode);
                    visited[injupNode] = true;

//                    recursiveDfs(injupNode, graph, visited);
                }
            }

        }

        return sb.toString();
    }

    private static void recursiveDfs(int node, int[][] graph, boolean[] visited){

        System.out.print(node + " -> ");

        visited[node] = true;
        for(int injupNode : graph[node]){
            if(!visited[injupNode]){
                visited[injupNode] = true;
                recursiveDfs(injupNode,graph,visited);
            }
        }
    }

}
