import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            list.add(scanner.nextInt());
        }
        int max = list.get(0);
        int min = list.get(0);
        for (int num : list) {
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min+" "+max);
    }
}
