import java.util.LinkedList;
import java.util.Scanner;

public class PhoneBookManager {
    public LinkNode head;
    public LinkNode tail;
    Scanner input;


    public PhoneBookManager(Scanner input) {
        this.input = input;
        head = null;
        tail = null;
    }

    public void add(String name, String phone, String address, String city) {
        LinkNode temp = head;
        if(head == null){
            head = new LinkNode(name, phone, address, city);
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new LinkNode(name, phone, address, city);
        }

    }

    public void remove(String name, String phone, String address, String city){
        LinkNode current = head;
        LinkNode prev = null;
        if (current.name.equals(name) && current.phone.equals(phone) && current.address.equals(address) && current.city.equals(city)) {
            head = current.next;
            return;
        }
        while(current != null && (!(current.name.equals(name)) || !(current.phone.equals(phone)) || !(current.address.equals(address)) || !(current.city.equals(city)))){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
    }

    public void printBook() {
        LinkNode current = head;
        while(current != null){
            System.out.println(current.name);
            System.out.println(current.phone);
            System.out.println(current.address);
            System.out.println(current.city);
            System.out.println();
            current = current.next;
        }



    }


}
