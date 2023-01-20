package Question5;

public class Question5 {
    public static void main(String[] args) {
        String referenceString = "Help";
        String inputString = "Hello World Please";

        int referenceChar;
        int inputChar;

        int[] frequencyOfInputString= new int[26];

        //iterating reference string
        for(referenceChar=0; referenceChar<referenceString.length(); referenceChar++){

            //iterating input string
            for(inputChar=0; inputChar<inputString.length(); inputChar++){

                if(referenceString.charAt(referenceChar)==inputString.charAt(inputChar)){
                    if(Character.isLowerCase(referenceString.charAt(referenceChar))){
                        frequencyOfInputString[inputString.charAt(inputChar) - 'a']++;
                    }
                    if(Character.isUpperCase(referenceString.charAt(referenceChar))){
                        frequencyOfInputString[inputString.charAt(inputChar) - 'A']++;
                    }

                }
            }
        }

        char ch ='a'-1;

        for(int k: frequencyOfInputString){
           ch++;
            if(k!=0){
                System.out.println(ch + " appears " +k+" times.");
            }
        }
    }
}
