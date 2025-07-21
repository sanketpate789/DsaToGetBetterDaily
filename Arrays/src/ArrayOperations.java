import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            arr[i] = input.nextInt();
        }
        int sum=0;
        int agerage=0;
        int maxele = Integer.MIN_VALUE;
        for (int i=0;i<size;i++){
            sum+=arr[i];
            if (arr[i]>maxele){
                maxele=arr[i];
            }
        }
        agerage =sum/size;
        System.out.print(sum+" "+agerage+" "+maxele);

    }
}
