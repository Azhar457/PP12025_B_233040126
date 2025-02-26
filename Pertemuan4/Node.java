package Pertemuan4;

class Node {
        double data;
        Node next;

        Node(double data2) {
            this.data = data2;
            this.next = null;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
}
