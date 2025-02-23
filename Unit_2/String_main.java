import java.util.Scanner;

public class String_main {
    public static void main(String[] args) {
        String data = "Darshan University";
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter search character:");
        char searchText = sc.next().charAt(0);
        for (int i = 0; i < data.length(); i++) {
            if (data.charAt(i) == searchText) {
                count++;
            }
        }
        System.out.println("The character " + searchText + " is present " + count + " times in the string");

        sc.close();

    }
}
