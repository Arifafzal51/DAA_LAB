import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 2, 4, 0, 1, 9 };

        int element= sc.nextInt();


        for (int i = 0; i < arr.length-1; i++) {

            if(arr[i]==element){
                System.out.println(i);

            }
        }
        System.out.println(-1);

    }
}
