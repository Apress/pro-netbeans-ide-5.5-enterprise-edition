

public class NumUtils
{


    public int conditionalCheck(int i)
    {

        int iReturnVal = 0;
        if(i==0) {
            iReturnVal = i + 1;
        }
        else if (i>0 && i<8) {
            iReturnVal = i + 2;
        }
        else if (i==8) {
            iReturnVal = i + 3;
        }
        else {
            iReturnVal = i;
        }

        return iReturnVal;
    }


}