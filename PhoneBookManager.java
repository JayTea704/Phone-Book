import java.util.LinkedList;
import java.util.Scanner;

public class PhoneBookManager {
    public LinkedList<LinkNode> phoneBook;
    Scanner input;
    String name;


    public PhoneBookManager(Scanner input) {
        this.input = input;
        phoneBook = new LinkedList<>();
    }

    public void addList(String name, String phone, String address) {
        LinkNode node = new LinkNode();
        node.data = name;
        node.next = new LinkNode();
        node.next.data = phone;
        node.next.next = new LinkNode();
        node.next.next.data = address;
        phoneBook.add(node);
    }

    public void printBook(){
        for(int i = 0; i < phoneBook.size(); i++) {
            System.out.println("Name: " + phoneBook.get(i).data);
            System.out.println("Phone Number: " + phoneBook.get(i).next.data);
            System.out.println("Address: " + phoneBook.get(i).next.next.data);
            System.out.println();
        }

    }

}
