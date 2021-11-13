package edu.northeastern.mengyi;

public class LinkedList {

    public static Object obj = new Object();
    int size;
    Node head;

    public LinkedList() {
        size = 0;
        head = new Node(0);
    }

    public void addAtPosition(int index, int element){
        synchronized (obj){
            Node newNode = new Node(element);
            Node curNode = head, preNode = null;
            int position = 0;
            if(this.head == null){
                this.head = newNode;
                size ++;
                return;
            }
            else if(index == 0){
                head = newNode;
                newNode.next = curNode;
                size ++;
                return;
            }

            if(index > this.size() || index < 0) return;

            while(position < index - 1){
                curNode = curNode.next;
                position ++;
            }

            if(position == index - 1){
                newNode.next = curNode.next;
                curNode.next = newNode;
                size ++;
            }


        }
    }

    public void removeAtPosition(int index, int element){
        synchronized (obj){
            if(index > size() - 1 || index < 0) return;

            Node curNode = head, preNode = null;
            int position = 0;

            if(index == 0 && head.val == element){
                this.head = curNode.next;
                size --;
                return;
            }

            while(position != index){
                preNode =curNode;
                curNode = curNode.next;
                position ++;
            }
            if(curNode.val == element){
                preNode.next = curNode.next;
                size --;
                return;
            }
            else
                System.out.println("The element in this position is not matched.");


        }
    }

    public int getFirst(){
        synchronized (obj){
            return head.val;
        }
    }

    public int getLast(){
        synchronized (obj){
            Node tail = head;
            while(tail.next != null){
                tail = tail.next;
            }

            return tail.val;
        }
    }

    public int size(){
        synchronized (obj) {
            return size;
        }
    }
}