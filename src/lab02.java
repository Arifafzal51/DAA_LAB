public class lab02 {
   static void loop(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i*i; j++) {
                for (int k = 0; k < n/2; k++) {
                    System.out.println("DAA");

                }

            }

        }

    }

    static void daa(int n){
        for (int i = 0; i < n; i=i+2) {
            System.out.println("DAA");
        }
    }

    public static void main(String[] args) {
        int n=90;
        loop(n);
        daa(n);

    }
}


//for loop
// i=1          i=2             i=3
// j=1          j=1,2,3,4       j=1,2,.......9
// k=n/2*1      k=n/2*4         k=n/2*9


       // Time Complexity O(n3)

//for daa
// log n