public class App {
    public static void main(String[] args) throws Exception {
        switch(args.length){
            case 0: {
                System.out.println("Bitte eine Formel angeben");
                System.exit(0);
            }
            case 2: {
                System.out.println("Nur eine Formel angeben");
                System.exit(0);
            }
        }
        String formel = args[1];
        Graph graph = new Graph(Generator.generateBasicGraph(formel));
        // graph.debugPrintAsList();
        graph.draw();
    }
}
