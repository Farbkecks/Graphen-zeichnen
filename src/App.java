public class App {
    public static void main(String[] args) throws Exception {
        // int[][] table = {{1,5},{2,12},{3,5},{4,12},{5,5},{6,8},{7,2}};
        Generator gen = new Generator();
        int[][] table = Generator.generator();
        Zeichnen zei = new Zeichnen();
        zei.zeichnen(table);
        }
}
