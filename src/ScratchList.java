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
        if (position > length + 1){
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

    //to remove a node from the list
    public void remove(T key){
        //dummy node with null value
        Node<T> prev = new Node<T>(null);

        //dummy node pointing to the head Node
        prev.next = head;

        //next node points ahead of current Node
        Node<T> next = head.next;

        //Temporary node for traversal
        Node<T> temp = head;

        //Check whether node to be deleted exists or not
        boolean exists = false;

        //check if head node needs to be deleted
        if(head.data == key){
            head = head.next;
            //node to be deleted exists
            exists = true;
        }

        //iterate over linked list
        while (temp.next != null){
            //convert value to be compared using strings
            //using String1.equals(String2) method

            //comparing value of key and data 
            if (String.valueOf(temp.data).equals(String.valueOf(key))){
                //if node to be deleted is found, previous node now points to
                //next node skipping the current Node
                prev.next = next;
                exists = true;

                //if we find the node to be deleted, break the loop
                break;
            }

            //previous node now points to current one
            prev = temp;

            //Current node points to next Node
            temp = temp.next;

            //next node ponits to node ahead of current
            next = temp.next;

        }
        //check the last node
        if (!exists && String.valueOf(temp.data).equals(String.valueOf(key))){
            prev.next = null;
            exists = true;
        }

        //if node to be deleted exist
        if(exists){
            length--;
        }
        else{
            System.out.println("Key does not exist in linked list");
        }

    }

    public void clear(){

    }

    public void empty() {

    }

    public void length(){

    }
}