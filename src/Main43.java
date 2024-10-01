/*import java.util.Scanner;

public class Main43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();

        int arr[] = new int[N];

        for(int i=0; i<N; i++){
            arr[i] =i+1;
        }

        for(int j=0; j<M; j++){
            int k = scanner.nextInt()-1;
            int f = scanner.nextInt()-1;
            while(k<f){
                int temp= arr[k];
                arr[k++]= arr[f];
                arr[f--]=temp;
            }
        }
        for(int i=0; i<N;i++){
            System.out.print(arr[i]+" ");
        }

    }
}*/
