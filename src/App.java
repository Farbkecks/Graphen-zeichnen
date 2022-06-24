public class App {
    static void debug_print_table(int[][] table){
        for(int[] cell: table){
            System.out.println(cell[0] + " " + cell[1]);
        }
    }
    public static void main(String[] args) throws Exception {
        // int[][] table = {{1,5},{2,12},{3,5},{4,12},{5,5},{6,8},{7,2}};
        String user_input = "x^2";
        Generator gen = new Generator();
        int[][] table = Generator.generator(user_input);
        debug_print_table(table);
        // Zeichnen zei = new Zeichnen();
        // zei.zeichnen(table);
        }
}
