import java.util.Scanner;

public class Print1ToA {
    public static void printNum(int N){
        if(N == 1) {
            System.out.print(N+" ");
            return;
        }
        printNum(N-1);
        System.out.print(N+" ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNum(n);
    }
}
