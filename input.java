import java.util.Scanner;

public class input {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = s.nextInt();
        System.out.println(age);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println(name);
    }
}
