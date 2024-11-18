import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine(); 

        int[] positions = new int[26];

        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1;
        }

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);   // 현재 문자
            int alphabetIndex = getAlphabetIndex(ch);

            if (positions[alphabetIndex] == -1) {
                positions[alphabetIndex] = i;
            }
        }

        for (int i = 0; i < positions.length; i++) {
            System.out.print(positions[i] + " ");
        }
    }

    public static int getAlphabetIndex(char ch) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        return alphabet.indexOf(ch); 
    }
}
