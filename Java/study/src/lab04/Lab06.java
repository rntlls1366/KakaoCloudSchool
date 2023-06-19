package lab04;

public class Lab06 {
    static boolean[] visited = new boolean[9];
    static int[][] graph = {{}, {2, 3, 8}, {1, 6, 8}, {1, 5}, {5, 7}, {3, 4, 7}, {2}, {4, 5}, {1, 2}};

    public static void main(String[] args) {
        dfs(1);
    }

    static void dfs(int nodeIndex) {
        System.out.println(nodeIndex + " 번 노드 방문");
        visited[nodeIndex] = true;
        for(int n : graph[nodeIndex]) {
            if(visited[n] == false) {
                dfs(n);
            }
        }

        return;
    }


}
