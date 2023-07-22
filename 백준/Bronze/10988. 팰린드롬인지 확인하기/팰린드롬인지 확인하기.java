import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();
        String[] split = s.split("");
        String sR = "";
        for (int i = split.length - 1; i >= 0; i--) {
            sR += split[i];
        }
        if (s.equals(sR)) {
            System.out.print(1);
        }else {
            System.out.print(0);
        }
    }
}