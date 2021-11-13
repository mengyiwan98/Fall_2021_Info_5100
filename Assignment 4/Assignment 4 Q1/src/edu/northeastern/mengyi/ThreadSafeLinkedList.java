package edu.northeastern.mengyi;

public class ThreadSafeLinkedList implements Runnable{

    LinkedList list = new LinkedList();

    @Override
    public void run() {
        synchronized (LinkedList.obj){
            list.addAtPosition(0,1);
            list.addAtPosition(0,2);
            list.addAtPosition(1,3);
            list.addAtPosition(1,4);
            list.addAtPosition(0,5);

            Node curr = list.head;
            while(curr != null){
                System.out.print(curr.val);
                curr = curr.next;
            }
            System.out.println();

            System.out.println("Size: " + list.size());

            list.removeAtPosition(4,1);
            list.removeAtPosition(0,5);

            curr = list.head;
            while(curr != null){
                System.out.print(curr.val);
                curr = curr.next;
            }
            System.out.println();


            System.out.println("Size: " + list.size());

            System.out.println(list.getFirst());
            System.out.println(list.getLast());
        }
    }
}

