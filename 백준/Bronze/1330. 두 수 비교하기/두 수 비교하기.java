import java.util.Scanner;
class Main  {
    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        if (-10000 <= A && 10000<= B) {
            return; 
        }
        if (A>B){
            System.out.println(">");
        } else if (A<B){
            System.out.println("<");
        } else if (A==B){
            System.out.println("==");
        }
       scanner.close();
    }
}
