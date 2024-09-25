/*import java.util.Scanner;

public class Main37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int U = 0;
        int arr[]=new int[N];

        for(int i=0; i<N; i++){
            arr[i] = i+1;
        }
        for(int j=0; j<M; j++){
            int g = scanner.nextInt();
            int e = scanner.nextInt();
            U = arr[g-1];
            arr[g-1] = arr[e-1];
            arr[e-1] = U;
        }
        for(int p=0; p<N;p++){
            System.out.print(arr[p]+" ");
        }
    }
}*/
