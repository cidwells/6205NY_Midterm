package math.problems;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};


        int lowest = array2[0];
        for(int i=0;i<array1.length;i++){
            for(int a=0;a<array2.length; a++){

                int result = Math.abs(array2[a]-array1[i]);
                if(result<lowest)
                { lowest = result;
                }
            }
        }
        System.out.println(lowest);


    }

}
