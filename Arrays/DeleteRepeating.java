import java.util.*;
class DeleteRepeating
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter elements");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d=0;
        for(int i=1;i<n;i++){
            if(arr[d]!=arr[i]){
                d++;
                arr[d] = arr[i];
            }
        }
        for(int i=0;i<=d;i++)
        System.out.print(arr[i]);
    }
}