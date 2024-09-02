/*import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        if(B+C==60){

            A=A+1;
            if(A==24){
                A=0;
                B=0;
            }
            else{
                B=0;
            }
            System.out.println(A+" "+B);
        }
        else if(B+C>60){
            A=((B+C)/60)+A;
            B=(B+C)%60;
            if(A==24){
                A=0;
            }
            else if(A>24){
                A=A-24;
            }
            System.out.println(A+" "+B);
        }
        else{
            System.out.println(A+" "+(B+C));
        }
    }
}*/
