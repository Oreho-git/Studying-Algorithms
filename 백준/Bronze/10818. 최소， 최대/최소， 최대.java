import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt(); // 입력 개수
        if (N <= 0) {
            System.out.println("0 0");
            return;
        }

        int min = Integer.MAX_VALUE; // 최솟값 초기화
        int max = Integer.MIN_VALUE; // 최댓값 초기화

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }

        System.out.println(min + " " + max);
    }
}
