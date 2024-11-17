
class LL{
    Node head;
    int size;

    LL(){
        this.size = 0;
    }
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //Add First
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    //Add Last
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // Delete First
    public void deleteFirst(){
        if(head == null){
            System.out.println("list is empty");
        }
        head = head.next;
        size--;
    }
    //Delete Last
    public void deleteLast(){
        if(head == null){
            System.out.println("list is empty");
        }
        size--;
        if(head.next == null){
            head = null;
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    //Print
    public void print(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+ "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public int getSize(){
        return size;
    }

    public void reverseIterate(){
        if(head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null){
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            //update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;  // because head is pointing to its next node, so make it null because we are reversing list
        head = prevNode;
    }

}

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("List");
        list.print();
        list.deleteFirst();
        list.deleteLast();
        list.print();
        System.out.println(list.getSize());
        list.reverseIterate();
        list.print();
    }
}