import java.util.Scanner;

public class ArrayProblem2 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int c=0;
        int size = input.nextInt();
        int g= input.nextInt();
        int[] arr = new int[size];
        for (int i=0;i< arr.length;i++){
            if (arr[i]>g){
                c++;
            }
        }
        System.out.println(c);
    }
}
