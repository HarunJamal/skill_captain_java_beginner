import java.util.Scanner;

public class NamePrint {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter age:");
        int age = input.nextInt();


        System.out.println("Hello, "+name+"! You are "+age+" years old.");


    }
}
