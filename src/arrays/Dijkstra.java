package arrays;
import java.util.*;
public class Dijkstra {
    static int operationCount = 0;
    static final int INF = Integer.MAX_VALUE;
    public static void dijkstra(int[][] graph, int source) {
        int n = graph.length;
        int[] distance = new int[n];
        boolean[] visited = new boolean[n];
        Arrays.fill(distance, INF);
        distance[source] = 0;
        for (int count = 0; count < n - 1; count++) {
            operationCount++;
            int u = minDistance(distance, visited);
            operationCount++;
            visited[u] = true;
            operationCount++;
            for (int v = 0; v < n; v++) {
                operationCount++;
                if (graph[u][v] != 0 && distance[u] != INF && distance[u] + graph[u][v] < distance[v]) {
                    operationCount++;
                    distance[v] = distance[u] + graph[u][v];
                    operationCount++;
                }
                operationCount++;
            }
            operationCount++;
        }
        printSolution(distance);
    }
    private static int minDistance(int[] distance, boolean[] visited) {
        int min = INF, minIndex = -1;
        for (int v = 0; v < distance.length; v++) {
            operationCount++;
            if (!visited[v] && distance[v] <= min) {
                operationCount++;
                min = distance[v];
                operationCount++;
                minIndex = v;
                operationCount++;
            }
            operationCount++;
        }
        operationCount++;
        return minIndex;
    }
    private static void printSolution(int[] distance) {
        System.out.println("Shortest Distances from Source:");
        for (int i = 0; i < distance.length; i++) {
            System.out.println("To " + i + ": " + distance[i]);
        }
        System.out.println("Operation Count: " + operationCount);
    }
    public static void main(String[] args) {
        int[][] graph = {
                {0, 3, 0, 7, 0},
                {3, 0, 1, 1, 8},
                {0, 1, 0, 2, 4},
                {7, 1, 2, 0, 2},
                {0, 8, 4, 2, 0}
        };
        dijkstra(graph, 0);
    }
}