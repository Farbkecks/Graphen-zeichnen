import java.lang.Math;
import java.util.ArrayList;

enum Operation{
    none,
    times,
    divided,
    power,
    root
}

enum Sign{
    none,
    add,
    subtract
}

public class Generator {
    static ArrayList<String> splitString(String formel){
        char[] formelCharList = formel.toCharArray();
        ArrayList<String> formelList = new ArrayList<>();
        for(int i=0; i<formelCharList.length;i++){
            if(formelCharList[i] == '+'){
                System.out.println("found +");
            }
        }
        return formelList;
    }

    static ArrayList<Coordinate2D> generateBasicGraph(String formel){
        ArrayList<String> formelList = splitString(formel);
        ArrayList<Coordinate2D> graph = new ArrayList<>(); 
        return graph;
    } 
}









/*
 *       for (int x= 1; x<20;x++){
            int y = (int) Math.round(Math.pow(Double.valueOf(x), 2.0));
            if (y > 20){
                break;
            }
            graph.add(new Coordinate2D(x, y));
        }
 * 
 */