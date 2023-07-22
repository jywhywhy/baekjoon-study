import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String[] split = s.split("");
        System.out.print(split[sc.nextInt()-1]);
        sc.close();
    }
}