public class App {
    public static void main(String[] args) throws Exception {
        Graph graph = new Graph(Generator.generateBasicGraph());
        // graph.debugPrintAsList();
        graph.draw();
    }
}
