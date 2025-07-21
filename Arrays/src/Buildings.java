import java.util.Scanner;

public class Buildings {
    public static void main(String[] args) {
            int[] arr = {9, 3, 7, 6, 2, 0, 4};

            int max = findMax(arr); // Step 1: Find max height

            // Step 2: Loop from max height down to 1
         for (int i=max;i>=1;i--){
             for (int j=0;j<arr.length;j++){
                 if (arr[j]>=i){
                     System.out.print("* ");
                 }
                 else {
                     System.out.print("  ");
                 }
             }
             System.out.println();
         }
        }

        // Helper function to find max element
        public static int findMax ( int[] arr){
            int max = Integer.MIN_VALUE;
            for (int num : arr) {
                if (num > max) {
                    max = num;
                }
            }
            return max;
        }
    }
