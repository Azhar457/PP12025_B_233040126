package Pertemuan5;

public class StrukturListTest {

    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        list.addHead(1);
        list.addHead(5);
        list.addHead(3);
        list.addHead(6);
        list.addHead(2);
        list.displayElement();
        list.removeHead();
        System.out.println();
        list.displayElement();
        list.removeTail();
        System.out.println();
        list.displayElement();
        list.removeTail();
        System.out.println();
        list.displayElement();
        
//        list.addHead(2);
//        list.addHead(9);
//        list.addHead(7);
//        list.displayElement();
//        list.removeHead();
//        System.out.println();
//        list.displayElement();
//        list.removeHead();
//        System.out.println();
//        list.displayElement();
//        list.removeHead();
//        System.out.println();
//        list.displayElement();

    }
}
