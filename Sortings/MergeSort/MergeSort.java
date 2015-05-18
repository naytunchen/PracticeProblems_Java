/***********************************************************************************/
/********************************* Author: Nay Tun *********************************/
/******** Purpose: This program sorts an array of integers using MergeSort *********/
/*********************** Last Date Modified: May 17th, 2015 ************************/
/***********************************************************************************/

public class MergeSort {

    /*
     * Method: Main Method of the program
     */
    public static void main(String arg[]) {

        // Test array
        int[] theList = {52,21,24,54,63,21,51,2,3,45,1,25,6,2,4,5,12,21,85};

        System.out.print("Original List: ");
        for(int i = 0; i < theList.length; i++) {
            System.out.print(theList[i] + " ");
        }
        System.out.print("\n");

        theList = MergeSort(theList); // Sort the list using MergeSort

        System.out.print("Sorted by MergeSort: ");
        // Print to check if the list gets sorted or not
        for(int i = 0; i < theList.length; i++) {
            System.out.print(theList[i] + " ");
        }
        System.out.print("\n");
    }

    /*
     *  Split up the list using Divde and Conquer approach, then sort it
     */
    public static int[] MergeSort(int[] list) {
        if(list.length <= 1) {
            return list;
        }   
        // get midpoint
        int midpoint = list.length/2;

        int[] left = new int[midpoint];
        int[] right;
        right = (list.length % 2 == 0) ? new int[midpoint] : new int[midpoint+1];

        int [] result = new int[list.length];
        for(int i = 0; i < midpoint; i++) {
            left[i] = list[i];
        }

        int k = 0;
        for(int j = midpoint; j < list.length; j++) {
            if(k < right.length) {
                right[k] = list[j];
                k++;
            }
        }

        left = MergeSort(left);
        right = MergeSort(right);

        result = merge(left, right);
        return result;
    }


    /*
     * Merge the list by comparing the elements of two lists
     */
    public static int[] merge(int[] left, int[] right) {
        int lengthResult = left.length + right.length;
        int [] result = new int[lengthResult];
        int indexL = 0;
        int indexR = 0;
        int indexRes = 0;

        while( indexL < left.length || indexR < right.length) {
            if( indexL < left.length && indexR < right.length) {
                if(left[indexL] <= right[indexR]){
                    result[indexRes] = left[indexL];
                    indexL++;
                    indexRes++;
                }
                else {
                    result[indexRes] = right[indexR];
                    indexR++;
                    indexRes++;
                }
            }
            else if(indexL < left.length) {
                result[indexRes] = left[indexL];
                indexL++;
                indexRes++;
            }
            else if(indexR < right.length) {
                result[indexRes] = right[indexR];
                indexR++;
                indexRes++;
            }
        }

        return result;
    }
}
