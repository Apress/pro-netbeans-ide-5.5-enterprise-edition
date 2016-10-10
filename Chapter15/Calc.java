

public class Calc {


    public int checkNum(int origVal) {

        int returnVal = 0;
        
        if(origVal > 10) {
            returnVal = origVal -1;
        }
        else {
            returnVal = origVal + 1;
        }
        
        return returnVal;
    }
}