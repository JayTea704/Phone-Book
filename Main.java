import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        PhoneBookManager book = new PhoneBookManager(input);
        boolean ask = true;
        while(ask) {
            System.out.println("add contact (a)");
            System.out.println("remove contact (r)");
            System.out.println("change contact (c)");

            String ans = input.next();

            if (ans.equals("a")){
                System.out.println("Name");
                String name = input.next();
                System.out.println("Phone");
                String phone = input.next();
                System.out.println("address");
                String address = input.next();
                book.addList(name, phone, address);
                book.printBook();
            }

            else{
                break;
            }
        }

    }
}
