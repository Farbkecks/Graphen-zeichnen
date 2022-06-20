import java.lang.Math;

public class Generator {
    static int[][] generator(){
    int[][] table = {{1,0},{2,0},{3,0},{4,0},{5,0},{6,0},{7,0},{8,0},{9,0},{10,0},{11,0},{12,0},{13,0},{14,0},{15,0},{16,0},{17,0},{18,0},{19,0},{20,0}};
    for (int i= 1; i<20;i++){
        int wert = (int) Math.round(Math.pow(Double.valueOf(i), 2.0));
        if (wert > 20){
            wert = 20;
        }
        table[i][1] = wert;
    }
    return table;
    } 
}
