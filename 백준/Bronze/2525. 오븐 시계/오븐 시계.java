import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour     = scanner.nextInt();
        int minute   = scanner.nextInt();
        int duration = scanner.nextInt();

        minute +=duration;
        hour += minute / 60;
        minute %=60;

        if(hour >=24){
            hour %=24;
        }

        System.out.println(hour+" "+minute);
    }
}
