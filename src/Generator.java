import java.lang.Math;
import java.util.ArrayList;

public class Generator {
    static ArrayList<Coordinate2D> generateBasicGraph(String formel){
        ArrayList<Coordinate2D> graph = new ArrayList<>();
        for (int x= 1; x<20;x++){
            int y = (int) Math.round(Math.pow(Double.valueOf(x), 2.0));
            if (y > 20){
                break;
            }
            graph.add(new Coordinate2D(x, y));
        }
        return graph;
    } 
}
