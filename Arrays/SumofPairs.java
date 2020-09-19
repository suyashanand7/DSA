import java.util.*;
class SumofPairs{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Enter the Sum");
        int sum = sc.nextInt();
        int beg = 0;
        int end = n-1;
        while(beg<end){
            int abcd = arr[beg]+arr[end];
            // System.out.println("ABCD"+abcd);
            if (abcd == sum){
            System.out.println(arr[beg]+" "+arr[end]);
            beg++;
            end--;
            }
            else if(abcd < sum)
            beg++;
            else
            end --;
        }
    }
}