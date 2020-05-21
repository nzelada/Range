package Range;


/**
 * ************************************************************
 * Purpose/Description: <The program will find the range of the array>
 * Author’s Panther ID: 
 * Certification: I hereby certify that this work is my own and none of it is
 * the work of any other person.
 * ************************************************************
 */
public class Range {

    /**
     * The sorting will look for the range between the number put in the main
     * @param ar the array from main
     * @param k preprocesses the input array in O(n+k) running time
     * @return count
     */
    private static int[] sorting(int ar[], int k) {
        int n = ar.length; // n would be the length of the array
        int i; // i integer
        int endRe[] = new int[n]; // endRe would be the integer of n

        k = k + 1; // adding k plus 1 and assigning it to k
        int count[] = new int[k]; // count array has the integer of k in new array
        for (i = 1; i < k; ++i) { // for loop going until k
            count[i] = 0; //assigning 0 to count[i]
        }

        for (i = 0; i < n; ++i) { // for loop
            ++count[ar[i]]; // increments for count array with arr
        }
        for (i = 2; i < k; ++i) { // for loop
            count[i] += count[i - 1]; // adding the sum
        }

        for (i = 0; i < n; ++i) { // for loop
            endRe[count[ar[i]] - 1] = ar[i]; // endRe array with count and ar array
            --count[ar[i]]; // decrementing the ar array
        }
        for (i = 0; i < n; ++i) { // for loop
            ar[i] = endRe[i]; // assigning endRe int to ar array
        }
        return count; // return count
    }


/**
 * This is the main in which it would allow the program to run
 *  
 */
  public static void main(String args[])
    {
        int [ ] a = {3, 8, 2, 4, 1, 9, 11, 4, 15}; // array
        int k = 15; // highest element
        int left = 2; // lowest value in range
        int right = 9; // highest value in range

        int count[] = sorting(a,k); // calls the sorting method
        //In  O(1) running time
        System.out.println("Total number in range ["+left+".."+right+"] is: " + (count[right] - count[left-1]));
       // print

    }
}
