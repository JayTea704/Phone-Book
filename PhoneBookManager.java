import java.util.LinkedList;
import java.util.Scanner;

public class PhoneBookManager {
    public LinkNode front;
    Scanner input;


    public PhoneBookManager(Scanner input) {
        this.input = input;
        front = null;
    }

    public void add(String name, String phone, String address, String city) {
        LinkNode temp = front;
        LinkNode added;
        if(front == null){
            front = new LinkNode(name, phone, address, city);
            added = front;
        }
        else{
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new LinkNode(name, phone, address, city);
            added = temp.next;

        }
        System.out.println();
        System.out.println("Added contact:");
        System.out.println();
        System.out.println("Name: " + added.name);
        System.out.println("Phone: " + added.phone);
        System.out.println("Address: " + added.address);
        System.out.println("City: " + added.city);
        System.out.println();

    }

    public void remove(String name, String phone, String address, String city){
        LinkNode current = front;
        LinkNode prev = null;
        if (current.name.equals(name) && current.phone.equals(phone) && current.address.equals(address) && current.city.equals(city)) {
            front = current.next;
            return;
        }
        while(current != null && (!(current.name.equals(name)) || !(current.phone.equals(phone)) || !(current.address.equals(address)) || !(current.city.equals(city)))){
            prev = current;
            current = current.next;
        }
        prev.next = current.next;
        System.out.println();
        System.out.println("Contact removed.");
    }

    public void change(String name, String phone, String address, String city){
        System.out.println("What do you want to change");
        System.out.println("name (n), phone (p), address (a), or city (c)");
        String ans = input.next();
        LinkNode current = front;
        while(current != null && (!(current.name.equals(name)) || !(current.phone.equals(phone)) || !(current.address.equals(address)) || !(current.city.equals(city)))){
            current = current.next;
        }
        if(ans.equals("n")){
            System.out.println("What would you like to change it to");
            ans = input.next();
            if (current.name.equals(name) && current.phone.equals(phone) && current.address.equals(address) && current.city.equals(city)) {
                current.name = ans;
            }
        }
        else if (ans.equals("p")){
            System.out.println("What would you like to change it to");
            ans = input.next();
            current.phone = ans;
        }
        else if (ans.equals("a")){
            System.out.println("What would you like to change it to");
            ans = input.next();
            current.address = ans;
        }
        else if (ans.equals("c")){
            System.out.println("What would you like to change it to");
            ans = input.next();
            current.city = ans;
            System.out.println();
            System.out.println("Changed contact:");
            System.out.println();
            System.out.println("Name: " + current.name);
            System.out.println("Phone: " + current.phone);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println();
        }
    }

    public void printBook() {
        System.out.println();
        System.out.println("Phone Book:");
        System.out.println();
        LinkNode current = front;
        while(current != null){
            System.out.println("Name: " + current.name);
            System.out.println("Phone: " + current.phone);
            System.out.println("Address: " + current.address);
            System.out.println("City: " + current.city);
            System.out.println();
            current = current.next;
        }



    }


}
