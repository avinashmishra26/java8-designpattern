package productFirm.binarytrees;

import java.util.Arrays;

/**
 * Created by avinash on 09/10/20.
 *
 * Write an algorithm to rotate a given linked list L counter clockwise by n nodes.

 For eg.
 Linked List = 10->20->30->40→50 ->60.

 and you have to rotate this linked list by 3 nodes.

 Output should be :  40 → 50->60->10->20→30.
 */
public class LinkedListRotate {

    public static void main(String[] args){

        LinkedList list = new LinkedList();
        list.displayAll();
        list.insert(new int[]{10,20,30,40,50,60});
        list.displayAll();
        list.rotate(3);
        System.out.println();
        list.displayAll();
    }
}



class LinkedList {
    Node head;
    Node prev;

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    void insert(int[] datas) {

        for(int i=0; i<datas.length ; i++){
            Node node = new Node(datas[i]);
            if(head==null){
                head=node;
            } else {
                prev.next = node;
            }
            prev = node;
        }
    }

    void displayAll(){
        Node traverse = head;

        while(traverse != null){

            System.out.print(traverse.data +" ->");
            traverse = traverse.next;
        }
    }

    void rotate(int numberOfNodes) {

        Node tempStart = head;
        Node traverse = head;
        Node prev = null;
        int i=0;
        boolean isRotate = false;


        while(traverse != null){
            if(i++==numberOfNodes) {
                prev.next =null;
                head = traverse;
                isRotate = true;
            }

            prev = traverse;
            traverse = traverse.next;
        }
        if(isRotate)
            prev.next = tempStart;

    }
}