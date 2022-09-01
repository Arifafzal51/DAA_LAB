import java.util.Scanner;

public class BinarySearch {

    public static  int Binarysearch(int arr[],int element){
        int first=0;
        int last=arr.length-1;

        while (first<=last){

            int mid=(first+last)/2;
            if(element==arr[mid]){
                return mid;
            }
            else if (element>arr[mid]){
                first=mid+1;

            }
            else{
                last=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int array[] = { 2, 4, 0, 1, 9 ,54,7,5,3,8,9 };
        int element= sc.nextInt();
        int res=Binarysearch(array,element);
        System.out.println(res);
    }
}
