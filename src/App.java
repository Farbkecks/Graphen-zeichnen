// import java.util.Scanner;
// import java.util.Arrays;

public class App {
    static int[][] resort_table(int[][] table){
        int size = table.length;

        for (int step = 1; step < size; step++){
            int[] key = table[step];
            int j = step - 1;

            while (j >= 0 && key[1] > table[j][1] ){
                table[j + 1] = table[j];
                --j;
            }
            table[j+1] = key;
        }
        return table;
    }

    static void print_graphen(int[][] table){
        System.out.println("/\\");
        for (int[] pos: table){
            System.out.print("|");
            for (int i=0; i<pos[0];i++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i=0; i<table[0][0]+1; i++){
            System.out.print("---");
        }
        System.out.println(">");
    }

    public static void main(String[] args) throws Exception {
        int[][] table_original = {{1,2}, {10,4}, {50,6},{11,2}, {7,4}, {5,6}};
        int [][] table = resort_table(table_original);
        print_graphen(table);
        }
}
