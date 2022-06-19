
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
        System.out.print("|");
        for (int y=0; y<table.length; y++){
            int[] pos = table[y];
            int steps_right = pos[0];
            if (y>0){
                if(pos[1]==table[y-1][1]){
                    steps_right = steps_right - table[y-1][0];
                }
            }
            
            for (int i=0; i<steps_right;i++){
                System.out.print("    ");
            }
            System.out.print("*");
            if (y!= table.length-1){
                int steps_down = pos[1]-table[y+1][1];
                if(steps_down==0){
                    continue;
                }
                System.out.println();
                for (int i=1; i<steps_down;i++){
                    System.out.println("|");
                }
            }
        }
        System.out.print("|");
       for (int i=0; i<table[table.length-1][1];i++){
            System.out.println("|");
       }
       System.out.println();
        for (int i=0; i<table[0][0]+1; i++){
            System.out.print("---");
        }
        System.out.println(">");
    }

    public static void main(String[] args) throws Exception {
        int[][] table_original = {
        {1,5}, 
        {2,12}, 
        {3,5}, 
        {4,12}, 
        {5,5}, 
        {6,8},
        {7,2}};
        int [][] table = resort_table(table_original);
        print_graphen(table);

        }
}
