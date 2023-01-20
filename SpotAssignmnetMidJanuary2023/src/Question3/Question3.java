package Question3;

import java.util.ArrayList;

public class Question3 {
    public static void main(String[] args) {

        String[]X = {"ceo","alco","caaeio","ceai"};
        String[]Y = { "ec","oc","ceo"};
        boolean flag;

        ArrayList<String> answerList = new ArrayList<>();

        ArrayList<Character> eachStringInX = new ArrayList<>();

       //traversing each element(string) of array X
        for(int eachElementOfX = 0; eachElementOfX < X.length; eachElementOfX++){

           String elements = X[eachElementOfX];

           //adding each character of the string to the arraylist eachStringInX
           for(int eachChar = 0; eachChar<elements.length(); eachChar++){
               eachStringInX.add(elements.charAt(eachChar));
           }

            flag = isSubsequence(eachStringInX , Y);

           //if the string is a superstring add it to the answerList
            if(flag==true) answerList.add(X[eachElementOfX]);

            eachStringInX.clear();
        }
        System.out.println("The super strings in array X are: "+ answerList);
        System.out.println("The no.of super strings in array X are: "+answerList.size());

    }

    public static boolean isSubsequence(ArrayList<Character> eachStringInX, String[] Y){

        for(int i=0;i<Y.length;i++){

            for(int j=0;j<Y[i].length();j++){

                char ch = Y[i].charAt((j));

                if(eachStringInX.contains(ch)){
                    continue;
                }
                else{
                    return false;
                }
            }
        }

      return true;
    }
}
