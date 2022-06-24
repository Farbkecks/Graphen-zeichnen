import java.lang.Math;
import java.util.ArrayList;

public class Generator {
    public static int[][] convertIntegers(ArrayList<int[]> table_arraylist)
    {
        int[][] table_array = new int[table_arraylist.size()][2];
        for (int i=0; i < table_array.length; i++){
            table_array[i][0] = table_arraylist.get(i)[0];
            table_array[i][1] = table_arraylist.get(i)[1];
        }
        return table_array;
    }
    static int[][] generator(String user_input){
    ArrayList<int[]> table = new ArrayList<>();
    for (int i= 1; i<20;i++){
        int wert = (int) Math.round(Math.pow(Double.valueOf(i), 2.0));
        if (wert > 20){
            break;
        }
        int[] cell = {i, wert};
        table.add(1,cell);
    }
    int[][] table_r = convertIntegers(table);
    return table_r;
    } 
}
