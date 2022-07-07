public class FormalPart {
    Sign sign;
    Operation firstOperation;
    double firstNummber;
    double secondNummber;
    Operation secOperation;
    double thirtNummber;
    int indexforX;
}    


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