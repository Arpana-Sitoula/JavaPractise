/*A non-empty array A of length n is called on array of all possibilities if it contains all numbers between 0 and A.length-1 inclusive.
Write a method named isAllPossibilities that accpets an integer array and return 1 if the array is an array of all possibilities, 
otherwise it returns 0. */

package Unit1.Exercises;

public class Array {
    public static int isAllPossibilities(int[] arr) {
        int n = arr.length;
        int count =0;
       //boolean[] seen = new boolean[n];
    
        for (int i=0;i<n;i++) {
            if(arr[i]<n){
                count ++;
            }
            // System.out.println("count for"+ arr[i] + "is"+ count);

        }
        if(count == n){
            return 1;
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 5}; //should return 0
        int[] arr2 = {0, 2, 1, 3}; //should return 1
        int[] arr3 = {0, 1, 2, 3, 4}; //should return 1
        int[] arr4 = {0, 1, 3, 4}; //should return 0

        System.out.println(isAllPossibilities(arr1)); 
        System.out.println(isAllPossibilities(arr2)); 
        System.out.println(isAllPossibilities(arr3));
        System.out.println(isAllPossibilities(arr4));
    }
    
    }

