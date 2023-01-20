package Question2;

public class Question2 {
    public static void main(String[] args) {
        int[] array = {1,2,3,1,5};

        int sumLeft=0,sumRight=0;

        for(int left=0; left<array.length-1;left++){
            sumLeft += array[left];
            for(int right = left+1 ; right<array.length; right++){
                 sumRight+=array[right];
            }
            if (sumLeft==sumRight){
                System.out.println("the first subarray is: ");
                for(int k=0;k<=left;k++){
                    System.out.print(array[k]+" ");
                }
                System.out.println();
                System.out.println("the second subarray is: ");
                for(int k=left+1;k< array.length;k++){
                    System.out.print(array[k]+" ");
                }
            }
            sumRight=0;
        }
    }
}
