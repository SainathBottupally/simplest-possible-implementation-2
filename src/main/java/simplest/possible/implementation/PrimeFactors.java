package simplest.possible.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrimeFactors {
    public List<Integer> of(int number) {
        List<Integer> primeFactors = new ArrayList<Integer>();
        if(number == 1){
            return Collections.emptyList();
        }
        else if(number == 2){
            primeFactors.add(2);
            return primeFactors;
        }else{
            return Collections.emptyList();
        }
    }
}
