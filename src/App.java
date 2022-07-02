public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(args[0]);
        Graph graph = new Graph(Generator.generateBasicGraph());
        // graph.debugPrintAsList();
        graph.draw();
    }
}
