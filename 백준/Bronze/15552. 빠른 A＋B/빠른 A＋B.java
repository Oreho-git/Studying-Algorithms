import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.ArrayList;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int T = Integer.parseInt(reader.readLine().trim());
        if (T > 1000000) {
            return;
        }

        ArrayList<Integer> resultList = new ArrayList<>(T);

        for (int i = 0; i < T; i++) {
            String[] inputs = reader.readLine().split(" "); 
            int A = Integer.parseInt(inputs[0]);
            int B = Integer.parseInt(inputs[1]);
            resultList.add(A + B);
        }

        for (int result : resultList) {
            writer.write(result + "\n"); 
        }

        writer.flush(); 
        writer.close();
        reader.close();
    }
}
