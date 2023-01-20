package Question4;

import java.util.Arrays;

public class Question4 {
    public static void main(String[] args) {
       int [] denominations = {5,5,2,10,10};
       int totalAmount =21 ;

       int countOfCoins = minimumNumberOfCoins(denominations,totalAmount);
        System.out.println(countOfCoins);

    }

    public static int minimumNumberOfCoins(int [] denominations, int totalAmount){
        int eachDenomination,innerLoop;
        int sumOfDenominations=0;
        int count=1;

        Arrays.sort(denominations);
        //1, 1, 2, 2, 5, 5, 10, 10     --> sorted array


        //handling edge case (if the last element in the denominations array is equal to total amount);
        if(denominations[denominations.length-1]==totalAmount)return 1;


        //traversing the denominations array from last

        //outer loop for fixing each element from the last
        for(eachDenomination=denominations.length-1; eachDenomination>0; eachDenomination--){

            //inner loop for adding every element in denominations array
            // with the fixed element in the previous loop
              for(innerLoop=eachDenomination-1; innerLoop>=0; innerLoop--) {

                  //finding the sum of elements from inner and outer loop
                  sumOfDenominations += denominations[eachDenomination] + denominations[innerLoop];
                  count++;

                  if (sumOfDenominations == totalAmount) {
                      return count;
                  }
                  if (sumOfDenominations > totalAmount) {
                      sumOfDenominations = sumOfDenominations-denominations[innerLoop];
                      count--;
                  }

              }
        }
        return -1;
    }
}
