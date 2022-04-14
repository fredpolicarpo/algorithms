class Main {

  public static void main(String... args) {
    final var graph = GraphBuilder.build();
    graph.bfs(graph.nodes.get(0));
    graph.dfs(graph.nodes.get(0));

    graph.dfs( GraphBuilder.build2().nodes.get(0));
  }
}
