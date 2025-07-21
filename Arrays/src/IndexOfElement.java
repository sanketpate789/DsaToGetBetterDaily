import java.util.Scanner;

public class IndexOfElement {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N =input.nextInt();
        int X = input.nextInt();
        int[] arr = {2,1,3,1,1};
        for(int i=0;i<arr.length;i++){
            if (arr[i]==X){
                System.out.print(i+1+" ");
            }
        }
    }
}
