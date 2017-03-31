package interest;

import java.util.ArrayList;

/**
 * @author Jeff
 */
public class InterestLoop {
    

    public static ArrayList<InterestCalculator> getInterestArr(double interestRate, double principal, double monthPayment, double years)
    {
        ArrayList<InterestCalculator> intArr = new ArrayList<InterestCalculator>();
        for(int m=0; m <= years; m++){
            intArr.add (new InterestCalculator(interestRate, principal, monthPayment, m));
        }
        return intArr;
    }        
}
