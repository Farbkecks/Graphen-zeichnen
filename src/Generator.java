import java.lang.Math;
import java.util.ArrayList;

enum Operation{
    none,
    times,
    divided,
    power
}

enum Sign{
    none,
    add,
    subtract
}

public class Generator {
    // Die Orginale String Formel wird in eine Liste aus Strings geändert welche die einezelnen Rechenaufgaben zwischen + und - enthalten
    static ArrayList<String> splitString(String formel){
        char[] formelCharList = formel.toCharArray(); //String in CharArray um für + und - zu suchen
        ArrayList<String> formelList = new ArrayList<>(); //Liste mit den aufgeteilte Formel Parts
        int oldSign = 0;
        for(int index=0; index<formelCharList.length;index++){
            if(formelCharList[index] == '+' || formelCharList[index] == '-'){ //index von + und - finden
                formelList.add(formel.substring(oldSign,index));
                oldSign = index;
            }
        }

        formelList.add(formel.substring(oldSign,formelCharList.length)); //Substring von letzen +/- bis zum Ende
        return formelList;
    }
    static boolean testForNummer(char nummber){
        for(int i=0; i<10; i++){
            int tempNummer = Character.getNumericValue(nummber);
            if(tempNummer == i){
                return true;
            }
        }
        return false;
    }

    static ArrayList<FormalPart> getFormelPartOpjekts(ArrayList<String> formelList){
        ArrayList<FormalPart> formelObjekts = new ArrayList<>();
        for(String formelPartString: formelList){
            FormalPart formalPart = new FormalPart();
            char[] formelPartCharArray = formelPartString.toCharArray();
            int sign = 0;
            if(formelPartCharArray[0] == '+'){
                formalPart.sign = Sign.add;
                sign = 1;
            }
            else if(formelPartCharArray[0] == '-'){
                formalPart.sign = Sign.subtract;
                sign = 1;
            }
            formalPart.firstNummber = Character.getNumericValue(formelPartCharArray[0+sign]);
            switch(formelPartCharArray[1+sign]){
                case '*': {
                    formalPart.firstOperation = Operation.times;
                    break;
                }
                case '/': {
                    formalPart.firstOperation = Operation.divided;
                    break;
                }
            }
            } 
        }
        return formelObjekts;
    }

    static ArrayList<Coordinate2D> generateBasicGraph(String formel){
        ArrayList<String> formelList = splitString(formel);
        ArrayList<FormalPart> formelObjekts = getFormelPartOpjekts(formelList);
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