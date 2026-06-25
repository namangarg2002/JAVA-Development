class Node{
    int data;
    Node next;
}

public class LinkedList{
    Node head;

    public void insert(int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void insertAtStart(int data){
        // new Node element
        Node node = new Node();
        node.data = data;
        node.next = null;

        // concate newNode with head
        node.next = head;
        head = node;

    }

    public void insertAtIndex(int index, int data){
        if(index == 0){
            insertAtStart(data);
            return;
        }

        Node node = new Node();
        node.data = data;

        Node temp = head;

        for(int i=0; i<index-1; i++){
            if(temp == null){
                throw new IndexOutOfBoundsException();
            }

            temp = temp.next;
        }
        node.next = temp.next;
        temp.next = node;

    }

    public void deleteAtIndex(int index){

        if(head == null){
            throw new IndexOutOfBoundsException("List is empty");
        }
        if(index == 0){
            head = head.next;
        }else{
            Node temp = head;
            Node nodeToBeDeleted = null;
            for(int i=0; i<index-1; i++){
                if(temp == null){
                    throw new IndexOutOfBoundsException();
                }
                temp = temp.next;
            }

            if(temp.next == null){
                throw new IndexOutOfBoundsException();
            }

            nodeToBeDeleted = temp.next;
            temp.next = nodeToBeDeleted.next;
            nodeToBeDeleted.next = null;
        }
    }

    public void show(){
        Node temp = head;

        while(temp.next != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data + " ");

        System.out.println();
    }
}