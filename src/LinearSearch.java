//Arif Afzal G1
//201500139


import java.util.Scanner;

public class LinearSearch {
    public static int linearsearch(int arr[],int element){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return i;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[] = { 2, 4, 0, 1, 9 ,4,7,5,3,8,9, };
        int element= sc.nextInt();
        int res=linearsearch(arr, element);
        System.out.println(res);


    }
}
