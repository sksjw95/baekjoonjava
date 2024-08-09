/*import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        // 472 입력
        // 385 입력
        // 1.두 번째 입력값을 10으로 나눈 나머지를 구한다.
        // 1번의 값 * 472
        // 2. 두번째 입력값을 10으로 나눈 몫을 구하고
        // 그 몫을 10으로 나눈 나머지를 구한다.
        // (2번 결과값 * 472) * 10
        // 3. 두번째 입력값을 100으로 나눈다.
        // (3번의 몫 * 472) * 100
        // 1,2,3 전부 다 더함
        // 최종 결과값 출력
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = b%10;
        System.out.println(c*a);
        int c1 = c*a;
        int d = (b/10)%10;
        System.out.println(d*a);
        int d1 = (d*a)*10;
        int e = b/100;
        System.out.println(e*a);
        int e1 = (e*a)*100;
        System.out.println(e1+d1+c1);


    }
}*/