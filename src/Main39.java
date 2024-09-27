/*import java.util.ArrayList;
import java.util.Scanner;

public class Main39 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0; i<30;i++) {
            arr.add(i+1);
        }
        ArrayList<Integer> arr2 = new ArrayList<Integer>();
        for(int j=0;j<28;j++){
            arr2.add(scanner.nextInt());
        }
        for(int i=0;i<30;i++){
            //arr2.get(j);
            for(int j=0; j<28; j++){
                if(arr.get(i).equals( arr2.get(j))){
                    arr.remove(i);
                }
            }

        }
        for(int i=0; i<2;i++){
            System.out.println(arr.get(i));
        }


    }
}*/
