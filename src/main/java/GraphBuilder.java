import java.util.List;

final class GraphBuilder {
  static Graph build() {
    final var n0 = new Node("0");
    final var n1 = new Node("1");
    final var n2 = new Node("2");
    final var n3 = new Node("3");
    final var n4 = new Node("4");
    final var n5 = new Node("5");
    final var n6 = new Node("6");
    final var n7 = new Node("7");
    final var n8 = new Node("8");
    final var n9 = new Node("9");
    final var n10 = new Node("10");
    final var n11 = new Node("11");

    n0.connections = List.of(n1, n3);
    n1.connections = List.of(n0, n2);
    n2.connections = List.of(n1, n5, n6);
    n3.connections = List.of(n0, n5);
    n4.connections = List.of(n5);
    n5.connections = List.of(n3, n2, n4);
    n6.connections = List.of(n2, n7, n8);
    n7.connections = List.of(n6, n8);
    n8.connections = List.of(n6, n7, n9);
    n9.connections = List.of(n8, n10, n11);
    n10.connections = List.of(n9);
    n11.connections = List.of(n9);

    return new Graph(List.of(n0, n1, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11));
  }

  static Graph build2() {
    final var n0 = new Node("0");
    final var n1 = new Node("1");
    final var n2 = new Node("2");
    final var n3 = new Node("3");
    final var n4 = new Node("4");
    final var n5 = new Node("5");
    final var n6 = new Node("6");
    final var n7 = new Node("7");
    final var n8 = new Node("8");

    n0.connections = List.of(n1, n3, n8);
    n1.connections = List.of(n0, n7);
    n2.connections = List.of(n3, n7, n5);
    n3.connections = List.of(n2, n0, n4);
    n4.connections = List.of(n3, n8);
    n5.connections = List.of(n6, n2);
    n6.connections = List.of(n5);
    n7.connections = List.of(n1, n2);
    n8.connections = List.of(n0, n4);

    return new Graph(List.of(n0, n1, n2, n3, n4, n5, n6, n7, n8));
  }
}
