/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;
import java.util.Random;

public class Library {

    public static void main (String[] args){

//    roll(4);
    }

    public int [] roll (int n) {

        // declare array to get the values inside
        int [] rollArray = new int[n];
        int low = 1;
        int high = 6;
        Random rand = new Random();
        // create a random number
        for (int i = 0 ; i < n ; i++ ){

            rollArray[i] = rand.nextInt(high - low) + low;

        }
        return rollArray;
    }

    public boolean containsDuplicates (int [] testArray) {
        boolean result ;
        for (int i = 0; i < testArray.length; i++) {
            for (int j = 0; j < testArray.length; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (testArray[i] == testArray[j]) {
                        result = true;
                        break;
                    }
                    // check the last element
                    if (i == j && i == testArray.length - 1 && testArray[i] != testArray[j]) {
                        result = false;
                    }


                }
            }
        }
        return result;
    }
    public float findingAverage(int [] array) {
        int sum = 0;
        float average;

        for (int i : array) {
            sum+= array[i];
        }
        average = sum / array.length;
        return average;
    }

    public int [] leatAverage (int [][] arrayOfArrays){
        int sum;
        float [] averges;
        float preAvg;
        int index;
        int j;
        for (int i = 0 ; i < arrayOfArrays.length ; i++) {
            sum =  0;
           if ( i != 0) {
               preAvg = averges[i];
           }
            for (j = 0 ; j < arrayOfArrays.length ; j++) {
               sum+= arrayOfArrays[i][j];
            }
            averges[i] = sum / j;
            if (preAvg < averges[i]) {
                index = i;
            }
        }
    return arrayOfArrays[index];
    }




    public boolean someLibraryMethod() {
        return true;
    }
}
