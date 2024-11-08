import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i=0; i<N; i++){

            for (int T=N-1; T>i; T--){
                System.out.print(" ");
            }

            for (int j =0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
