//Arif Afzal
//G(16)
public class BubbleSort {

     static void Bubble(int arr[]){
        int n=arr.length;
        int temp = 0;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                }
            }
        }
    }

    void printing(int arr[]){
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");

        }
    }


    public static void main(String[] args) {
        BubbleSort object=new BubbleSort();
        int arr[]={8,4,6,2,9,3,0,2,3,6,9,2,-1,4};
        object.Bubble(arr);

        System.out.println("Sorted Array by bubble sort");
       object.printing(arr);

    }
}


// Best case Time Complexity :- O(n)  { When Array is already Sorted}
// Worst case Time Complexity :- O(N²) { When Array is Reversely Sorted}