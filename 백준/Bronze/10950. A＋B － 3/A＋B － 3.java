import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        ArrayList<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            resultList.add(A + B);
        }

        for (int z = 0; z < T; z++) {
            System.out.println(resultList.get(z));
        }
    }
}
