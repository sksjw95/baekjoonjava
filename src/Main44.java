/*import java.util.Scanner;

public class Main44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int arr[]= new int[N];
        double arr2[] = new double[N];
        double num =0;
        double sum =0;

        for(int i=0;i<N;i++){
            arr[i]= scanner.nextInt();
        }
        num=arr[0];
        for(int i=0; i<N;i++){
           
            if(arr[i]>num){
                num=arr[i];
            }
        }
        for(int i=0;i<N;i++){
            arr2[i]= (arr[i]/num)*100;
        }
        for(int i=0; i<N; i++){
            sum+=arr2[i];
        }
        System.out.println(sum/N);
    }
}*/
