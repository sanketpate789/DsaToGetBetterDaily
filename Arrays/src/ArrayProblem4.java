import java.util.Scanner;

public class ArrayProblem4 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size1 = input.nextInt();
        int sum1=0,sum2=0;
        int[] arr1 = new int[size1];
        for (int i=0;i<size1;i++){
            arr1[i] = input.nextInt();
            sum1+=arr1[i];
        }
        int size2 = input.nextInt();
        int[] arr2 =new int[size2];
        for (int i=0;i<size2;i++){
            arr2[i] = input.nextInt();
            sum1+=arr2[i];
        }
        if (sum1>sum2){
            System.out.println("First array is larger");
        }
        else if (sum1<sum2){
            System.out.println("second array is larger");
        }
        else {
            System.out.println("Both are equal");
        }
    }
}
