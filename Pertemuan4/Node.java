package Pertemuan4;

class Node {
        double data;
        Node next;

        Node(double data) {
            this.data = data;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
}
