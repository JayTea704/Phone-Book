import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        PhoneBookManager book = new PhoneBookManager(input);
        boolean ask = true;
        while(ask) {

            book.ask();

            String ans = input.next();

            switch (ans) {
                case "a":
                    book.add();
                    break;
                case "r":
                    book.remove();
                    break;
                case "c":
                    book.change();
                    break;

                case "d":
                    book.printBook();
                    break;
                case "e":
                    ask = false;
                    break;
                default:
                    System.out.println();
                    System.out.println("Not an option. Please enter one of the operational keys keys");
                    System.out.println();

            }
        }

    }
}
