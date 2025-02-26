package Pertemuan4;

public class StrukturList {
    Node HEAD = null;

    public void addTail(int data) {
        Node curNode = null;
        Node posNode = null;
        Node newNode = new Node(data);
        if (isEmpty()) {
            HEAD = newNode;
        } else {
            curNode = HEAD;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(newNode);
        }
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void displayElement() {
        Node curNode = HEAD;
        while (curNode != null) {
            System.out.print(curNode.data + " ");
            curNode = curNode.getNext();
        }
    }
    
    public void addHead (int data){
        Node newNode = new Node(data);
        if (isEmpty()){
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }
    
    public void addMid(int data, int position) {
        Node newNode = new Node(data);
        
        if (head == null) {
            head = newNode;
            return;
        }
        
        if (position == 1) { // Tambah di awal
            newNode.next = head;
            head = newNode;
            return;
        }
        
        Node curNode = head;
        Node posNode = null;
        int i = 1;
        
        while (curNode != null && i < position) {
            posNode = curNode;
            curNode = curNode.next;
            i++;
        }
        
        if (posNode != null) {
            posNode.next = newNode;
            newNode.next = curNode;
        }
    }

    
}