import java.util.ArrayList;
import java.util.List;

public class Node {
  List<Node> connections = new ArrayList<>();
  private final String label;

  Node(final String label) {
    this.label = label;
  }

  public void print() {
    System.out.println(label);
  }

  @Override
  public String toString() {
    return label;
  }
}
