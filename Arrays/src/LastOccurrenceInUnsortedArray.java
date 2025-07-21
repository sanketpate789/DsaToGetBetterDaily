import java.util.Scanner;

public class LastOccurrenceInUnsortedArray {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int size = input.nextInt();
        int x = input.nextInt();
        int[] arr = new int[size];
        for (int i=0;i<size;i++){
            arr[i] = input.nextInt();
        }
        int lastoccured =-1;
        for (int i =0;i<size;i++){
            if (arr[i]==x){
                lastoccured=i;
            }
        }
        System.out.println(lastoccured);
    }
}
