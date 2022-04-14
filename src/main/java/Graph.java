import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph {
  final List<Node> nodes;

  Graph(final List<Node> node) {
    this.nodes = node;
  }

  public void dfs(final Node start) {
    System.out.println("DFS");
    final List<Node> processedNodes = new ArrayList<>();
    final Stack<Node> stack = new Stack<>();

    processedNodes.add(start);
    stack.add(start);

    while (!stack.isEmpty()) {
      final var processingNode = stack.pop();
      processingNode.print();
      processingNode.connections.forEach(node -> {
        if (!processedNodes.contains(node)) {
          processedNodes.add(node);
          stack.add(node);
        }

      });
    }
    System.out.println("......\n\n");
  }

  public void bfs(final Node start) {
    System.out.println("BFS");
    final List<Node> processedNodes = new ArrayList<>();
    final Queue<Node> queue = new LinkedList<>();

    processedNodes.add(start);

    queue.add(start);

    while (!queue.isEmpty()) {
      final var processingNode = queue.remove();
      processingNode.print();
      processingNode.connections.forEach(node -> {
        if (!processedNodes.contains(node)) {
          processedNodes.add(node);
          queue.add(node);
        }
      });
    }
    System.out.println("......\n\n");
  }
}
