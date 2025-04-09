package Pertemuan3;

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

    
}