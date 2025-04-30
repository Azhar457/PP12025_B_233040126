package Main;

import Pertemuan7.*;

public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList list = new StrukturList();
        // list.addTail(5);
        // list.addTail(4);
        // list.addTail(6);
        // list.displayElement();
        // list.findList(6);

        // list.addHead(6);
        // list.addHead(7);
        // list.addTail(2);
        // list.addTail(3);
        // list.addMid(4, 3);
        // list.displayElement();
        // list.sizeList();

        list.addHead(7);
        list.addHead(3);
        list.addHead(4);
        list.addTail(8);
        list.addTail(1);
        list.addTail(9);
        list.displayElement();
        list.removeHead();
        list.removeTail();
        list.removeHead();
        list.removeTail();
        list.removeHead();
        list.removeTail();
        list.displayElement();
    }
}