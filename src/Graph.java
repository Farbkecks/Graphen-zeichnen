import java.util.ArrayList;

class Graph {

    public void debugPrintAsList(){
        for(Coordinate2D point: graph){

        }
    }

    public Graph(ArrayList<Coordinate2D> points){
        int length = points.size();
        Coordinate2D[] graph = new Coordinate2D[length];
        for(int i=0; i<length; i++){
            graph[i] = points.get(i);
        }
    }        
}
