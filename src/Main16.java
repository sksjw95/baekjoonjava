/*import java.util.Scanner;

public class Main16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M-45>0){
            System.out.println(H+" "+(M-45));
        }
        else if(M-45<0){
            if(H==0){
                H=23;
                M=(60+M)-45;
                System.out.println(H+" "+M);
                return;
            }
            M=(60+M)-45;

            System.out.println((H-1)+" "+M);
        }
        else if(M-45==0){
            if(H==0){
                H=0;
                M=0;
                System.out.println(H+" "+M);
                return;
            }
            else{
                M=0;
                System.out.println(H+" "+M);
            }
        }
    }
}*/
