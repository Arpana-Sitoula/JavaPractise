//An array is called balanced if its even numbered elements (a[0],a[2],..) are even and its odd numbered elements (a[1],a[3],...) are odd. Write a functin named Balance that accepts an array of integers and returns 1 if the array is balanced otherwise returns 0.
package Unit1.Exercises;

public class Array2 {
public static int  isBalance(int[] arr){
for (int num = 0; num < arr.length; num++){
    if((num % 2 == 0) && (arr[num] %2 == 0)){
        if ((num+1 % 2 != 0) && (arr[num+1] %2 != 0)){
        return 1;
    }
}
}
return 0;
} 
   public static void main(String[] args) {
    int[] arr1 = {2,4,6,8};
    int[] arr2 = {6,7,4,9};
    int[] arr3 = {3,8,4,2};

    System.out.println(isBalance(arr1));
    System.out.println(isBalance(arr2));
    System.out.println(isBalance(arr3));
   }
}
