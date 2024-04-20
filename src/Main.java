import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("xais edirik istediyiniz texti daxil edin");
        String text = scanner.nextLine();
        String terstext =tersineCevir(text);
        System.out.println("Metnin ters çevrilmiş hali: " + terstext);


    }
    public static String tersineCevir(String text) {
        StringBuilder tersText = new StringBuilder();
        for (int i = text.length() - 1; i >= 0; i--) {
            tersText.append(text.charAt(i));
        }
        return tersText.toString();
    }
}





