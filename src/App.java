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
    public static void main(String[] args) throws Exception {
        int[][] table_original = {{1,2}, {3,4}, {5,6}};
        int [][] table = resort_table(table_original);
        }
}
