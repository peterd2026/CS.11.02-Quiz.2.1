import javax.sound.sampled.Line;
import java.util.Scanner;

/*I have neither given nor received unauthorized aid on these pieces of work*/
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int numOne = scanner.nextInt();

        System.out.println("please enter a second number");
        int numTwo = scanner.nextInt();

        int resultOne = add(numOne, numTwo);
        System.out.println("The result is " + resultOne);
    }

    public static int add(int numOne, int numTwo) {
        return numOne + numTwo;
    }
    Public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter your name");
        String name = scanner.nextLine();
    }
    public static String greeting(String name){
        return "Bonjour, "+ name + "!";
    }

    public static void main(String[] args);{
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter what you want to print");
        String printMe = scanner.next();
    }

    public static String printing(String printMe){
        return printMe
    }

}
