package ScratchLinked;
import java.io.*;

public class ScratchLinked<T>{


    Node<T> head; 

    private int length = 0;

    ScratchLinked() {this.head = null;}

    //Add node at end of the list
    public void add(T data){
        Node<T> temp = new Node<>(data);

        //if list does not exist yet
        if (this.head == null){
            head = temp;
        }
        //if the list does exist, add to end
        else {
            node<T> x = head;
            while (x.next != null){
                x = x.next;
            }
            x.next = temp;
        }
        length++;
    }

    //Add node at given position
    public void add(int position, T data){
        if (position > length){
            System.out.println("Position unavailable in linked list");
            return;
        }

        //if position is to replace the head node
        if (position == 1){
            //temporary node for traversal
            Node<T> temp = head;
            //set head to new data
            head = new Node<T>(data);
            //reconnect new head to old list
            head.next = temp;
            return;
        }

        //temporary node for traversal
        Node<T> temp = head;
        //dummy node to keep track of previous node
        Node<T> prev = new Node<T>(null);
        //iterate through list until specified position
        while (position - 1 > 0){
            //assign previous node
            prev = temp;
            //incrementing next node
            temp = temp.next;
            //decreasing position
            position--;
        }

        //previous node points to new data
        prev.next = new Node<T>(data);
        //connect to original next node
        prev.next.next = temp;

    }

    public void remove(){

    }

    public void clear(){

    }

    public void empty() {

    }

    public void length(){

    }
}