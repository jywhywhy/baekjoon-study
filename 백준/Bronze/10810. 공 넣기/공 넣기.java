import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n_m = sc.nextLine();
        String[] split = n_m.split(" ");
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= Integer.parseInt(split[0]); i++) {
            map.put(i, 0);
        }
        for (int i = 0; i < Integer.parseInt(split[1]); i++) {
            String s = sc.nextLine();
            String[] split1 = s.split(" ");
            for (int j = Integer.parseInt(split1[0]); j <= Integer.parseInt(split1[1]); j++) {
                map.put(j, Integer.parseInt(split1[2]));
            }
        }
        sc.close();
        for (Integer key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
    }
}
